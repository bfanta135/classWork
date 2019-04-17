package com.company;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //
//        Random random = new Random();
//        int from = 1;
//        int to = 100;
//        int randomNumber = random.nextInt(to - from + 1) + from;
//        //
//        int guessedNumber = 0;
//
//        //
//        System.out.printf("The number is between %d and %d.\n", from, to);
//
//        //
//        do
//        {
//            System.out.print("Guess what the number is: ");
//            guessedNumber = scan.nextInt();
//            if (guessedNumber > randomNumber)
//                System.out.println("Your guess is too high!");
//            else if (guessedNumber < randomNumber)
//                System.out.println("Your guess is too low!");
//            else
//                System.out.println("You got it!");
//        } while (guessedNumber != randomNumber);
        String firstIntial, lastName,streetName,streetType,city;
        int houseNumber;

        System.out.print("enter first intial:");
        firstIntial = scan.nextLine();
        System.out.print("enter last name:");
        lastName = scan.nextLine();
        System.out.print("enter house number:");
        houseNumber = scan.nextInt();
        scan.nextLine();
        System.out.print("enter street name:");
        streetName = scan.nextLine();
        System.out.print("enter street type:");
        streetType = scan.nextLine();
        System.out.print("ente city:");
        city = scan.nextLine();




        System.out.println(firstIntial + "" + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city + "");
    }
}
