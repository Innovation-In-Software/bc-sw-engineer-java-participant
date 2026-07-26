package com.academy.library;

import java.time.LocalDate;

public class BorrowRecord {
    private String bookId;
    private String memberId;
    private LocalDate borrowDate;

    public BorrowRecord(String bookId, String memberId, LocalDate borrowDate) {
        this.bookId = bookId;
        this.memberId = memberId;
        this.borrowDate = borrowDate;
    }

    public String getBookId() { return bookId; };
    public String getMemberId() { return memberId; }
    public LocalDate getBorrowDate() { return borrowDate; }

    @Override
    public String toString() {
        return String.format("Book %s borrowed by Member %s on %s", bookId, memberId, borrowDate);
    }
}