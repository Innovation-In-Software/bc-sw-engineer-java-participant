# Exercise 2 — Activate Build Profiles

**Module 9** · Analysis exercise · [setup](EXERCISES-INDEX.md)

## Goal

Create `profiles-notes.md` explaining how `dev` and `prod` profiles keep laptop settings from silently becoming production settings.

## Profile map

| Idea | Easy meaning |
| ---- | ------------ |
| Profile | Named set of POM properties/plugins activated together |
| `activeByDefault` | Turns on unless another profile selection replaces the default set |
| `-Pprod` | Activate the `prod` profile from the command line |
| Property such as `app.env` | Value that resources or docs can document per environment |

## Example fragment (study only)

```xml
<profiles>
  <profile>
    <id>dev</id>
    <activation>
      <activeByDefault>true</activeByDefault>
    </activation>
    <properties>
      <app.env>dev</app.env>
    </properties>
  </profile>
  <profile>
    <id>prod</id>
    <properties>
      <app.env>prod</app.env>
    </properties>
  </profile>
</profiles>
```

## Steps

### Step 1 — Answer without running Maven yet

| Question | Your answer |
| -------- | ----------- |
| Which profile is active when you run plain `mvn package`? | |
| How do you activate `prod` on the command line? | |
| What is the `app.env` value under `dev`? | |
| What is the `app.env` value under `prod`? | |

### Step 2 — Check the reference

| Question | Answer |
| -------- | ------ |
| Default profile | `dev` (`activeByDefault`) |
| Activate prod | `mvn -Pprod …` (example: `mvn -Pprod package`) |
| `dev` `app.env` | `dev` |
| `prod` `app.env` | `prod` |

### Step 3 — Spot the mistakes

Explain why each is dangerous:

- putting production database passwords inside the `dev` profile;
- making `prod` `activeByDefault` on every engineer laptop;
- assuming profiles change Java package names (they do not — they change build/config properties);
- documenting secrets in screenshots of profile properties.

### Step 4 — Write one activation rule

Add to `profiles-notes.md`:

```markdown
Keep `dev` as the laptop default.
Activate `prod` intentionally with `-Pprod`.
Never store real production secrets in `pom.xml` profiles.
```

## Expected result

You can name the default profile, activate `prod` deliberately, and refuse secrets in POM properties.

## Pass criteria

| # | Confirm | Notes |
| - | ------- | ----- |
| 1 | Four Q&A rows match the reference | Pass / Fail |
| 2 | You flag at least two profile mistakes | Pass / Fail |
| 3 | Activation rule is written | Pass / Fail |
