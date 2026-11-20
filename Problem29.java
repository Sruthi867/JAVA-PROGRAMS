package com.examly;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem29 {
    

    public static void main(String[] args){
        HashMap<String,Integer> hm=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.nextLine());
        addMaterial(hm, sc, n);
        System.out.println("updated list of materials");
        displayMaterial(hm);
        try{
            String checkkey=sc.nextLine();
            checkMaterial(hm,checkkey);
            String upkey=sc.nextLine();
            updateMaterial(hm,upkey);
            String delkey=sc.nextLine();
            displayMaterial(hm,delkey);

            }
        }
    }
    static void addMaterial(HashMap<String,Integer>hm,Scanner sc,int n){
        for(int i=0;i<n;i++){
            System.out.println("enter the material name");
            String mat=sc.nextLine();
            System.out.println("enter quality size");
            int qty=Integer.parseInt(sc.nextLine());
            hm.put(mat,qty);
        }
    }
    static void displayMaterial(HashMap<String,Integer>hm){
        for(Map.Entry<String,Integer>entry:hm.entrySet()){
            System.out.println("Material"+entry.getKey()+":quantity"+entry.getValue());
        }
    }
    static void checkMaterial(HashMap<String,Integer>hm,String key)throws MaterialNotFoundException{
        int quantity=hm.get(key);
        if(hm.containsKey(key)){
            System.out.println("material"+key+"has"+quantity+"units available");

        }else{
            throw new MaterialNotFoundException("material"+key+"is not available in the inventory");
        }
    }
    static void updateMaterial(HashMap<String,Integer>hm,String)
class MaterialNotFoundException extends Exception{

    public MaterialNotFoundException(String message) {
        super(message);
    }
    
    
}