# Lab 45: Infrastructure as Code with AI Assistance — Northstar CRM Stack Sketches — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** Terraform 1.5+ · optional Ansible · IntelliJ  
**Full lab steps:** [LAB-45-GUIDE.md](LAB-45-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [macOS guide](LAB-45-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)  
**Two folders:** [Clone + own repo](../../../CLONE-AND-OWN-REPO-GUIDE.md)


## Prerequisites (Windows)

- [Lab 0 (Windows)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) complete (Git; JDK/Maven not required for this lab)
- IntelliJ — open **`%USERPROFILE%\java-bootcamp`**, not the course clone
- Terraform on PATH (this laptop: **1.9.8** in `%USERPROFILE%\bin`)

## Paths (Windows)

| Item | Path |
| ---- | ---- |
| Course clone (read GUIDE / starter) | `%USERPROFILE%\bc-sw-engineer-java-participant\` |
| Your repo (write / run / commit / push) | `%USERPROFILE%\java-bootcamp` |
| This lab IaC | `%USERPROFILE%\java-bootcamp\examples\lab45-crm` |
| Evidence / screenshots | `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-45` |
| Shell | Windows PowerShell inside IntelliJ |

```powershell
cd $env:USERPROFILE\java-bootcamp
New-Item -ItemType Directory -Force -Path notes\screenshots\lab-45 | Out-Null
cd examples\lab45-crm
```

### Commands this lab typically uses

**Do not** `terraform apply`. **Do not** put `-var` on `validate`. Quote every `-var` in PowerShell.

```powershell
$env:Path = "$env:USERPROFILE\bin;" + $env:Path
cd $env:USERPROFILE\java-bootcamp\examples\lab45-crm\infra\terraform
terraform version
terraform fmt -recursive
terraform init -backend=false
terraform validate
terraform plan -var='environment=dev' -var='db_password=unused-local'
```

Verified on this laptop (2026-08-22), Terraform **1.9.8**:

- Copy **starter** from the course clone into `examples\lab45-crm`. Do **not** copy Lab 44 CRM or Lab 42 YAML. Do not grade files left under `labs\`.
- `hashicorp/null` **3.2.x** via `init -backend=false`. `validate` → Success **with no flags**. `plan` on the null sketch → **1 to add, 0 to destroy** (no cloud).
- `terraform validate -var=…` → `flag provided but not defined: -var`.
- **`ansible-playbook` is not installed** on this PATH. Timed path: record residual risk in `docs/ai-iac-review.md`. Syntax-check, if you install Ansible later, must run from the **lab root** (`-i inventory.example.yml infra/ansible/site.yml`).
- Allowed `environment`: **dev / test / staging**. Do not apply to Lab 42 k3d (`crm-training`).

### If it fails

| Symptom | Fix |
| --- | --- |
| `flag provided but not defined: -var` | Drop `-var` from `validate`; pass it on `plan` |
| Copied Lab 44 / Lab 42 | Copy **starter** |
| Ansible not found | Residual risk is acceptable on Windows |
| Work ended up in the course clone | Move to `java-bootcamp` |
| PowerShell eats `-var=…` | Quote the whole `-var='environment=dev'` |


## Do the lab

Complete every step in **[LAB-45-GUIDE.md](LAB-45-GUIDE.md)**. Wherever the GUIDE shows `~/java-bootcamp`, use `%USERPROFILE%\java-bootcamp`.

## Evidence / screenshots

Save under `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-45`. Redact account IDs and keys.

## Pass criteria

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Workspace `%USERPROFILE%\java-bootcamp` open in IntelliJ | Pass / Fail |
| 2 | IaC under `examples/lab45-crm` (starter, not Lab 44) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |
| 5 | Screenshots under `notes/screenshots/lab-45/` | Pass / Fail |
