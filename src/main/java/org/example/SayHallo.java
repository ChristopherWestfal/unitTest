package org.example;

import java.util.Scanner;

public class SayHallo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Message eingeben: ");

        String message = sc.nextLine();
        message = message.toLowerCase();

        System.out.println(findLang(message));
    }

    public static String findLang(String message){
        String[] arr1 = {"hello", "ciao", "salut", "hallo", "hola", "ahoj", "czesc"};
        String[] arr2 = {"english", "italian", "french", "german", "spanish", "czech republic", "polsh"};

        String sprache = "";

        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i].equals(message)) {
                sprache = arr2[i];
            }
            else
                sprache = "Ich habe keine Ahnung!";
        }

        return "\nDie Sprache war: " + sprache;
    }
}
