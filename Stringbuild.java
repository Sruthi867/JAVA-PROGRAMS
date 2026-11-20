package com.examly;

public class Stringbuild {
    public static void main(String[] args){
        StringBuffer sb=new StringBuffer("hello");
        System.out.println(sb);
        String str="hello";
        str=str.concat(" java");
        System.out.println(str);
        sb.append(" java");
        System.out.println(sb);
        sb.insert(2,"new value");
        System.out.println(sb);
        System.out.println(sb.reverse());
        System.out.println(sb.replace(2,11,"replaced."));
        System.out.println(sb.delete(1,5));
        System.out.println(sb.deleteCharAt(7));
        System.out.println(sb.length());
        System.out.println(sb.charAt(0));
        sb.setCharAt(1,'#');
        System.out.println(sb);
        sb.setLength(14);
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.substring(2,6));
        sb.append("qwertyuiopasdfghjklzxcvbnm,123456789");
        System.out.println(sb);
        System.out.println(sb.capacity());
        sb.ensureCapacity(100);
        System.out.println(sb.capacity());
    }
}
