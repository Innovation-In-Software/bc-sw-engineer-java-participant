# Lab 45: Infrastructure as Code with AI Assistance — Northstar CRM Stack Sketches — macOS

**OS:** macOS  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** macOS Terminal (zsh)  
**Stack hint:** Terraform 1.5+ · optional Ansible · IntelliJ  
**Full lab steps:** [LAB-45-GUIDE.md](LAB-45-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [Windows guide](LAB-45-WINDOWS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)  
**Two folders:** [Clone + own repo](../../../CLONE-AND-OWN-REPO-GUIDE.md)


## Prerequisites (macOS)

- [Lab 0 (macOS)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-MACOS.md) complete (Git; JDK/Maven not required for this lab)
- IntelliJ — open **`~/java-bootcamp`**, not the course clone
- Terraform **1.5+** on PATH
- Ansible optional (`brew install ansible` if you want a live syntax-check)

## Paths (macOS)

| Item | Path |
| ---- | ---- |
| Course clone (read GUIDE / starter) | `~/bc-sw-engineer-java-participant/` |
| Your repo (write / run / commit / push) | `~/java-bootcamp` |
| This lab IaC | `~/java-bootcamp/examples/lab45-crm` |
| Evidence / screenshots | `~/java-bootcamp/notes/screenshots/lab-45` |
| Shell | macOS Terminal inside IntelliJ |

```bash
cd ~/java-bootcamp
mkdir -p notes/screenshots/lab-45
cd examples/lab45-crm
```

### Commands this lab typically uses

**Do not** `terraform apply`. **Do not** put `-var` on `validate`.

```bash
cd ~/java-bootcamp/examples/lab45-crm/infra/terraform
terraform version
terraform fmt -recursive
terraform init -backend=false
terraform validate
terraform plan -var='environment=dev' -var='db_password=unused-local'
cd ../..
# Optional:
ansible-playbook --syntax-check -i inventory.example.yml infra/ansible/site.yml
```

Same verification notes as Windows (2026-08-22): copy **starter** (not Lab 44/42), `validate` has **no** `-var`, null-sketch `plan` needs no cloud, Ansible missing is residual risk. Details: [LAB-45-WINDOWS.md](LAB-45-WINDOWS.md) and [LAB-45-GUIDE.md](LAB-45-GUIDE.md).

### If it fails

| Symptom | Fix |
| --- | --- |
| `flag provided but not defined: -var` | Drop `-var` from `validate` |
| Copied Lab 44 / Lab 42 | Copy **starter** |
| Ansible not found | Residual risk in the review doc |
| Work ended up in the course clone | Move to `~/java-bootcamp` |


## Do the lab

Complete every step in **[LAB-45-GUIDE.md](LAB-45-GUIDE.md)**. GUIDE paths already use `~/java-bootcamp`.

## Evidence / screenshots

Save under `~/java-bootcamp/notes/screenshots/lab-45`. Redact account IDs and keys.

## Pass criteria

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Workspace `~/java-bootcamp` open in IntelliJ | Pass / Fail |
| 2 | IaC under `examples/lab45-crm` (starter, not Lab 44) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |
| 5 | Screenshots under `notes/screenshots/lab-45/` | Pass / Fail |
