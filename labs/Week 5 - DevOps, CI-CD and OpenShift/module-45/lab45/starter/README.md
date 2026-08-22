# Lab 45 starter — timed path (~45 minutes)

**Theme:** Terraform + Ansible sketches — AI draft, human review, no secrets in Git

## Two folders

| Folder | You… |
| ------ | ---- |
| **Course clone** (this `starter/` directory) | Read / copy **from** here |
| **`java-bootcamp`** | Copy **this starter** to `examples/lab45-crm`, fill TODOs, commit, push |

Do **not** grade work inside the course `labs/` tree. IntelliJ stays on `java-bootcamp`. Starter is **IaC**, not a Spring app. **Do not copy Lab 44** (Maven CRM) or **Lab 42** (k8s YAML) into this folder.

## Activity card

| | |
| --- | --- |
| **Checkpoint** | **E** |
| **Must prove** | `validate` (no `-var`) · `plan` read · no secrets · AI review ≥1 harden · Ansible syntax **or** residual risk |
| **Hard gate** | Pre-lab Pass · no public DB · no unapproved `apply` |

## Copy into your workspace

**Windows (PowerShell):**

```powershell
$jb = "$env:USERPROFILE\java-bootcamp"
$courseLab45 = "$env:USERPROFILE\bc-sw-engineer-java-participant\labs\Week 5 - DevOps, CI-CD and OpenShift\module-45\lab45"

New-Item -ItemType Directory -Force -Path "$jb\examples\lab45-crm","$jb\notes\screenshots\lab-45" | Out-Null
Copy-Item -Recurse -Force "$courseLab45\starter\*" "$jb\examples\lab45-crm\"
cd "$jb\examples\lab45-crm"
```

**macOS / Linux:**

```bash
JB=~/java-bootcamp
COURSE_LAB45=~/bc-sw-engineer-java-participant/labs/Week\ 5\ -\ DevOps,\ CI-CD\ and\ OpenShift/module-45/lab45

mkdir -p "$JB/examples/lab45-crm" "$JB/notes/screenshots/lab-45"
cp -R "$COURSE_LAB45/starter/." "$JB/examples/lab45-crm/"
cd "$JB/examples/lab45-crm"
```

Then fill the contract and run Terraform. See [LAB-45-GUIDE.md](../LAB-45-GUIDE.md) Step 1–5.

## 45-minute checklist

- [ ] Work is in `java-bootcamp/examples/lab45-crm` (starter, not course `labs/`)
- [ ] Complete TODOs in `infra/terraform/*.tf` (pinned providers, `environment` in dev/test/staging)
- [ ] Fill `terraform.tfvars.example` (placeholders only)
- [ ] Draft idempotent `infra/ansible/site.yml` + root `inventory.example.yml`
- [ ] `terraform fmt` / `init -backend=false` / `validate` / `plan` (no apply)
- [ ] Record AI corrections in `docs/ai-iac-review.md` (`lab45-001`)

## Smoke test

From **`java-bootcamp/examples/lab45-crm/infra/terraform`**:

```powershell
terraform fmt -recursive
terraform init -backend=false
terraform validate
terraform plan -var='environment=dev' -var='db_password=unused-local'
```

Optional Ansible from **lab root**. Evidence under `~/java-bootcamp/notes/screenshots/lab-45/` (no state secrets).

## Timed-path Pass criteria

| Criterion | Pass / Fail |
| --------- | ----------- |
| Work is in `java-bootcamp/examples/lab45-crm` | Pass / Fail |
| Providers pinned; `validate` succeeds **without** `-var` | Pass / Fail |
| `plan` read (null sketch: 1 add); no apply | Pass / Fail |
| No secrets in `.tf` / tfvars.example | Pass / Fail |
| AI review documents ≥1 rejection/hardening | Pass / Fail |
| Ansible syntax-check **or** residual risk recorded | Pass / Fail |

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| `validate -var` fails | `validate` takes no `-var` |
| Copied Lab 44 / 42 | Copy **this starter** |
| No cloud auth | Stay on `null_resource` |
| AI public exposure | Reject; tighten contract |
| Accidental local state | Delete; gitignore on **java-bootcamp** |
