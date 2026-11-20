package com.examly;

public class Strmeth{
    public static void main(String[] args){
        String name="hello java";
        System.out.println(name);
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.charAt(4));
        System.out.println(name.substring(4,8));
        System.out.println(name.equals("hello world"));
        System.out.println(name.startsWith("aello"));
        System.out.println(name.endsWith("java"));
        System.out.println(name.contains("z"));
        System.out.println(name.indexOf('a'));
        System.out.println(name.indexOf('j'));
        System.out.println(name.lastIndexOf('h',1));
        System.out.println(name.replace("",""));
        System.out.println(name.trim());

    }
}
