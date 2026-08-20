# Lab 40 — Security assessment

**App:** Northstar CRM (`lab40-crm`)  
**Fixtures:** `CUS-1001`, `CUS-1002`, correlation `lab-request-001`  
**Repo:** `java-bootcamp/examples/lab40-crm` (not the course clone)  
**Scan command:** `mvn -B -Psecurity-scan dependency-check:check` + `-DnvdApiKey` from env + `-DdataDirectory` (plugin **10.0.4**)

## Summary

TODO(lab40): One-paragraph executive summary (no secrets).

## Before / after

| Item | Before | After |
| ---- | ------ | ----- |
| High findings (≥ CVSS 7) | TODO | TODO |
| Remediation | — | TODO(lab40): smallest fix + regression test |
| Suppressions | 0 | TODO(lab40): count + expiry |

## Residual risks

| Risk | Severity | Owner | Expiry | Acceptance |
| ---- | -------- | ----- | ------ | ---------- |
| TODO(lab40) | | | | |

## Evidence paths

- HTML report: `target/dependency-check-report.html` (sanitized copy in notes)
- CSV: `docs/security-findings.csv`
