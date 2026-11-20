package com.examly;

import java.util.HashSet;
import java.util.Scanner;

public class Problem26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> hs = new HashSet<>();
        System.out.println("enter number of players");
        int n = Integer.parseInt(sc.nextLine());

        registerplayer(hs, sc, n);
        try {
            displayplayer(hs);
            System.out.println("search a player");
            String search = sc.nextLine();

            searchplayer(hs, search);
            System.out.println("delete a player");
            String delete = sc.nextLine();

            deleteplayer(hs, delete);
        } catch (playerNotFoundException e) {
            e.printStackTrace();

        }

    }

    static void registerplayer(HashSet<String> players, Scanner sc, int n) {
        for (int i = 0; i < n; i++) {
            String player = sc.nextLine();
            players.add(player);
        }
    }

    static void displayplayer(HashSet<String> players) throws playerNotFoundException {
        if (players.isEmpty()) {
            throw new playerNotFoundException("player is not found");
        }
        for (String player : players) {
            System.out.println(player);

        }
    }

    static void searchplayer(HashSet<String> players, String search) throws playerNotFoundException {
        if (players.contains(search)) {
            System.out.println("name" + search + "found in the set");
        } else {
            throw new playerNotFoundException("player not found");
        }
    }

    static void deleteplayer(HashSet<String> players, String delete) throws playerNotFoundException {
        if (players.remove(delete)) {
            System.out.println(delete + " deleted successfully");
        } else {
            throw new playerNotFoundException("player not found");
        }
    }

    static class playerNotFoundException extends Exception {

        public playerNotFoundException(String string) {
            // TODO Auto-generated constructor stub
        }

    }
}
