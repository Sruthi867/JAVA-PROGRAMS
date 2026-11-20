package com.examly;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Collections;
import java.util.Map;

public class Treemap {
    public static void main(String[] args){
        Map<String,Integer> students=new TreeMap<>(Collections.reverseOrder());
        Scanner sc=new Scanner(System.in);
        students.put("wert",43);
        students.put("fdsa",78);
        for(int i=0;i<3;i++){
            String key=sc.nextLine();
            int val=Integer.parseInt(sc.nextLine());
            students.put(key,val);

        }
        System.out.println(students);



    }
}
