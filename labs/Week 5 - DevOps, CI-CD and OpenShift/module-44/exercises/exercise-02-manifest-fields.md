# Exercise 2 — Sketch Artifact Manifest

## Activity card

| | |
| --- | --- |
| **Time** | 10–12 minutes |
| **Checkpoint** | **A** (after slides 122–127) |
| **Deliverable** | `notes/lab44-manifest-fields.md` |
| **Fixtures** | CUS-1001/CUS-1002 synthetic · Lab 43 `SHA256SUMS` · image digest optional |

### What you will learn

List immutable identity fields: version, commit, **required** `jarSha256` from Lab 43, optional image digest, prior known-good.

### Enterprise context

Promote by digest—not floating :latest. Env secrets stay outside the artifact.

### Predict

Which field proves staging and prod candidates are the same bits if you never pushed GHCR?

### Debug

Manifest with passwords inside JSON — gate fail?

### Troubleshooting

| Symptom | Fix |
| --- | --- |
| Using only :latest or a fake GHCR digest | Pin **`jarSha256`** from Lab 43 `SHA256SUMS`; leave `imageDigest` null until you push |
| Secrets in artifact | Keep config/secrets in env, not JAR |

**Module 44** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Deliverable

**Submit only** the file(s) below (not the graded lab).

| Item | Path (under `examples/module-44-exercises/`) |
| ---- | --------------------------------------------- |
| Your notes file | `notes/lab44-manifest-fields.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 44 — Sketch Artifact Manifest

## Step 1 — Fields

semver, git_sha, **required** jar_sha256 (from Lab 43 `SHA256SUMS`, not a local rebuild), optional image_digest (null if never pushed), known_good_previous, pipeline_run_url.

## Step 2 — Check the reference

Prod candidate must match staging **`jarSha256`** exactly. Do not invent `ghcr.io/…@sha256:…`.

## Step 3 — Sample JSON

Write a JSON stub with placeholder `jarSha256`, `imageDigest: null`, and version `1.4.0-rc.1`.

## Step 4 — Rollback target

Add `known_good_previous` example `1.3.2` + digest placeholder.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

Then follow **Steps** to create your own file.

## Steps

### Step 1 — Create the notes file

From `examples/module-44-exercises/`, create `notes/` if needed, then create `notes/lab44-manifest-fields.md`.

### Step 2 — Paste and complete this template

```markdown
# Lab 44 — Sketch Artifact Manifest

## Step 1 — Fields

semver, git_sha, **required** jar_sha256 (from Lab 43 `SHA256SUMS`, not a local rebuild), optional image_digest (null if never pushed), known_good_previous, pipeline_run_url.

## Step 2 — Check the reference

Prod candidate must match staging **`jarSha256`** exactly. Do not invent `ghcr.io/…@sha256:…`.

## Step 3 — Sample JSON

Write a JSON stub with placeholder `jarSha256`, `imageDigest: null`, and version `1.4.0-rc.1`.

## Step 4 — Rollback target

Add `known_good_previous` example `1.3.2` + digest placeholder.

## Scope
Pre-lab only — do not finish the full graded lab in this exercise.
```

### Step 3 — Self-check

Confirm fixtures if used: Amina `CUS-1001`/`ACTIVE`, Ravi `CUS-1002`/`PROSPECT`, correlation `lab-request-001`. Replace every `_____` before Pass.

## Expected result

Manifest stub with previous known-good pointer in `notes/lab44-manifest-fields.md`.

## If it fails

| Problem | Fix |
| --- | --- |
| No file / wrong name | Must be `notes/lab44-manifest-fields.md` |
| Leaving blanks or skipping steps | Complete every step before claiming Pass |
| Starting the full lab mid-exercise | Finish pre-lab notes first, then open Lab 44 |

## Pass criteria

Self-check before marking Pass:

- [ ] File exists at `notes/lab44-manifest-fields.md`
- [ ] Required fields listed
- [ ] JSON stub written
- [ ] Rollback target included

