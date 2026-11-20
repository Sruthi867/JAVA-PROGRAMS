package com.examly;

import java.util.Scanner;
import java.util.HashSet;

public class Problem27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> hs = new HashSet<>();
        System.out.println("enter no of books:");
        int n = sc.nextInt();
        sc.nextLine();
        registerbook(hs, n, sc);
        displaybooknames(hs);
        try {
            System.out.println("enter the book name for searching");
            String book = sc.nextLine();
            searchbook(hs, "book");
            System.out.println("enter the book name to br removed");
            removebook(hs, sc);
        } catch (BooknotFoundException e) {
            System.out.println(e.getMessage());
        }

    }

    static void registerbook(HashSet<String> hs, int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            String bookname = sc.nextLine();
            hs.add(bookname);
        }
    }

    static void displaybooknames(HashSet<String> hs) {
        for (String name : hs) {
            System.out.println(name);
        }
    }

    static void searchbook(HashSet<String> hs, String booktitle) throws BooknotFoundException {
        if (hs.contains(booktitle)) {
            System.out.println("Book " + booktitle + " is found");
        } else {
            throw new BooknotFoundException("Book not found: " + booktitle);
        }

    }

    static void removebook(HashSet<String> hs, Scanner sc) {

    while (true) {
        String remove = sc.nextLine();

        if (hs.remove(remove)) {
            System.out.println("Book removed successfully");
            break;
        } else {
            System.out.println("Book not found");
            System.out.println("Enter the book name to be removed:");
        }
    }
}
static class BooknotFoundException extends Exception {

    public BooknotFoundException(String message) {
        super(message);
    }

}
}
