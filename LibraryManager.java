package com.examly;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LibraryManager {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        HashMap<String, Integer> books = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine());

        try {
            insertBooks(books, n);
        } catch (InvalidBorrowCountException e) {
            System.out.println(e.getMessage());
        }

        displayBooks(books);
        String title = sc.nextLine();
        updateBorrowCount(books, title);

        int threshold = Integer.parseInt(sc.nextLine());
        showBooksAboveThreshold(books, threshold);

        char letter = sc.next().charAt(0);
        showBooksStartingWith(books, letter);
    }

    public static void insertBooks(HashMap<String, Integer> books, int n) throws InvalidBorrowCountException {
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the Book name");
            String name = sc.nextLine();

            System.out.println("Enter the count");
            int count = Integer.parseInt(sc.nextLine());

            if (books.containsKey(name)) {
                System.out.println("Duplicate book skipped: " + name);
                continue;
            }

            if (count < 0) {
                throw new InvalidBorrowCountException("Borrow count cannot be negative for book: ");
            }

            books.put(name, count);
        }
    }

    public static void displayBooks(HashMap<String, Integer> books) {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        for (Map.Entry<String, Integer> entry : books.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void updateBorrowCount(HashMap<String, Integer> books, String title) {
        int count = books.get(title);
        if (books.containsKey(title)) {
            count++;
            System.out.println("Borrow count updated for :" + title+count);
        } else {
            System.out.println("Book not found");
        }
    }

    public static void showBooksAboveThreshold(HashMap<String, Integer> books, int threshold) {
        for (Map.Entry<String, Integer> entry : books.entrySet()) {
            int value = entry.getValue();
            if (value > threshold) {
                
                System.out.println(entry.getKey() + " : " + entry.getValue());
            } else {
                System.out.println("No books exceed the threshold.");
            }
        }
    }

    public static void showBooksStartingWith(HashMap<String, Integer> books, char letter) {
        boolean start = false;
        for (Map.Entry<String, Integer> entry : books.entrySet()) {
            String value = entry.getKey();
            if (Character.toLowerCase(value.charAt(0)) == Character.toLowerCase(letter)) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
                start = true;
            }
        }

        if (!start) {
            System.out.println("No books exceed the threshold.");
        }
    }

}

class InvalidBorrowCountException extends Exception {

    public InvalidBorrowCountException(String message) {
        super(message);
    }

}