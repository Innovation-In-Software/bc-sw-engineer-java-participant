# Exercise 4 — Fill Kafka Basics TODOs

**Module 30** · Hands-on exercise · [setup](EXERCISES-INDEX.md)

## Goal

Complete fill-in blanks for topic, partition, offset, and consumer group.

## Steps

### Step 1 — Copy the quiz

Create `notes/lab30-kafka-todos.md` and paste:

1. A _____ is a named stream of records.
2. A _____ is an ordered subset of a topic; offsets are per partition.
3. The _____ is the consumer's position in a partition.
4. Consumers in the same _____ compete for partitions; different groups each get a copy.

### Step 2 — Fill blanks

Replace each `_____` with: topic / partition / offset / consumer group (one each).

### Step 3 — CRM example

Add one line: group `crm-notifications` shares partitions; group `crm-audit` reads all `CUS-1001`/`CUS-1002` events independently.

### Step 4 — Self-check

Compare to Step 2 answer key in your head: topic, partition, offset, consumer group.

## Expected result

Four blanks filled correctly with a CRM group example sentence.

## If it fails

| Problem | Fix |
| --- | --- |
| Problem | Fix |
| Confusing partition with consumer group | Partition = ordered log slice; group = load-sharing unit |
| Thinking offset is global per topic | Offsets are per partition (and tracked per group) |

## Pass criteria

| # | Confirm | Notes |
| --- | --- | --- |
| 1 | All four terms filled | Pass / Fail |
| 2 | CRM competing vs independent groups noted | Pass / Fail |
| 3 | File saved under notes/ | Pass / Fail |
