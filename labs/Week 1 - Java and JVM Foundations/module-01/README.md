# Module 1 — Start here

**Topic:** JVM Architecture and Runtime Model  
**Do not open every file in this folder.** Follow this order only.

Full course rule: [Which file do I open?](../../_PARTICIPANT-FILE-GUIDE.md) · [Clone + own repo](../../CLONE-AND-OWN-REPO-GUIDE.md)

---

## Your sequence today

| Step | When | Open this (only) |
| ---- | ---- | ---------------- |
| A | After Lab 0 is done | Stay in IntelliJ with `java-bootcamp` open |
| B | After Module 1 **slides** (+ instructor demo) | [`exercises/EXERCISES-INDEX.md`](exercises/EXERCISES-INDEX.md) → then `exercise-01` … `exercise-08` **in order** |
| C | After Exercises 1–8 Pass | **One** OS how-to: [`lab1/LAB-1-WINDOWS.md`](lab1/LAB-1-WINDOWS.md) **or** [`lab1/LAB-1-MACOS.md`](lab1/LAB-1-MACOS.md) |
| D | Graded lab (post-exercise consolidation) | [`lab1/LAB-1-GUIDE.md`](lab1/LAB-1-GUIDE.md) — in class use [`lab1/starter/`](lab1/starter/README.md) (~45 min); full path = every Step |
| E | Done | Mark Pass/Fail in your notes |

**Do not skip from Lab 0 or slides straight to Lab 1.** Lab 1 assumes Exercises 1–8 are already Pass.

---

## How Lab 1 is performed (smooth path)

You use **two places** — do not mix them:

| Place | What lives there | What you do |
| ----- | ---------------- | ----------- |
| **This course clone** (`bc-sw-engineer-java-participant`) | Guides: this README, exercises, `LAB-1-*.md` | **Read** steps; never write graded code here |
| **Your workspace** `%USERPROFILE%\java-bootcamp` (Windows) / `~/java-bootcamp` (macOS) | Your code under `examples/` | **Write / compile / run** in IntelliJ Terminal |

**Day-of workflow (verified on Windows + IntelliJ PowerShell):**

1. Keep **IntelliJ** open on `java-bootcamp` (Project pane shows `examples`, `notes`, maybe `HelloJava`).
2. Keep **guides** open beside it: browser tab on GitHub **or** a second window on this participant clone (or optional copy under `java-bootcamp/labs/` if your instructor set that up).
3. Exercises → code in `examples/module-01-exercises/` until all eight Pass.
4. Then OS how-to → GUIDE → code in `examples/jvm-compilation-lab/` (flat `.java` files — **not** inside `labs/`).

**IntelliJ Terminal rule:** Before every `javac` / `java` / `javap`, `cd` into the folder that holds the `.java` file. Wrong directory is the #1 failure.

```powershell
# Exercises
cd $env:USERPROFILE\java-bootcamp\examples\module-01-exercises

# Graded Lab 1
cd $env:USERPROFILE\java-bootcamp\examples\jvm-compilation-lab
```

---

## Files in this module — ignore unless told

| File / folder | For you? |
| ------------- | -------- |
| `README.md` (this file) | **Yes — start** |
| `exercises/EXERCISES-INDEX.md` + `exercise-0N-*.md` | **Yes** — practice before the lab |
| `lab1/LAB-1-WINDOWS.md` or `LAB-1-MACOS.md` | **Yes** — pick your OS |
| `lab1/LAB-1-GUIDE.md` | **Yes** — main steps |
| `lab1/INSTRUCTOR-DEMO.md` | **No** — instructor live demo (may be absent in participant clone) |
| `lab1/solution/` | **No** — absent in participant clone; try first |

---

## Workspace reminder

Code goes in **your** laptop folder:

| Work | Folder |
| ---- | ------ |
| Exercises | `java-bootcamp/examples/module-01-exercises/` |
| Graded Lab 1 | `java-bootcamp/examples/jvm-compilation-lab/` |
| Screenshots | `java-bootcamp/notes/screenshots/lab-1/` |

**IntelliJ tip:** create sources with **New → File** → `ClassName.java`. Do **not** use **New → Java Class** or mark `module-01-exercises` / `jvm-compilation-lab` as Sources Root. Details: [`exercises/EXERCISES-INDEX.md`](exercises/EXERCISES-INDEX.md).
