# Lab 45 — AI IaC review record

## Contract (fill first)

- Allowed environments: `dev` | `test` | `staging` (no prod apply)
- Forbidden: public DB, `0.0.0.0/0` on DB/SSH, secrets in Git, unpinned providers
- Laptop path: `null_resource` only — do not apply to Lab 42 k3d

## Prompts used (summarized) — entry `lab45-001`

TODO(lab45): Paste constrained prompts (no secrets).

## AI suggestions accepted

| Item | Why accepted |
| ---- | ------------ |
| TODO | |

## AI suggestions rejected or hardened

| Item | Risk | Human change |
| ---- | ---- | ------------ |
| TODO(lab45): e.g. public DB | Exposure | Force private subnet / no 0.0.0.0/0 |

## Validation evidence

- `terraform fmt` / `init -backend=false` / `validate` (**no** `-var`): TODO
- `terraform plan -var=environment=dev -var=db_password=unused-local`: TODO
- Ansible `--syntax-check` from lab root **or** residual risk (Windows): TODO

## Residual risks

TODO(lab45): Owners + expiry. No customer PII in IaC.
