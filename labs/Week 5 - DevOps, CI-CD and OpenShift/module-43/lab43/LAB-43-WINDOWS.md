# Lab 43: GitHub CI/CD Pipeline for the CRM — Northstar Delivery Gates — Windows

**OS:** Windows  
**Primary IDE:** IntelliJ IDEA Community Edition  
**Optional IDE:** VS Code  
**Shell:** Windows PowerShell  
**Stack hint:** JDK 21 · Maven · Docker as assigned · kubectl + kubeconfig · GitHub Actions · IntelliJ  
**Full lab steps:** [LAB-43-GUIDE.md](LAB-43-GUIDE.md)  
**Pre-lab exercises:** [`../exercises/EXERCISES-INDEX.md`](../exercises/EXERCISES-INDEX.md)  
**Other OS:** [macOS guide](LAB-43-MACOS.md) · [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md)


## Prerequisites (Windows)

- [Lab 0 (Windows)](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/module-00/lab0/LAB-0-WINDOWS.md) complete (JDK 21, Maven when needed, Git)
- IntelliJ with **Project SDK 21** (open/run steps: [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md))

## Paths (Windows)

| Item | Windows |
| ---- | ------- |
| Workspace (open in IDE) | `%USERPROFILE%\java-bootcamp` |
| This lab project | `%USERPROFILE%\java-bootcamp\examples\lab43-crm` |
| Evidence / screenshots | `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-43` |
| Shell | Windows PowerShell inside IntelliJ |
| Path style | Backslashes; quote paths with spaces |

```powershell
cd $env:USERPROFILE\java-bootcamp
# Lab 0 layout: evidence at workspace root; code under examples/
New-Item -ItemType Directory -Force -Path notes\screenshots\lab-43 | Out-Null
cd examples\lab43-crm
```

### Commands this lab typically uses

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\lab43-crm
mvn -B clean verify
mvn -B "-DskipTests" package
Get-FileHash .\target\lab43-crm-0.0.1-SNAPSHOT.jar -Algorithm SHA256
```

Verified on this laptop (2026-08-11), Temurin 21.0.11, Maven 3.9.9, PostgreSQL 16.14 `crm_lab43`:

- Copy Lab 41 → `lab43-crm`. Isolated DB **`crm_lab43`**. ITs read `SPRING_DATASOURCE_URL` so GitHub Actions can point at a **postgres:16** service.
- `mvn -B clean verify` → **Tests run: 7**. Do **not** use `-DskipTests` on verify.
- Failure experiment: flip `anonymousReadIs401` to `isOk` → expected 200 but was 401 → **BUILD FAILURE**. Restore `isUnauthorized`.
- Package SHA-256 (this laptop): `62816E151CA912DEF43C7514C4D4A9BDADD89A2F31D2EC5DB730EE9569EE08A6`.
- Workflow file is `examples/lab43-crm/.github/workflows/ci.yml`. GitHub only auto-runs workflows from the **repository root** — promote/copy to a CRM-only repo or add a root workflow with `working-directory` to get a live Actions run.
- Quote Maven `-D…` in PowerShell.

## Do the lab

Complete every step in **[LAB-43-GUIDE.md](LAB-43-GUIDE.md)**. Wherever the GUIDE shows `~/java-bootcamp`, use `%USERPROFILE%\java-bootcamp`.  
Open/run IntelliJ steps are the same every lab — see [IDE conventions](../../../Week%201%20-%20Java%20and%20JVM%20Foundations/_IDE-CONVENTIONS.md).

## Evidence / screenshots

Save under `%USERPROFILE%\java-bootcamp\notes\screenshots\lab-43`. Capture IntelliJ (project tree + Run/Terminal). Redact secrets.

## Pass criteria

_Mark **Pass** or **Fail** in your lab notes._

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Workspace `%USERPROFILE%\java-bootcamp` open in IntelliJ with SDK **21** | Pass / Fail |
| 2 | Lab project under `examples/lab43-crm` as in [LAB-43-GUIDE.md](LAB-43-GUIDE.md) | Pass / Fail |
| 3 | GUIDE deliverables / checkpoints complete | Pass / Fail |
| 4 | Commands above succeed (or as the GUIDE specifies) | Pass / Fail |
| 5 | Screenshots (if required) under `notes/screenshots/lab-43/` | Pass / Fail |
