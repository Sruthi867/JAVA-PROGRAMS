package com.examly;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapPractice {
    public static void main(String[] args){
        Map<Integer,String> m=new HashMap<>();
        m.put(1,"hello");
        m.put(2,"hai");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length");
        int n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            int key=Integer.parseInt(sc.nextLine());
            String val=sc.nextLine();
            m.put(key,val);
        }
        System.out.println(m);
        for(Map.Entry<Integer,String>entry:m.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
        System.out.println(m.isEmpty());
        System.out.println(m.values());
        System.out.println(m.keySet());
        System.out.println(m.get(2));
        System.out.println(m.containsKey(101));
        System.out.println(m.containsValue("java"));
        System.out.println(m.getOrDefault(567,"default key value"));
        m.replace(56,"replace values");
        System.out.println(m);
        System.out.println(m.putIfAbsent(678, null));
        System.out.println(m);
    }
}
