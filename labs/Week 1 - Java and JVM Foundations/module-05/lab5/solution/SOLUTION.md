# Lab 5 — Complete reference solution

> **Finished project.** Attempt the starter first, then compare.
>
> Guide: [`../LAB-5-GUIDE.md`](../LAB-5-GUIDE.md)

## Goal

**Library management collections**

## How to run

```powershell
cd $env:USERPROFILE\java-bootcamp\examples
# Copy this solution folder contents into your lab5 project, then:
cd Lab5-LibraryManagement
# compile/run Main per LAB-5-GUIDE
```

## Complete Java sources (7 files)

### `Lab5-LibraryManagement/src/com/academy/library/Book.java`

```java
package com.academy.library;

public class Book implements Comparable<Book> {

    private final String bookId;
    private String title;
    private String author;
    private String category;
    private double price;
    private boolean available;

    public Book(String bookId, String title, String author, String category, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
        this.available = true;
    }

    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    @Override
    public int compareTo(Book other) {
        return this.title.compareToIgnoreCase(other.title);
    }

    @Override
    public String toString() {
        return String.format("ID: %s | %s | %s | %s | $%.2f | %s",
                bookId, title, author, category, price, available ? "Available" : "Borrowed");
    }
}
```

### `Lab5-LibraryManagement/src/com/academy/library/BookComparator.java`

```java
package com.academy.library;

import java.util.Comparator;

public class BookComparator implements Comparator<Book> {

    @Override
    public int compare(Book first, Book second) {
        return Double.compare(first.getPrice(), second.getPrice());
    }
}
```

### `Lab5-LibraryManagement/src/com/academy/library/BorrowRecord.java`

```java
package com.academy.library;

import java.time.LocalDate;

public class BorrowRecord {

    private final String bookId;
    private final String memberId;
    private final LocalDate borrowDate;
    private LocalDate returnDate;

    public BorrowRecord(String bookId, String memberId, LocalDate borrowDate) {
        this.bookId = bookId;
        this.memberId = memberId;
        this.borrowDate = borrowDate;
    }

    public String getBookId() {
        return bookId;
    }

    public String getMemberId() {
        return memberId;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public void display() {
        String returned = returnDate == null ? "Not returned" : returnDate.toString();
        System.out.printf("Book: %s | Member: %s | Borrowed: %s | Returned: %s%n",
                bookId, memberId, borrowDate, returned);
    }
}
```

### `Lab5-LibraryManagement/src/com/academy/library/LibraryService.java`

```java
package com.academy.library;

import java.io.IOException;
import java.nio.file.Path;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class LibraryService {

    private final ArrayList<Book> books = new ArrayList<>();
    private final ArrayList<Member> members = new ArrayList<>();
    private final HashSet<String> bookIds = new HashSet<>();
    private final HashSet<String> memberIds = new HashSet<>();
    private final HashMap<String, String> borrowRecords = new HashMap<>();
    private final TreeSet<String> categories = new TreeSet<>();
    private final TreeMap<String, Integer> categoryBookCount = new TreeMap<>();
    private final ArrayList<BorrowRecord> borrowHistory = new ArrayList<>();
    private final HashMap<String, Integer> borrowFrequency = new HashMap<>();

    private final Scanner scanner;
    private final ReportService reportService;

    public LibraryService(Scanner scanner) {
        this.scanner = scanner;
        this.reportService = new ReportService(this);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public HashMap<String, String> getBorrowRecords() {
        return borrowRecords;
    }

    public TreeSet<String> getCategories() {
        return categories;
    }

    public TreeMap<String, Integer> getCategoryBookCount() {
        return categoryBookCount;
    }

    public ArrayList<BorrowRecord> getBorrowHistory() {
        return borrowHistory;
    }

    public void addBook() {
        System.out.print("Book ID : ");
        String bookId = scanner.nextLine().trim();

        if (bookIds.contains(bookId)) {
            System.out.println("Book already exists.");
            return;
        }

        System.out.print("Title : ");
        String title = scanner.nextLine().trim();
        System.out.print("Author : ");
        String author = scanner.nextLine().trim();
        System.out.print("Category : ");
        String category = scanner.nextLine().trim();
        double price = readPositiveDouble("Price : ");

        Book book = new Book(bookId, title, author, category, price);
        books.add(book);
        bookIds.add(bookId);
        categories.add(category);
        categoryBookCount.merge(category, 1, Integer::sum);

        System.out.println("Book Added Successfully");
    }

    public void removeBook() {
        System.out.print("Book ID to remove : ");
        String bookId = scanner.nextLine().trim();
        Book book = findBookById(bookId);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (borrowRecords.containsKey(bookId)) {
            System.out.println("Cannot remove a borrowed book.");
            return;
        }

        books.remove(book);
        bookIds.remove(bookId);
        updateCategoryCount(book.getCategory(), -1);
        System.out.println("Book removed successfully.");
    }

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        System.out.println("--- Traditional For Loop ---");
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }

        System.out.println("--- Enhanced For Loop ---");
        for (Book book : books) {
            System.out.println(book);
        }

        System.out.println("--- Iterator ---");
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("--- forEach() ---");
        books.forEach(System.out::println);
    }

    public void registerMember() {
        System.out.print("Member ID : ");
        String memberId = scanner.nextLine().trim();

        if (memberIds.contains(memberId)) {
            System.out.println("Member already exists.");
            return;
        }

        System.out.print("Name : ");
        String name = scanner.nextLine().trim();
        System.out.print("Email : ");
        String email = scanner.nextLine().trim();
        System.out.print("Phone : ");
        String phone = scanner.nextLine().trim();

        members.add(new Member(memberId, name, email, phone));
        memberIds.add(memberId);
        System.out.println("Member Registered Successfully");
    }

    public void displayMembers() {
        if (members.isEmpty()) {
            System.out.println("No members registered.");
            return;
        }

        members.forEach(System.out::println);
    }

    public void searchBook() {
        System.out.println("Search by: 1-ID  2-Title  3-Author  4-Category  5-Partial Title");
        System.out.print("Choice : ");
        String choice = scanner.nextLine().trim();
        System.out.print("Search value : ");
        String value = scanner.nextLine().trim();

        List<Book> matches = new ArrayList<>();

        switch (choice) {
            case "1" -> {
                Book book = findBookById(value);
                if (book != null) {
                    matches.add(book);
                }
            }
            case "2" -> matches.addAll(searchByField(value, SearchField.TITLE));
            case "3" -> matches.addAll(searchByField(value, SearchField.AUTHOR));
            case "4" -> matches.addAll(searchByField(value, SearchField.CATEGORY));
            case "5" -> matches.addAll(searchPartialTitle(value));
            default -> System.out.println("Invalid search option.");
        }

        if (matches.isEmpty()) {
            System.out.println("No matching books found.");
            return;
        }

        System.out.println("Search Results:");
        matches.forEach(System.out::println);
    }

    public void borrowBook() {
        System.out.print("Book ID : ");
        String bookId = scanner.nextLine().trim();
        System.out.print("Member ID : ");
        String memberId = scanner.nextLine().trim();

        Book book = findBookById(bookId);
        Member member = findMemberById(memberId);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (member == null) {
            System.out.println("Member not found.");
            return;
        }

        if (!book.isAvailable() || borrowRecords.containsKey(bookId)) {
            System.out.println("Book is already borrowed.");
            return;
        }

        book.setAvailable(false);
        borrowRecords.put(bookId, memberId);
        borrowHistory.add(new BorrowRecord(bookId, memberId, LocalDate.now()));
        borrowFrequency.merge(bookId, 1, Integer::sum);

        System.out.println("Book Borrowed Successfully");
    }

    public void returnBook() {
        System.out.print("Book ID : ");
        String bookId = scanner.nextLine().trim();

        Book book = findBookById(bookId);
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (!borrowRecords.containsKey(bookId)) {
            System.out.println("Book is not currently borrowed.");
            return;
        }

        borrowRecords.remove(bookId);
        book.setAvailable(true);

        for (int i = borrowHistory.size() - 1; i >= 0; i--) {
            BorrowRecord record = borrowHistory.get(i);
            if (record.getBookId().equals(bookId) && record.getReturnDate() == null) {
                record.setReturnDate(LocalDate.now());
                break;
            }
        }

        System.out.println("Book Returned Successfully");
    }

    public void displayBorrowedBooks() {
        if (borrowRecords.isEmpty()) {
            System.out.println("No borrowed books.");
            return;
        }

        borrowRecords.forEach((bookId, memberId) -> {
            Book book = findBookById(bookId);
            Member member = findMemberById(memberId);
            System.out.printf("Book: %s (%s) borrowed by %s (%s)%n",
                    bookId,
                    book != null ? book.getTitle() : "Unknown",
                    memberId,
                    member != null ? member.getName() : "Unknown");
        });
    }

    public void displayAvailableBooks() {
        List<Book> availableBooks = books.stream()
                .filter(Book::isAvailable)
                .toList();

        if (availableBooks.isEmpty()) {
            System.out.println("No available books.");
            return;
        }

        availableBooks.forEach(System.out::println);
    }

    public void sortBooks() {
        if (books.isEmpty()) {
            System.out.println("No books to sort.");
            return;
        }

        System.out.println("Sort by: 1-Title  2-Price  3-Author  4-Category");
        System.out.print("Choice : ");
        String choice = scanner.nextLine().trim();

        List<Book> sortedBooks = new ArrayList<>(books);

        switch (choice) {
            case "1" -> Collections.sort(sortedBooks);
            case "2" -> sortedBooks.sort(new BookComparator());
            case "3" -> sortedBooks.sort(Comparator.comparing(Book::getAuthor, String.CASE_INSENSITIVE_ORDER));
            case "4" -> sortedBooks.sort(Comparator.comparing(Book::getCategory, String.CASE_INSENSITIVE_ORDER));
            default -> {
                System.out.println("Invalid sort option.");
                return;
            }
        }

        System.out.println("Sorted Books:");
        sortedBooks.forEach(System.out::println);
    }

    public void displayReports() {
        reportService.displaySummaryReport();
    }

    public void exportReport() {
        try {
            Path outputPath = reportService.exportReportToFile("library-report.txt");
            System.out.println("Report exported to: " + outputPath.toAbsolutePath());
        } catch (IOException ex) {
            System.out.println("Failed to export report: " + ex.getMessage());
        }
    }

    public void displayBorrowHistory() {
        if (borrowHistory.isEmpty()) {
            System.out.println("No borrow history.");
            return;
        }

        borrowHistory.forEach(BorrowRecord::display);
    }

    public void displayTopBorrowedBooks() {
        if (borrowFrequency.isEmpty()) {
            System.out.println("No borrow data available.");
            return;
        }

        System.out.println("Top 5 Most Borrowed Books");
        borrowFrequency.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(5)
                .forEach(entry -> {
                    Book book = findBookById(entry.getKey());
                    String title = book != null ? book.getTitle() : "Unknown";
                    System.out.printf("%s (%s) - %d borrows%n", entry.getKey(), title, entry.getValue());
                });
    }

    public void displayCategoryInsights() {
        System.out.println("Categories (TreeSet - sorted, unique):");
        categories.forEach(category -> System.out.println("- " + category));

        System.out.println();
        System.out.println("Books per Category (TreeMap - sorted keys):");
        categoryBookCount.forEach((category, count) ->
                System.out.printf("%s : %d%n", category, count));
    }

    public void runPerformanceComparison() {
        int[] sizes = {1_000, 10_000, 50_000};

        System.out.printf("%-10s %-18s %-18s %-10s%n", "Size", "ArrayList (ms)", "LinkedList (ms)", "Faster");
        System.out.println("---------------------------------------------------------------");

        for (int size : sizes) {
            long arrayListTime = measureListPerformance(new ArrayList<>(), size);
            long linkedListTime = measureListPerformance(new LinkedList<>(), size);
            String faster = arrayListTime <= linkedListTime ? "ArrayList" : "LinkedList";
            System.out.printf("%-10d %-18d %-18d %-10s%n", size, arrayListTime, linkedListTime, faster);
        }

        System.out.println();
        System.out.println("ArrayList is usually faster for random access and iteration.");
        System.out.println("LinkedList can be competitive for frequent middle insertions.");
    }

    private long measureListPerformance(List<Book> list, int size) {
        long start = System.nanoTime();

        for (int i = 0; i < size; i++) {
            list.add(new Book("B" + i, "Title " + i, "Author " + i, "Category", 10 + i));
        }

        for (int i = 0; i < size; i++) {
            list.get(i);
        }

        if (!list.isEmpty()) {
            list.remove(list.size() / 2);
        }

        return (System.nanoTime() - start) / 1_000_000;
    }

    private List<Book> searchByField(String value, SearchField field) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            String candidate = switch (field) {
                case TITLE -> book.getTitle();
                case AUTHOR -> book.getAuthor();
                case CATEGORY -> book.getCategory();
            };

            if (candidate.equalsIgnoreCase(value)) {
                results.add(book);
            }
        }
        return results;
    }

    private List<Book> searchPartialTitle(String partialTitle) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(partialTitle.toLowerCase())) {
                results.add(book);
            }
        }
        return results;
    }

    private Book findBookById(String bookId) {
        for (Book book : books) {
            if (book.getBookId().equals(bookId)) {
                return book;
            }
        }
        return null;
    }

    private Member findMemberById(String memberId) {
        for (Member member : members) {
            if (member.getMemberId().equals(memberId)) {
                return member;
            }
        }
        return null;
    }

    private void updateCategoryCount(String category, int delta) {
        int updated = categoryBookCount.getOrDefault(category, 0) + delta;
        if (updated <= 0) {
            categoryBookCount.remove(category);
            categories.remove(category);
        } else {
            categoryBookCount.put(category, updated);
        }
    }

    private double readPositiveDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();
            try {
                double value = Double.parseDouble(input);
                if (value < 0) {
                    System.out.println("Price must not be negative.");
                    continue;
                }
                return value;
            } catch (NumberFormatException ex) {
                System.out.println("Invalid price. Please try again.");
            }
        }
    }

    private enum SearchField {
        TITLE, AUTHOR, CATEGORY
    }
}
```

### `Lab5-LibraryManagement/src/com/academy/library/Main.java`

```java
package com.academy.library;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibraryService libraryService = new LibraryService(scanner);

        while (true) {
            displayMenu();
            String choiceInput = scanner.nextLine().trim();

            if (choiceInput.isEmpty()) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            int choice;
            try {
                choice = Integer.parseInt(choiceInput);
            } catch (NumberFormatException ex) {
                System.out.println("Invalid choice. Please try again.");
                continue;
            }

            System.out.println("----------------------------------");

            switch (choice) {
                case 1 -> libraryService.addBook();
                case 2 -> libraryService.registerMember();
                case 3 -> libraryService.displayBooks();
                case 4 -> libraryService.displayMembers();
                case 5 -> libraryService.searchBook();
                case 6 -> libraryService.borrowBook();
                case 7 -> libraryService.returnBook();
                case 8 -> libraryService.displayBorrowedBooks();
                case 9 -> libraryService.sortBooks();
                case 10 -> libraryService.displayReports();
                case 11 -> {
                    System.out.println("Thank You");
                    scanner.close();
                    return;
                }
                case 12 -> libraryService.displayAvailableBooks();
                case 13 -> libraryService.displayCategoryInsights();
                case 14 -> libraryService.runPerformanceComparison();
                case 15 -> libraryService.displayBorrowHistory();
                case 16 -> libraryService.displayTopBorrowedBooks();
                case 17 -> libraryService.exportReport();
                default -> System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        }
    }

    private static void displayMenu() {
        System.out.println("=====================================");
        System.out.println("Library Management System");
        System.out.println("=====================================");
        System.out.println("1 Add Book");
        System.out.println("2 Register Member");
        System.out.println("3 Display Books");
        System.out.println("4 Display Members");
        System.out.println("5 Search Book");
        System.out.println("6 Borrow Book");
        System.out.println("7 Return Book");
        System.out.println("8 Display Borrowed Books");
        System.out.println("9 Sort Books");
        System.out.println("10 Reports");
        System.out.println("11 Exit");
        System.out.println("12 Display Available Books");
        System.out.println("13 Category Insights (TreeSet/TreeMap)");
        System.out.println("14 Performance Comparison (Bonus)");
        System.out.println("15 Borrow History (Bonus)");
        System.out.println("16 Top 5 Borrowed Books (Bonus)");
        System.out.println("17 Export Report (Bonus)");
        System.out.print("Choice : ");
    }
}
```

### `Lab5-LibraryManagement/src/com/academy/library/Member.java`

```java
package com.academy.library;

public class Member {

    private String memberId;
    private String name;
    private String email;
    private String phone;

    public Member(String memberId, String name, String email, String phone) {
        this.memberId = memberId;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return String.format("ID: %s | %s | %s | %s", memberId, name, email, phone);
    }
}
```

### `Lab5-LibraryManagement/src/com/academy/library/ReportService.java`

```java
package com.academy.library;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class ReportService {

    private final LibraryService libraryService;

    public ReportService(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    public void displaySummaryReport() {
        int totalBooks = libraryService.getBooks().size();
        int borrowedBooks = libraryService.getBorrowRecords().size();
        int availableBooks = totalBooks - borrowedBooks;
        int totalMembers = libraryService.getMembers().size();
        String popularCategory = findMostPopularCategory();

        System.out.println("Reports");
        System.out.println("Books : " + totalBooks);
        System.out.println("Borrowed : " + borrowedBooks);
        System.out.println("Available : " + availableBooks);
        System.out.println("Members : " + totalMembers);
        System.out.println("Most Popular Category : " + popularCategory);
    }

    public Path exportReportToFile(String fileName) throws IOException {
        int totalBooks = libraryService.getBooks().size();
        int borrowedBooks = libraryService.getBorrowRecords().size();
        int availableBooks = totalBooks - borrowedBooks;
        int totalMembers = libraryService.getMembers().size();
        String popularCategory = findMostPopularCategory();

        StringBuilder report = new StringBuilder();
        report.append("Library Management Report").append(System.lineSeparator());
        report.append("=========================").append(System.lineSeparator());
        report.append("Books : ").append(totalBooks).append(System.lineSeparator());
        report.append("Borrowed : ").append(borrowedBooks).append(System.lineSeparator());
        report.append("Available : ").append(availableBooks).append(System.lineSeparator());
        report.append("Members : ").append(totalMembers).append(System.lineSeparator());
        report.append("Most Popular Category : ").append(popularCategory).append(System.lineSeparator());
        report.append(System.lineSeparator());
        report.append("Category Breakdown").append(System.lineSeparator());

        libraryService.getCategoryBookCount()
                .forEach((category, count) -> report.append(category)
                        .append(" : ")
                        .append(count)
                        .append(System.lineSeparator()));

        Path outputPath = Path.of(fileName);
        Files.writeString(outputPath, report.toString());
        return outputPath;
    }

    private String findMostPopularCategory() {
        return libraryService.getCategoryBookCount().entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse("N/A");
    }
}
```

## Notes

# Lab 5 Reference Solution — Library Management System

Instructor reference only. Students should write these files themselves **after** completing Module 5 Exercises 1–7, under:

* Windows: `%USERPROFILE%\java-bootcamp\examples\Lab5-LibraryManagement`
* macOS / Linux: `~/java-bootcamp/examples/Lab5-LibraryManagement`

Do not confuse with flat exercise sources in `examples/module-05-exercises/`.

**Participant path reminder:** IntelliJ opens `java-bootcamp`; compile/run from `Lab5-LibraryManagement` (project root). Mark `src` as Sources Root.

## Pass criteria

| Path | Required |
| ---- | -------- |
| **Timed (~45 min)** | `borrowBook` + `returnBook` + `displaySummaryReport` / `findMostPopularCategory`; smoke path below; evidence under `notes/screenshots/lab-5/` |
| **Full / extended** | Timed criteria plus search/sort polish; optional history, top borrowed, **export**, **performance** bonuses |

## What the starter leaves for students

Already given: `Book`, `Member`, `BorrowRecord`, `BookComparator`, `Main`, add/register/display helpers, category insights, history/top-borrowed display helpers.

**Core TODOs (must implement — still throw until filled):**

* `LibraryService.borrowBook`
* `LibraryService.returnBook`
* `ReportService.displaySummaryReport`
* `ReportService.findMostPopularCategory`

**Bonus stubs (print message — do not crash timed explorers):**

* `exportReportToFile` / menu 17 Export Report
* `runPerformanceComparison` / menu 14

## Files

| File | Role |
| ---- | ---- |
| `Book.java` | Book model (`Comparable` by title) |
| `Member.java` | Member model |
| `BorrowRecord.java` | Borrow history entry |
| `BookComparator.java` | Price (and multi-field) sorting |
| `LibraryService.java` | Catalog, loans (`HashMap`), borrow/return |
| `ReportService.java` | Summary / popular category / export |
| `Main.java` | Menu-driven entry point |

All under `src/com/academy/library/`. Matches GUIDE **Expected files:** `examples/Lab5-LibraryManagement/src/com/academy/library/*.java`

## How to compile and run

From this `Lab5-LibraryManagement` directory (JDK 21 on `PATH`):

**Windows PowerShell:**

```powershell
javac -d out `
  src\com\academy\library\Book.java `
  src\com\academy\library\Member.java `
  src\com\academy\library\BorrowRecord.java `
  src\com\academy\library\BookComparator.java `
  src\com\academy\library\ReportService.java `
  src\com\academy\library\LibraryService.java `
  src\com\academy\library\Main.java
java -cp out com.academy.library.Main
```

**macOS / Linux:**

```bash
javac -d out src/com/academy/library/*.java
java -cp out com.academy.library.Main
```

## Expected smoke transcript

Interactive path (prompts in order):

1. Menu `1` → Book ID `101`, Title `Java Basics`, Author `Aman`, Category `Programming`, **Price `55`**
2. Menu `2` → Member ID `1`, Name `Riya`, Email `riya@test.com`, Phone `9999999999`
3. Menu `6` → Book `101`, Member `1`
4. Menu `10` → Reports
5. Menu `7` → Book `101` (optional)
6. Menu `11` → Exit

```text
Book Added Successfully
Member Registered Successfully
Book Borrowed Successfully
Reports
Books : 1
Borrowed : 1
Available : 0
Members : 1
Most Popular Category : Programming
Thank You
```

## Common mistakes

| Mistake | Fix |
| ------- | --- |
| Borrow without checking `borrowRecords` | Reject if book already loaned |
| Forget `setAvailable(false/true)` | Keep Map and `Book.available` in sync |
| Popular category from empty TreeMap | Return `"N/A"` when no categories |
| Menu 17 crashes timed path | Starter export is a Bonus stub — implement later |
| Compiling with wrong cwd | Run `javac` / `java` from `Lab5-LibraryManagement` |

## Clean

```powershell
Remove-Item -Recurse -Force out   # PowerShell
# rm -rf out                      # bash
# also remove library-report.txt if export was run
```


