# Dependency-Check plan

- Profile: `-Psecurity-scan`
- Plugin version pin: **10.0.4**
- Fail CVSS threshold: **7** (do not lower)
- Reports: HTML+JSON (gitignore bulky HTML + `dependency-check-data/`)
- NVD key: env + `-DnvdApiKey` only; 403 without a key
- Work in `java-bootcamp/examples/lab40-crm` (not the course clone)
