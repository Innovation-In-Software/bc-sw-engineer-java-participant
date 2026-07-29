# Exercise 2 — Sketch Artifact Manifest

**Module 44** · Documentation exercise · [setup + file names](EXERCISES-INDEX.md)

## Goal

Create `notes/lab44-manifest-fields.md` — list fields for `artifact-manifest.json` without inventing real digests.

## Deliverable

**Submit only** the file(s) in the table below (not the full graded lab).

**Submit only** the file(s) in the table below (not the full graded lab).

| Item | Path (under `examples/module-44-exercises/`) |
| ---- | --------------------------------------------- |
| Guide | `exercises/exercise-02-manifest-fields.md` (this file in the course repo) |
| Your notes file | `notes/lab44-manifest-fields.md` |

## Worked example (read first)

Here is the shape of a complete answer for this exercise. Adapt the content — do not leave blanks.

```markdown
# Lab 44 — Sketch Artifact Manifest

## Step 1 — Fields

semver, git_sha, jar_sha256, image_digest, built_at, pipeline_run_url.

## Step 2 — Check the reference

Prod candidate must match staging digest exactly.

## Step 3 — Sample JSON

Write a JSON stub with placeholder digests and version `1.4.0-rc.1`.

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

semver, git_sha, jar_sha256, image_digest, built_at, pipeline_run_url.

## Step 2 — Check the reference

Prod candidate must match staging digest exactly.

## Step 3 — Sample JSON

Write a JSON stub with placeholder digests and version `1.4.0-rc.1`.

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

