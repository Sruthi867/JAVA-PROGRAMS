package com.examly;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Integer, String> mp = new LinkedHashMap<>();
           Map<Integer, String> mp1 = new LinkedHashMap<>();
        System.out.println("enter n");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("enter key");
            int key = Integer.parseInt(sc.nextLine());
            System.out.println("enter value");
            String value = sc.nextLine();
            mp.put(key, value);

        }
        System.out.println(mp);
        for(Map.Entry<Integer,String>entry:mp.entrySet()){
            System.out.println(entry.getValue()+":"+entry.getValue());
        }
        mp1.putAll(mp);
        System.out.println(mp.equals(mp1));

    }
}
