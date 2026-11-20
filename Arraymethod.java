package com.examly;

import java.util.Arrays;

public class Arraymethod {
    public static void main(String[] args){
        int arr[]={98,65,43,95};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr,65));
        int cop[]=Arrays.copyOf(arr,arr.length-1);
         System.out.println(Arrays.toString(cop));
         System.out.println(Arrays.equals(arr,cop));
         Arrays.fill(arr,1);
          System.out.println(Arrays.toString(arr));
          int coprange[]=Arrays.copyOfRange(cop,2,3);
           System.out.println(Arrays.toString(coprange));




    }
}
