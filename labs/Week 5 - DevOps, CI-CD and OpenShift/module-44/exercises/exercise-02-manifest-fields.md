# Exercise 2 — Sketch Artifact Manifest

**Module 44** · Documentation exercise · [setup](EXERCISES-INDEX.md)

## Goal

List fields for `artifact-manifest.json` without inventing real digests.

## Steps

### Step 1 — Fields

semver, git_sha, jar_sha256, image_digest, built_at, pipeline_run_url.

### Step 2 — Check the reference

Prod candidate must match staging digest exactly.

### Step 3 — Sample JSON

Write a JSON stub with placeholder digests and version `1.4.0-rc.1`.

### Step 4 — Rollback target

Add `known_good_previous` example `1.3.2` + digest placeholder.

## Expected result

Manifest stub with previous known-good pointer.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Required fields listed | Pass / Fail |
| 2 | JSON stub written | Pass / Fail |
| 3 | Rollback target included | Pass / Fail |
