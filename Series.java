package com.examly;

import java.util.ArrayList;
import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        ArrayList<String> series = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of series");
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("Add series");
        addSeries(series, n, sc);
        System.out.println("dipsplay all the titles before operations");
        displaySeries(series);
        System.out.println("enter the search keyword");
        String newtitle = sc.nextLine();
        try {
            String search;
            searchSeries(series, newtitle);
        } catch (SeriesNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Enter old title for search");
        String old = sc.nextLine();

        System.out.println("Enter new title for search");
        String newtitle1 = sc.nextLine();

        try {
            replaceSeries(series, old, newtitle1);
        } catch (SeriesNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Display all titles after operations:");
        displaySeries(series);

        System.out.println("Keyword for Contain:");
        String countkey = sc.nextLine();
        seriesContain(series, countkey);

        longestCount(series);
    }

    static void addSeries(ArrayList<String> series, int n, Scanner sc) {
        for (int i = 0; i < n; i++) {
            String title = sc.nextLine();
            series.add(title);
        }
    }

    static void displaySeries(ArrayList<String> series) {
        if (series.isEmpty()) {
            System.out.println("the series collection is empty");
            return;

        }
        for (String title : series) {
            System.out.println(title);
        }

    }

    static void searchSeries(ArrayList<String> series, String title) throws SeriesNotFoundException {
        int index = series.indexOf(title);
        if (index != -1) {
            System.out.println("series" + title + "is found in the collection");
        } else {
            throw new SeriesNotFoundException("series" + title + "is not found in the collection");
        }
    }

    static void replaceSeries(ArrayList<String> series, String oldTitle, String newTitle)
            throws SeriesNotFoundException {
        if (series.contains(oldTitle)) {
            series.set(series.indexOf(oldTitle), newTitle);
        } else {
            throw new SeriesNotFoundException("Series " + oldTitle + " is not found in the collection");

        }
    }

    static void seriesContain(ArrayList<String> series, String keyword) {
        int count = 0;
        for (String title : series) {
            if (title.contains(keyword)) {
                count++;
            }
        }
        System.out.println("number of series containing the keyword" + keyword + ":" + count);
    }

    static void longestCount(ArrayList<String> series) {
        String longcount = series.get(0);
        if (series.isEmpty()) {
            System.out.println("Series collection is empty");
            return;
        }

        for (int i = 1; i < series.size(); i++) {
            if (longcount.length() < series.get(i).length()) {
                longcount = series.get(i);
            }

        }
        System.out.println("the series with " + longcount);
    }

    static class SeriesNotFoundException extends Exception {
        public SeriesNotFoundException(String message) {

            super(message);
        }
    }
}