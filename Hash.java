package com.examly;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Hash {

    public static void main(String[] args){
        HashSet<String> hs=new HashSet<>();
        HashSet<String> hs2=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        hs.add("hello");
        for(int i=0;i<5;i++){
            hs.add(sc.nextLine());
        }
        System.out.println(hs);
        System.out.println(hs.size());
        System.out.println(hs.contains("hello"));
        System.out.println(hs.hashCode());
        hs2.addAll(hs);
        System.out.println("HS2:"+hs2);
        hs2.add("dfcgvhj");
        System.out.println(hs.containsAll(hs2));
        System.out.println(hs.isEmpty());
        System.out.println(hs.remove("hello"));
        Iterator it=hs.iterator();
        

        
    }
}
