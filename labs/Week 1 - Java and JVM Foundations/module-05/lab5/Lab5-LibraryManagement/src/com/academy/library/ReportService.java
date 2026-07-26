package com.academy.library;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class ReportService {
    private final LibraryService libraryService;

    public ReportService(LibraryService libraryService) {
        this.libraryService = libraryService;
    }

    public void printSummary() {
        int totalBooks = libraryService.getBooks().size();
        int borrowed = libraryService.getBorrowRecords().size();
        int available = totalBooks - borrowed;
        int totalMembers = libraryService.getMembers().size();
        String popularCategory = mostPopularCategory();

        System.out.println("Reports");
        System.out.println("Books : " + totalBooks);
        System.out.println("Borrowed : " + borrowed);
        System.out.println("Available : " + available);
        System.out.println("Members : " + totalMembers);
        System.out.println("Most Popular Category : " + popularCategory);
    }

    public void printCategoryInsights() {
        System.out.println("Categories (sorted): " + libraryService.getCategories());
        System.out.println("Category counts (sorted by category):");
        for (Map.Entry<String, Integer> entry : libraryService.getCategoryBookCount().entrySet()) {
            System.out.println("  " + entry.getKey() + " -> " + entry.getValue());
        }
    }

    public void exportReport(String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Library Report\n");
            writer.write("Books : " + libraryService.getBooks().size() + "\n");
            writer.write("Borrowed : " + libraryService.getBorrowRecords().size() + "\n");
            writer.write("Members : " + libraryService.getMembers().size() + "\n");
            writer.write("Most Popular Category : " + mostPopularCategory() + "\n");
            System.out.println("Report exported to " + fileName);
        } catch (IOException e) {
            System.out.println("IOException occurred. Could not export report.");
        }
    }

    private String mostPopularCategory() {
        Map<String, Integer> counts = libraryService.getCategoryBookCount();
        if (counts.isEmpty()) {
            return "N/A";
        }
        String top = null;
        int max = -1;
        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                top = entry.getKey();
            }
        }
        return top;
    }
}