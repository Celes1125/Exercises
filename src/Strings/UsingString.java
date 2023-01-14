package Strings;

import java.util.Scanner;

public class UsingString {
    public static void main(String[] args) {/*
        String name;
        String surname;
        String completeName;
        char lastLetter;
        char firstLetter;

        //Using .lenght & .charAt

        System.out.println("Give me your name please");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.println(" ");
        System.out.println("Give me your surname please");
        surname = scanner.nextLine();
        System.out.println(" ");
        completeName = name + " " + surname;
        System.out.println("Your complete name is: " + completeName);
        System.out.println(" ");
        lastLetter=completeName.charAt((completeName.length())-1);
        System.out.println("The last letter of your complete name is: " + lastLetter);
        System.out.println(" ");
        firstLetter = completeName.charAt(0);
        System.out.println("The first letter of your complete name is: " + firstLetter);

        //Using .substring

        System.out.println("Please write some word wich have 7 letters");
        String word7letters = scanner.nextLine();
        System.out.println("The first 4 letters of your word are: " + word7letters.substring(0,4) + " and the lastones are: " + word7letters.substring(4, 7));
*/
        //Using .equals & .equalsIgnoreCase

        String clientA = "cliente";
        String clientB = "CLIENTE";
        System.out.println(clientA.equals(clientB));
        System.out.println(clientA.equalsIgnoreCase(clientB));




    }
}
