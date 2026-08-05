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
