
package com.examly;

public class Method {

    public static void main(String[] args) {

        System.out.println("Hello Java");

        int sum = method();
        System.out.println("Sum: " + sum);

        main();

        main("Sruthi");

        String result = name("Sruthi", 19);
        System.out.println(result);
    }

    protected static void main() {
        System.out.println("Hello Java");
    }

    static void main(String name) {
        System.out.println("Hello Java " + name);
    }

    static int method() {
        return 10 + 20;
    }

    static String name(String name, int age) {
        return name + " age is " + age;
    }
}
