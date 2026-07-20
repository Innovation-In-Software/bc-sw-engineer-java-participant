# Exercise 1 — Stack vs Heap Basics

**Module 4** · Pre-lab practice · finish all 7 Pass, then [`../lab4/LAB-4-GUIDE.md`](../lab4/LAB-4-GUIDE.md)  
**Folder:** `examples/module-04-exercises/` ([setup](EXERCISES-INDEX.md))

![Thread Stack Frames Referencing an Object on the Heap](../../../lab_diagrams/mod04-ex01-stack-vs-heap.png)

## Goal

Create `StackHeapDemo.java`, run it, then trace which values belong to method stack frames and which object lives on the heap.

## Starter / reference

```java
public class StackHeapDemo {
    static class Person {
        String name;

        Person(String name) {
            this.name = name;
        }
    }

    static void printPerson(Person person) {
        // Local primitive in the printPerson stack frame
        int nameLength = person.name.length();
        System.out.printf("%s has %d letters.%n",
                person.name, nameLength);
    }

    public static void main(String[] args) {
        // Primitive value belongs to main's frame
        int count = 1;

        // Reference is local; new Person object is on the heap
        Person person = new Person("Aman");

        printPerson(person);
        System.out.println("Count: " + count);
    }
}
```

## Mental model

```mermaid
flowchart LR
    subgraph Stack["Thread stack"]
        M["main frame<br/>count = 1<br/>person reference"]
        P["printPerson frame<br/>person reference<br/>nameLength = 4"]
    end
    subgraph Heap["Shared heap"]
        O["Person object<br/>name -> String 'Aman'"]
    end
    M --> O
    P --> O
```

| Item | Location for this exercise | Why |
| ---- | -------------------------- | --- |
| `count` | `main` stack frame | Local primitive |
| local `person` variable | `main` stack frame | Local reference |
| `printPerson` parameter | `printPerson` stack frame | Another reference |
| `nameLength` | `printPerson` stack frame | Local primitive |
| `new Person(...)` | Heap | Object allocation |
| `"Aman"` | String pool / heap-managed memory | String object |

> This is a useful teaching model. JVM optimizations may change physical storage internally, but Java reference/reachability semantics remain the same.

## Steps

### Step 1 — Create and compile

**Windows:**

```powershell
cd $env:USERPROFILE\java-bootcamp\examples\module-04-exercises
javac StackHeapDemo.java
```

**macOS:**

```bash
cd ~/java-bootcamp/examples/module-04-exercises
javac StackHeapDemo.java
```

### Step 2 — Run

```text
java StackHeapDemo
```

**Verified (Windows):**

```text
Aman has 4 letters.
Count: 1
```

### Step 3 — Trace method entry and return

**Why:** Each method call has its own frame.

Write in `notes.md`:

1. `main` frame is created.
2. `Person` is allocated; `main.person` refers to it.
3. Calling `printPerson` creates a second frame.
4. Both frames temporarily hold references to the same `Person`.
5. `printPerson` returns; its frame is removed.
6. `main` returns; its frame is removed.

## Expected result

Program prints two lines, and your notes distinguish a local reference from the heap object it points to.

## Common mistake

Saying “the object is in the variable.” More precisely, the local variable holds a **reference**; the `Person` object is heap-allocated.

## Pass criteria

| # | Confirm | Your notes |
| - | ------- | ---------- |
| 1 | Program compiles and prints the verified output | Pass / Fail |
| 2 | You can identify both stack frames | Pass / Fail |
| 3 | You can distinguish `person` reference from `Person` object | Pass / Fail |
