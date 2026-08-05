# Module 2 exercise solutions (instructor only)

Complete reference implementations for the pre-lab exercises.

**Do not share with participants.** This folder is named `solution/` so `push-all.ps1` excludes it from the participant remote.

Flat folder + JDK 21 on `PATH`. Most demos are interactive (`Scanner`); feed sample input after `java`.

## File map

| Exercise | File | Role |
| -------- | ---- | ---- |
| 1 Calculations | [`Calculator.java`](Calculator.java) | Interactive |
| 2 Decision Making | [`DecisionDemo.java`](DecisionDemo.java) | Interactive |
| 3 Loops | [`LoopsDemo.java`](LoopsDemo.java) | Interactive (menu loop) |
| 4 Methods | [`MethodsDemo.java`](MethodsDemo.java) | Non-interactive |
| 5 Personal Details | [`PersonalDetails.java`](PersonalDetails.java) | Interactive |
| 6 Product Information | [`ProductInfo.java`](ProductInfo.java) | Interactive |
| 7 Area of Circle | [`CircleArea.java`](CircleArea.java) | Interactive |
| 8 Bill Summary | [`BillSummary.java`](BillSummary.java) | Interactive |
| 9 Personal Profile (bonus) | [`PersonalProfile.java`](PersonalProfile.java) | Interactive |

No analysis-only exercises in this module (all have a `.java` file).

## Compile and run (Windows PowerShell)

```powershell
javac Calculator.java DecisionDemo.java LoopsDemo.java MethodsDemo.java PersonalDetails.java ProductInfo.java CircleArea.java BillSummary.java PersonalProfile.java

java MethodsDemo
java Calculator
java DecisionDemo
java LoopsDemo
java PersonalDetails
java ProductInfo
java CircleArea
java BillSummary
java PersonalProfile
```

## Expected key output

| Demo | Sample input | Key lines |
| ---- | ------------ | --------- |
| `MethodsDemo` | — | `square(4) = 16` · `square(2.5) = 6.25` |
| `Calculator` | `10` then `4` | `Sum: 14.00` · `Difference: 6.00` · `Product: 40.00` · `Quotient: 2.50` |
| `DecisionDemo` | score `85`, day `3` | `Grade: B` · `Wednesday` |
| `LoopsDemo` | after table/countdown, type non-`menu` to quit | `Multiplication table for 5:` · `5 x 1 = 5` … · `Countdown: 3`…`1` · menu line `1) Add  2) Withdraw  3) Exit` when input is `menu` |
| `PersonalDetails` | `Aman` / `21` / `Toronto` | `Hello, Aman! You are 21 years old and live in Toronto.` |
| `ProductInfo` | `Pen` / `3` / `1.50` | `Product: Pen \| Qty: 3 \| Price: 1.50` |
| `CircleArea` | `2` | `Area: 12.57` (π × r²) |
| `BillSummary` | `Book` / `2` / `10` | `--- Bill Summary ---` · `Total: 20.00` · `Discount (10%): 2.00` · `Final amount: 18.00` |
| `PersonalProfile` | any four fields | header `Field` / `Value` then Name, Age, City, Hobby rows |

## Common mistakes

- `*.java` glob fails in PowerShell — name each source on the `javac` line (as above).
- Mixing `nextInt` / `nextLine` leaves a leftover newline — prefer parse-after-`nextLine` if you rewrite.
- Forgetting recompile after edits — run `javac` again before `java`.

## Clean

```powershell
Remove-Item -Force *.class
```
