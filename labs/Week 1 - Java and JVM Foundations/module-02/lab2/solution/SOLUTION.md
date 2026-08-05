# Lab 2 — Complete reference solution

> **Finished project.** Attempt the starter first, then compare.
>
> Guide: [`../LAB-2-GUIDE.md`](../LAB-2-GUIDE.md)

## Goal

**Java syntax menu app**

## How to run

```powershell
cd $env:USERPROFILE\java-bootcamp\examples
# Copy this solution folder contents into your lab2 project, then:
cd Lab2-JavaSyntax
javac -d out (Get-ChildItem -Recurse -Filter *.java).FullName
# or follow LAB-2-GUIDE Main entry
```

## Complete Java sources (3 files)

### `Lab2-JavaSyntax/src/com/academy/student/Main.java`

```java
package com.academy.student;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager studentManager = new StudentManager(scanner);

        while (true) {
            studentManager.displayMenu();

            String choiceInput = scanner.nextLine().trim();
            if (choiceInput.isEmpty()) {
                System.out.println("Invalid Input");
                System.out.println("Please Try Again.");
                continue;
            }

            int choice;
            try {
                choice = Integer.parseInt(choiceInput);
            } catch (NumberFormatException ex) {
                System.out.println("Invalid Input");
                System.out.println("Please Try Again.");
                continue;
            }

            switch (choice) {
                case 1 -> studentManager.addStudent();
                case 2 -> studentManager.displayStudents();
                case 3 -> studentManager.searchStudent();
                case 4 -> studentManager.calculateAverage();
                case 5 -> {
                    System.out.println("Thank You");
                    scanner.close();
                    return;
                }
                case 6 -> studentManager.displayTopStudent();
                case 7 -> studentManager.displayLowestMarks();
                case 8 -> studentManager.displayPassFailReport();
                case 9 -> studentManager.displayStudentsSortedByMarks();
                case 10 -> studentManager.displayClassStatistics();
                default -> {
                    System.out.println("Invalid Input");
                    System.out.println("Please Try Again.");
                }
            }

            System.out.println();
        }
    }
}
```

### `Lab2-JavaSyntax/src/com/academy/student/Student.java`

```java
package com.academy.student;

public class Student {

    private int studentId;
    private String name;
    private String course;
    private double marks;

    public Student(int studentId, String name, String course, double marks) {
        this.studentId = studentId;
        this.name = name;
        this.course = course;
        this.marks = marks;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public void display() {
        System.out.println("ID : " + studentId);
        System.out.println("Name : " + name);
        System.out.println("Course : " + course);
        System.out.println("Marks : " + marks);
    }

    public String getPassFailStatus() {
        return marks >= 50 ? "Pass" : "Fail";
    }
}
```

### `Lab2-JavaSyntax/src/com/academy/student/StudentManager.java`

```java
package com.academy.student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class StudentManager {

    private static final int MAX_STUDENTS = 20;

    private final Student[] students = new Student[MAX_STUDENTS];
    private int studentCount = 0;
    private final Scanner scanner;

    public StudentManager(Scanner scanner) {
        this.scanner = scanner;
    }

    public void displayMenu() {
        System.out.println("====================================");
        System.out.println("Student Management System");
        System.out.println("====================================");
        System.out.println("1. Add Student");
        System.out.println("2. Display Students");
        System.out.println("3. Search Student");
        System.out.println("4. Average Marks");
        System.out.println("5. Exit");
        System.out.println("6. Top Student (Bonus)");
        System.out.println("7. Lowest Marks (Bonus)");
        System.out.println("8. Pass / Fail Report (Bonus)");
        System.out.println("9. Sort by Marks (Bonus)");
        System.out.println("10. Class Statistics (Bonus)");
        System.out.print("Enter Choice : ");
    }

    public void addStudent() {
        if (studentCount >= MAX_STUDENTS) {
            System.out.println("Student list is full. Maximum " + MAX_STUDENTS + " students allowed.");
            return;
        }

        System.out.print("Student ID : ");
        int studentId = readPositiveInt();

        if (findStudentIndex(studentId) != -1) {
            System.out.println("Invalid Input");
            System.out.println("Please Try Again.");
            System.out.println("Student ID already exists.");
            return;
        }

        String name = readNonEmptyLine("Name : ");
        String course = readNonEmptyLine("Course : ");
        double marks = readValidMarks();

        students[studentCount] = new Student(studentId, name, course, marks);
        studentCount++;
        System.out.println("Student Added Successfully.");
    }

    public void displayStudents() {
        if (studentCount == 0) {
            System.out.println("No students to display.");
            return;
        }

        printStudentTable(students, studentCount, false);
    }

    public void searchStudent() {
        if (studentCount == 0) {
            System.out.println("No students to search.");
            return;
        }

        System.out.print("Enter Student ID : ");
        int studentId = readPositiveInt();
        int index = findStudentIndex(studentId);

        if (index == -1) {
            System.out.println("Student Not Found.");
            return;
        }

        System.out.println();
        students[index].display();
    }

    public void calculateAverage() {
        if (studentCount == 0) {
            System.out.println("No students available.");
            return;
        }

        double total = 0;
        for (int i = 0; i < studentCount; i++) {
            total += students[i].getMarks();
        }

        double average = total / studentCount;
        System.out.printf("Average Marks : %.2f%n", average);
    }

    public void displayTopStudent() {
        Student topStudent = findTopStudent();
        if (topStudent == null) {
            System.out.println("No students available.");
            return;
        }

        System.out.println("Top Student");
        System.out.println(topStudent.getName());
        System.out.printf("%.2f%n", topStudent.getMarks());
    }

    public void displayLowestMarks() {
        Student lowestStudent = findLowestStudent();
        if (lowestStudent == null) {
            System.out.println("No students available.");
            return;
        }

        System.out.println("Lowest Marks Student");
        System.out.println(lowestStudent.getName());
        System.out.printf("%.2f%n", lowestStudent.getMarks());
    }

    public void displayPassFailReport() {
        if (studentCount == 0) {
            System.out.println("No students available.");
            return;
        }

        System.out.println("----------------------------------------------------------");
        System.out.printf("%-8s %-20s %-15s %-8s%n", "ID", "Name", "Course", "Status");
        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < studentCount; i++) {
            Student student = students[i];
            System.out.printf("%-8d %-20s %-15s %-8s%n",
                    student.getStudentId(),
                    student.getName(),
                    student.getCourse(),
                    student.getPassFailStatus());
        }

        System.out.println("----------------------------------------------------------");
    }

    public void displayStudentsSortedByMarks() {
        if (studentCount == 0) {
            System.out.println("No students to display.");
            return;
        }

        Student[] sortedStudents = Arrays.copyOf(students, studentCount);
        Arrays.sort(sortedStudents, Comparator.comparingDouble(Student::getMarks).reversed());
        printStudentTable(sortedStudents, studentCount, false);
    }

    public void displayClassStatistics() {
        if (studentCount == 0) {
            System.out.println("No students available.");
            return;
        }

        Student topStudent = findTopStudent();
        Student lowestStudent = findLowestStudent();
        double total = 0;

        for (int i = 0; i < studentCount; i++) {
            total += students[i].getMarks();
        }

        double average = total / studentCount;

        System.out.println("Class Statistics");
        System.out.printf("Highest Marks : %.2f (%s)%n", topStudent.getMarks(), topStudent.getName());
        System.out.printf("Lowest Marks : %.2f (%s)%n", lowestStudent.getMarks(), lowestStudent.getName());
        System.out.printf("Average : %.2f%n", average);
        System.out.println("Total Students : " + studentCount);
    }

    private void printStudentTable(Student[] studentList, int count, boolean includeStatus) {
        System.out.println("----------------------------------------------------------");
        if (includeStatus) {
            System.out.printf("%-8s %-20s %-15s %-8s %-8s%n", "ID", "Name", "Course", "Marks", "Status");
        } else {
            System.out.printf("%-8s %-20s %-15s %-8s%n", "ID", "Name", "Course", "Marks");
        }
        System.out.println("----------------------------------------------------------");

        for (int i = 0; i < count; i++) {
            Student student = studentList[i];
            if (includeStatus) {
                System.out.printf("%-8d %-20s %-15s %-8.2f %-8s%n",
                        student.getStudentId(),
                        student.getName(),
                        student.getCourse(),
                        student.getMarks(),
                        student.getPassFailStatus());
            } else {
                System.out.printf("%-8d %-20s %-15s %-8.2f%n",
                        student.getStudentId(),
                        student.getName(),
                        student.getCourse(),
                        student.getMarks());
            }
        }

        System.out.println("----------------------------------------------------------");
    }

    private Student findTopStudent() {
        if (studentCount == 0) {
            return null;
        }

        Student topStudent = students[0];
        for (int i = 1; i < studentCount; i++) {
            if (students[i].getMarks() > topStudent.getMarks()) {
                topStudent = students[i];
            }
        }
        return topStudent;
    }

    private Student findLowestStudent() {
        if (studentCount == 0) {
            return null;
        }

        Student lowestStudent = students[0];
        for (int i = 1; i < studentCount; i++) {
            if (students[i].getMarks() < lowestStudent.getMarks()) {
                lowestStudent = students[i];
            }
        }
        return lowestStudent;
    }

    private int findStudentIndex(int studentId) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getStudentId() == studentId) {
                return i;
            }
        }
        return -1;
    }

    private String readNonEmptyLine(String prompt) {
        while (true) {
            System.out.print(prompt);
            String value = scanner.nextLine().trim();
            if (!value.isEmpty()) {
                return value;
            }
            System.out.println("Invalid Input");
            System.out.println("Please Try Again.");
        }
    }

    private double readValidMarks() {
        while (true) {
            System.out.print("Marks : ");
            String input = scanner.nextLine().trim();
            try {
                double marks = Double.parseDouble(input);
                if (marks < 0 || marks > 100) {
                    System.out.println("Invalid Input");
                    System.out.println("Please Try Again.");
                    continue;
                }
                return marks;
            } catch (NumberFormatException ex) {
                System.out.println("Invalid Input");
                System.out.println("Please Try Again.");
            }
        }
    }

    private int readPositiveInt() {
        while (true) {
            String input = scanner.nextLine().trim();
            try {
                int value = Integer.parseInt(input);
                if (value <= 0) {
                    System.out.println("Invalid Input");
                    System.out.println("Please Try Again.");
                    continue;
                }
                return value;
            } catch (NumberFormatException ex) {
                System.out.println("Invalid Input");
                System.out.println("Please Try Again.");
            }
        }
    }
}
```

## Notes

# Lab 2 Reference Solution — Student Management System

Instructor reference only. Students should write these files themselves **after** completing Module 2 Exercises 1–7, under:

* Windows: `%USERPROFILE%\java-bootcamp\examples\Lab2-JavaSyntax`
* macOS / Linux: `~/java-bootcamp/examples/Lab2-JavaSyntax`

Do not confuse with flat exercise sources in `examples/module-02-exercises/`.

**Participant path reminder:** IntelliJ opens `java-bootcamp`; guides stay in the participant course clone. Compile/run from `Lab2-JavaSyntax` (project root), not from `src/`.

## Pass criteria

| # | Criterion | Pass / Fail |
| - | --------- | ----------- |
| 1 | Project compiles to `out/` with JDK 21 | |
| 2 | Add / display / search / average / exit work | |
| 3 | Sample student `101` / `John` / `Java` / `91` produces average `91.00` | |
| 4 | Evidence under `notes/screenshots/lab-2/` | |

Timed path: `StudentManager` TODOs + core menus 1–5. Bonus menus 6–10 optional.

## Expected smoke transcript (core path)

Starter menu shows **1–10**; that is expected. Use only core choices for the timed path:

```text
Enter Choice : 1
Student ID : 101
Name : John
Course : Java
Marks : 91
Student Added Successfully.

Enter Choice : 2
... table row for 101 John Java 91.00 ...

Enter Choice : 4
Average Marks : 91.00

Enter Choice : 5
Thank You
```

Also verify Search (`3`) with `101` and a bad ID.

## What starter leaves for students

| File | Already done | Student fills |
| ---- | ------------ | ------------- |
| Package folders + `Main.java` | Menu loop 1–10 wired | Confirm only |
| `Student.java` | Fields, getters/setters, `display` | Skim — do not rewrite getters |
| `StudentManager.java` | Menu print, helpers `printStudentTable` / `findStudentIndex`, bonus stubs | `addStudent`, `displayStudents`, `searchStudent`, `calculateAverage` |

**Timed path:** skip GUIDE create Steps 1–5. Prefer helpers already in the starter — do not rebuild table formatting from scratch.

## Common mistakes

| Mistake | Fix |
| ------- | --- |
| Recreating packages/classes on timed path | Copy starter; fill TODOs only |
| Looping `i < students.length` | Loop `i < studentCount` |
| Mixing `nextInt` + `nextLine` | Prefer all-`nextLine` + parse |
| Ignoring starter menu lines 6–10 | Documented — optional; core is 1–5 |
| `*.java` glob fails in PowerShell | Name each source file in `javac` |
| Wrong main class | `java -cp out com.academy.student.Main` |

## Files

| File | Role |
| ---- | ---- |
| `src/com/academy/student/Student.java` | Student model (fields, getters, display, pass/fail) |
| `src/com/academy/student/StudentManager.java` | Array storage, add / display / search / average (+ bonus) |
| `src/com/academy/student/Main.java` | Menu-driven entry point |

Matches GUIDE **Expected files:** `examples/Lab2-JavaSyntax/src/com/academy/student/{Student,StudentManager,Main}.java`

## How to compile and run

From this `Lab2-JavaSyntax` directory (JDK 21 on `PATH`):

**Windows PowerShell:**

```powershell
javac -d out `
  src\com\academy\student\Student.java `
  src\com\academy\student\StudentManager.java `
  src\com\academy\student\Main.java
java -cp out com.academy.student.Main
```

**macOS / Linux:**

```bash
javac -d out src/com/academy/student/*.java
java -cp out com.academy.student.Main
```

Smoke path: add `101` / `John` / `Java` / `91` → display → search `101` → average → exit `5`.

**Expected snippet:** `Student Added Successfully.` · `Average Marks : 91.00` · `Thank You`

## Clean

```powershell
Remove-Item -Recurse -Force out   # PowerShell
# rm -rf out                      # bash
```


