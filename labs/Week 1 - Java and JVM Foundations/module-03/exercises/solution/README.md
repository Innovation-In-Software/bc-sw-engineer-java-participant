# Module 3 exercise solutions (instructor only)

Complete reference implementations for the pre-lab exercises.

**Do not share with participants.** This folder is named `solution/` so `push-all.ps1` excludes it from the participant remote.

Flat folder + JDK 21 on `PATH`. Shared `Account` hierarchy is reused across demos.

## File map

| Exercise | File(s) | Role |
| -------- | ------- | ---- |
| 1 Domain Entities | — | Analysis-only — `notes.md` (no solution `.java`) |
| 2 Encapsulation | [`Account.java`](Account.java), [`EncapsulationDemo.java`](EncapsulationDemo.java) | Runnable demo |
| 3 Inheritance | [`SavingsAccount.java`](SavingsAccount.java), [`CurrentAccount.java`](CurrentAccount.java), [`InheritanceDemo.java`](InheritanceDemo.java) | Runnable; see note below |
| 4 Abstract Classes | [`AbstractAccount.java`](AbstractAccount.java), [`AbstractSavings.java`](AbstractSavings.java), [`AbstractDemo.java`](AbstractDemo.java) | Runnable |
| 5 Interface | [`Printable.java`](Printable.java), [`Customer.java`](Customer.java), [`InterfaceDemo.java`](InterfaceDemo.java) | Runnable |
| 6 SOLID SRP | [`SolidDemo.java`](SolidDemo.java) | Runnable |
| 7 SOLID OCP–DIP | [`FrozenAccount.java`](FrozenAccount.java); [`InheritanceDemo.java`](InheritanceDemo.java) | Three-account loop |
| 8 Mini UML | — | Analysis-only — `uml-notes.md` (no solution `.java`) |

**Note:** `InheritanceDemo.java` in this folder matches Exercise 7 (includes `FrozenAccount`). For Exercise 3 verification, omit `FrozenAccount` from the array and use the two-account loop from the exercise sheet.

## Compile and run (Windows PowerShell)

```powershell
javac Account.java EncapsulationDemo.java SavingsAccount.java CurrentAccount.java FrozenAccount.java InheritanceDemo.java AbstractAccount.java AbstractSavings.java AbstractDemo.java Printable.java Customer.java InterfaceDemo.java SolidDemo.java

java EncapsulationDemo
java InheritanceDemo
java AbstractDemo
java InterfaceDemo
java SolidDemo
```

## Expected key output

| Demo | Key lines |
| ---- | --------- |
| `EncapsulationDemo` | `Withdrawal rejected.` · `Final balance: 120.00` |
| `InheritanceDemo` (Ex 7 shape) | `Savings withdraw=true balance=80.00` · `Current withdraw=true balance=78.00` · `Frozen withdraw=false balance=100.00` |
| `AbstractDemo` | `Savings balance: 50.0` |
| `InterfaceDemo` | `Customer C101: Aman Singh` |
| `SolidDemo` | `Interest earned: 500.00` |

## Common mistakes

- Instantiating `AbstractAccount` directly — will not compile; use `AbstractSavings`.
- Expecting `FrozenAccount` to print `Withdrawal rejected.` — it overrides `withdraw` and returns `false` silently.
- Compiling only the `*Demo.java` without its supporting types (`Account`, `Printable`, …).

## Clean

```powershell
Remove-Item -Force *.class
```
