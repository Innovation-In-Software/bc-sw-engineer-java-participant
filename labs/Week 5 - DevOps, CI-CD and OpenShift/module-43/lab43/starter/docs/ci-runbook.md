# Lab 43 — CI runbook

## Two folders

Work in **`java-bootcamp`**. Workflow file: **`.github/workflows/crm-ci.yml`** at the repo root (not under `examples/lab43-crm/.github/`).

## Pipeline policy

| Trigger | Jobs | Notes |
| ------- | ---- | ----- |
| Pull request | verify | Fast feedback; no `crm-jar` |
| `main` push | verify + package | Immutable JAR + checksum |
| Tag `v*` | verify + package | Release candidate identity |
| Deploy | none | Lab 44 |

## Secrets / variables

TODO(lab43): List GitHub Secrets / Variables (**names only**). Never paste values.

Suggested names: `NVD_API_KEY` (optional scan). Registry tokens wait for Lab 44.

## Re-run failed verify

1. Open Actions → failed run
2. TODO(lab43): Re-run if flake; fix locally if tests failed
3. Confirm Surefire artifact uploaded (`if: always()`)
4. Local equivalent: `mvn -B -ntp clean verify` from `examples/lab43-crm`

## Failure experiment (safe)

TODO(lab43): Break **one existing unit test** (not `anonymousReadIs401` — this CRM has no Spring Security) → red verify → restore → green.

## Artifact identity for Lab 44

- JAR + `SHA256SUMS` + `GITHUB_SHA` from artifact **`crm-jar`**
- Produced on `main` / `v*` only
- Lab 44 must **download** this artifact — do not `mvn package` again
