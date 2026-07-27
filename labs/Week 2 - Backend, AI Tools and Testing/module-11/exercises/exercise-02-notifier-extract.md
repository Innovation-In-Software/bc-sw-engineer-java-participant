# Exercise 2 — Notifier Extract Plan

**Module 11** · Architecture exercise · [setup](EXERCISES-INDEX.md)

## Goal

Plan extracting a notifier collaborator so tests can later isolate side effects.

## Steps

### Step 1 — Smell

Describe inline `System.out` / email send inside activate as a testability smell.

### Step 2 — Extract sketch

Sketch interface `CustomerNotifier.notifyActivated(customerId)` on paper.

### Step 3 — Why for Copilot

One sentence: stronger prompts name the collaborator so AI does not bury I/O in the service.

### Step 4 — Defer

Mark: do not implement Spring events or Kafka yet — prep sketch only.

## Expected result

A one-page extract plan that improves future AI test prompts.

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | Smell named | Pass / Fail |
| 2 | Interface sketched | Pass / Fail |
| 3 | Out-of-scope hosting noted | Pass / Fail |
