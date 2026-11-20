package com.examly;

public class Array {
    public static void main (String[] args){
         int arr[]={1,2,3,4,5};
        System.out.println(arr[0]);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        for(int i:arr){
            System.out.println("For each:"+i);
        }
        int array[]={25,68,89,90};
        for(int i=0;i<array.length;i++){
            if(!(i%2==0)){
                System.out.println(array[i]);
            }
        }


    }
    
}
