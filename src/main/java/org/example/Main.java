package org.example;

public class Main {
    public static void main(String[] args) {

        int x = 2, y = 3;

        System.out.println(add(x, y));

        System.out.println(multi(x, y));

    }

    public static int add(int x, int y){
        return x + y;
    }

    public static int multi(int x, int y){
        return x * y;
    }

    public static String convertToUppercase(String str){
        return str.toUpperCase();
    }

    public static boolean isEven (int x){
        if(x % 2 == 0)
            return true;
        else
            return false;
    }

    public static boolean isPositive(int x){
        if (x < 0)
            return false;
        else
            return true;
    }
}