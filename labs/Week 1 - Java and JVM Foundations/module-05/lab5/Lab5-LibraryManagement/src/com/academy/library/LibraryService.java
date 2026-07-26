package com.academy.library;

import java.time.LocalDate;
import java.util.*;

public class LibraryService {
    private final Scanner scanner;
    private final ReportService reportService;

    private final ArrayList<Book> books = new ArrayList<>();
    private final ArrayList<Member> members = new ArrayList<>();
    private final HashSet<String> bookIds = new HashSet<>();
    private final HashSet<String> memberIds = new HashSet<>();
    private final HashMap<String, String> borrowRecords = new HashMap<>();
    private final TreeSet<String> categories = new TreeSet<>();
    private final TreeMap<String, Integer> categoryBookCount = new TreeMap<>();
    private final ArrayList<BorrowRecord> borrowHistory = new ArrayList<>();
    private final HashMap<String, Integer> borrowFrequency = new HashMap<>();

    public LibraryService(Scanner scanner) {
        this.scanner = scanner;
        this.reportService = new ReportService(this);
    }

    // Getters

    public ArrayList<Book> getBooks() { return books; }
    public ArrayList<Member> getMembers() { return members; }
    public HashMap<String, String> getBorrowRecords() { return borrowRecords; }
    public TreeSet<String> getCategories() { return categories; }
    public TreeMap<String, Integer> getCategoryBookCount() { return categoryBookCount; }

    // Add

    public void addBook() {
        String id = promptStringInput("Book ID : ");
        if (bookIds.contains(id)) {
            System.out.println("Book already exists.");
            return;
        }

        String title = promptStringInput("Title : ");
        String author = promptStringInput("Author : ");
        String category = promptStringInput("Category : ");
        double price = readPositiveDouble("Price : ");

        Book book = new Book(id, title, author, category, price);
        books.add(book);
        bookIds.add(id);
        categories.add(category);
        categoryBookCount.merge(category, 1, Integer::sum);

        System.out.println("Book Added Successfully");
    }

    // Register

    public void registerMember() {
        String id = promptStringInput("Member ID : ");
        if (memberIds.contains(id)) {
            System.out.println("Member already exists.");
            return;
        }

        String name = promptStringInput("Name : ");
        String email = promptStringInput("Email : ");
        String phone = promptStringInput("Phone : ");

        Member member = new Member(id, name, email, phone);
        members.add(member);
        memberIds.add(id);

        System.out.println("Member Registered Successfully");
    }

    // Display

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        System.out.println("-- Traditional for --");
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i));
        }

        System.out.println("-- Enhanced for --");
        for (Book book : books) {
            System.out.println(book);
        }

        System.out.println("-- Iterator --");
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("-- forEach --");
        books.forEach(System.out::println);
    }

    public void displayMembers() {
        if (members.isEmpty()) {
            System.out.println("No members registered.");
            return;
        }

        for (Member member : members) {
            System.out.println(member);
        }
    }

    public void displayAvailableBooks() {
        boolean any = false;
        for (Book book : books) {
            if (book.getAvailable()) {
                System.out.println(book);
                any = true;
            }
        }
        if (!any) {
            System.out.println("No books currently available.");
        }
    }

    // Bonus: Borrow history
    public void displayBorrowHistory() {
        if (borrowHistory.isEmpty()) {
            System.out.println("No borrow history yet.");
            return;
        }

        for (BorrowRecord record : borrowHistory) {
            System.out.println(record);
        }
    }

    // Bonus: Top borrowed
    public void displayTopBorrowedBooks() {
        if (borrowFrequency.isEmpty()) {
            System.out.println("No borrow activity yet.");
            return;
        }

        List<Map.Entry<String, Integer>> entries = new ArrayList<>(borrowFrequency.entrySet());
        entries.sort((a, b) -> b.getValue() - a.getValue());

        System.out.println("Top Borrowed Books:");
        int limit = Math.min(5, entries.size());
        for (int i = 0; i < limit; i++) {
            Map.Entry<String, Integer> entry = entries.get(i);
            Book book = findBookById(entry.getKey());
            String title = book != null ? book.getTitle() : entry.getKey();
            System.out.println((i + 1) + ". " + title + " (" + entry.getValue() + " times)");
        }
    }

    public void displayBorrowedBooks() {
        if (borrowRecords.isEmpty()) {
            System.out.println("No books are currently borrowed.");
            return;
        }
        for (Map.Entry<String, String> entry : borrowRecords.entrySet()) {
            System.out.println("Book " + entry.getKey() + " -> Member " + entry.getValue());
        }
    }

    // Search

    private interface BookMatcher {
        boolean matches(Book book);
    }

    public void searchBook() {
        System.out.println("1 By ID");
        System.out.println("2 By Title");
        System.out.println("3 By Author");
        System.out.println("4 By Category");
        System.out.println("5 Partial Title");
        System.out.print("Choice : ");

        String choice = scanner.nextLine().trim();
        switch (choice) {
            case "1" -> {
                String id = promptStringInput("Book ID : ");
                Book found = findBookById(id);
                System.out.println(found != null ? found : "Book not found.");
            }
            case "2" -> {
                String title = promptStringInput("Title : ");
                printMatches(book -> book.getTitle().equalsIgnoreCase(title));
            }
            case "3" -> {
                String author = promptStringInput("Author : ");
                printMatches(book -> book.getAuthor().equalsIgnoreCase(author));
            }
            case "4" -> {
                String category = promptStringInput("Category : ");
                printMatches(book -> book.getCategory().equalsIgnoreCase(category));
            }
            case "5" -> {
                String partial = promptStringInput("Partial title : ").toLowerCase(Locale.ROOT);
                printMatches(book -> book.getTitle().toLowerCase().contains(partial));
            }
            default -> System.out.println("Invalid choice.");
        }
    }

    private void printMatches(BookMatcher matcher) {
        boolean any = false;
        for (Book book : books) {
            if (matcher.matches(book)) {
                System.out.println(book);
                any = true;
            }
        }
        if (!any) {
            System.out.println("No matching books found.");
        }
    }

    private Book findBookById(String id) {
        for (Book book : books) {
            if (book.getBookId().equals(id)) {
                return book;
            }
        }
        return null;
    }

    private Member findMemberById(String id) {
        for (Member member : members) {
            if (member.getMemberId().equals(id)) {
                return member;
            }
        }
        return null;
    }

    // Borrow

    public void borrowBook() {
        String bookId = promptStringInput("Book ID : ");
        String memberId = promptStringInput("Member ID : ");

        Book book = findBookById(bookId);
        if (book == null) {
            System.out.println("Book not found.");
            return;
        }
        if (findMemberById(memberId) == null) {
            System.out.println("Member not found.");
            return;
        }
        if (borrowRecords.containsKey(bookId)) {
            System.out.println("Book is already borrowed.");
            return;
        }
        if (!book.getAvailable()) {
            System.out.println("Book is not available.");
            return;
        }

        borrowRecords.put(bookId, memberId);
        book.setAvailable(false);
        borrowHistory.add(new BorrowRecord(bookId, memberId, LocalDate.now()));
        borrowFrequency.merge(bookId, 1, Integer::sum);
        System.out.println("Book Borrowed Successfully");
    }

    // Return

    public void returnBook() {
        String bookId = promptStringInput("Book ID : ");

        if (!borrowRecords.containsKey(bookId)) {
            System.out.println("This book is not currently borrowed.");
            return;
        }

        borrowRecords.remove(bookId);
        Book book = findBookById(bookId);
        if (book != null) {
            book.setAvailable(true);
        }
        System.out.println("Book Returned Successfully");
    }

    // Sort

    public void sortBooks() {
        System.out.println("1 By Title (Comparable)");
        System.out.println("2 By Price (Comparator)");
        System.out.print("Choice : ");
        String choice = scanner.nextLine().trim();

        switch (choice) {
            case "1" -> {
                Collections.sort(books);
                System.out.println("Sorted by title.");
            }
            case "2" -> {
                books.sort(new BookComparator());
                System.out.println("Sorted by price.");
            }
            default -> {
                System.out.println("Invalid choice.");
                return;
            }
        }
        displayBooks();
    }


    // Reports

    public void displayReports() {
        reportService.printSummary();
    }

    public void displayCategoryInsights() {
        reportService.printCategoryInsights();
    }

    public void exportReport() {
        reportService.exportReport("library-report.txt");
    }

    // Bonus : ArrayList vs LinkedList

    public void runPerformanceComparison() {
        int n = 100_000;

        List<Integer> arrayList = new ArrayList<>();
        long startArray = System.nanoTime();
        for (int i = 0; i < n; i++) {
            arrayList.add(0, i);
        }
        long arrayMs = (System.nanoTime() - startArray) / 1_000_000;

        List<Integer> linkedList = new LinkedList<>();
        long startLinked = System.nanoTime();
        for (int i = 0; i < n; i++) {
            linkedList.add(0, i);
        }
        long linkedMs = (System.nanoTime()- startLinked) / 1_000_000;

        System.out.println("Inserting " + n + " elements at index 0:");
        System.out.println("ArrayList  : " + arrayMs + " ms");
        System.out.println("LinkedList : " + linkedMs + " ms");
    }


    // Helper Functions

    private String promptStringInput(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Invalid input. Try again.");
                continue;
            }
            return input;
        }
    }

    private double readPositiveDouble(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();
            try {
                double value = Double.parseDouble(input);
                if (value > 0) {
                    return value;
                }
                System.out.println("Price must be positive.");
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }
}