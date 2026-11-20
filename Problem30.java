package com.examly;
import java.util.*;

public class Problem30 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        TreeMap<String,Integer> hs=new TreeMap<>(Collections.reverseOrder());
        int n=Integer.parseInt(sc.nextLine());

}
static void addMaterial(TreeMap<String,Integer> hs,Scanner sc,int n){
    for(int i=0;i<n;i++){
        String material=sc.nextLine();
        int qty=Integer.parseInt(sc.nextLine());
        hs.put(material, null);
    }
}
static void 

}
class MaterialNotFoundException extends Exception{

    public MaterialNotFoundException(String message) {
        super(message);
    }

    
}
