### Step 13 - SOLID deisgn checklist


| Principle | Lab 3 evidence |
| --------- | -------------- |
| SRP | Models vs `BankService` vs thin `Main` |
| OCP | New account type via subclass, not editing every switch in models |
| LSP | Savings/Current usable wherever `Account` is expected |
| ISP | Small `Printable` with one method |
| DIP | Menu depends on `BankService` API, not raw arrays |

**SRP** - Each class has exactly one reason to change. The model classes (`Account`, `Savings`, `Current`, `Customer`, `Transaction`) are responsible only for holding and validating their own data. `Bank Service` is responsible only for business logic. `Main` is responsible only for driving the menu loop and reading user input. This separation shows SRP in action.\
**OCP** - The code is open for extension but closed for modification. For example, when you want a new kind of account, you create a new subclass of `Account` rather than going into `BankService` and adding extra logic to accommodate the changes. The existing logic in `BankService` doesn't need to be touched or re-verified. Instead, we extend behavior by adding a class, not editing existing ones.\
**LSP** - Whenever teh code expects an `Account`, a `Savings` or `Current` object can be substituted in without breaking anything. The methods in `BankService` work properly regardless of whether it is handed a `Savings` or a `Current` instance.\
**ISP** - `Printable` is an example of a focused interface with one method. Classes that need printing behavior implement just that one method without having to implement a complex interface with unrelated methods.\
**DIP** - `Main` depends on `BankService`'s public methods such as `openAccount()`, `deposit()`, or `withdraw()`, rather than manipulating raw data structures directly. This means `BankService`'s internals could be completely rewritten and `Main` wouldn't need to change.\



### Reflection Questions

1. Why should `Account` be abstract rather than a concrete empty type?\
Because `Account` on its own doesn't represent an instantiable thing in this domain. A plain "Account" would never be opened, but rather you open a `Savings` or `Current` account. Making it abstract enforces this at compile time.\
2. Where does dynamic dispatch show up when you call `displayAccount()` on `Account[]`?\
When you loop through `Account[]` and call `displayAccount()` on each element, the JVM doesn't decide which method to run based on the array's declared `Account` type. Rather, it looks at the actual runtime type of each object (`Savings` or `Current`) and calls that class's overridden version of the method. This is dynamic dispatch.\
3. How does `Printable` differ from extending a base class?\
Extending a class establishes an "is-a" relationship. Implementing an interface like `Printable` establishes a "can-do" relationship or "contract" with no implementation or state, and a class cna implement multiple interfaces at once.\
4. What would break if `Main` owned all arrays instead of `BankService`?\
SRP and DIP would both be violated. `Main` would become responsible for both UI/menu flow and data storage/business logic. Thus, any change to how accounts are stored would require editing `Main` directly. Also, anyone with access to `Main` could manipulate the arrays directly, bypassing whatever business rules `BankService` was meant to enforce.\
5. How do today’s Customer/Account patterns prepare you for later CRM entity design **without** building Spring here?\
The core ideas transfer directly even without a framework. This includes modeling real-world entities as classes with encapsulated state (`Customer`, `Account`), separating persistence/business logic into a service layer (`BankService`) rather than mixing it into UI code, and coding against interfaces/abstractions instead of concrete types.\