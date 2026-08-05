# Module 8 exercise solutions (instructor only)

Complete reference implementations for the pre-lab exercises.

**Do not share with participants.** This folder is named `solution/` so `push-all.ps1` excludes it from the participant remote.

| Exercise | Files |
| -------- | ----- |
| 3 Separate Entity and DTO | [`entity/Customer.java`](entity/Customer.java), [`dto/CustomerRequest.java`](dto/CustomerRequest.java), [`dto/CustomerResponse.java`](dto/CustomerResponse.java), [`StructureDemo.java`](StructureDemo.java) |

Copy into `mini-src/com/northstar/crm/` preserving the `entity/` and `dto/` subfolders, then compile from `module-08-exercises`:

```text
javac -d mini-out mini-src/com/northstar/crm/entity/Customer.java mini-src/com/northstar/crm/dto/CustomerRequest.java mini-src/com/northstar/crm/dto/CustomerResponse.java mini-src/com/northstar/crm/StructureDemo.java
java -cp mini-out com.northstar.crm.StructureDemo
```

**Expected:** `CUS-1001 | Amina Khan | ACTIVE`
