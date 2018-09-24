package com.company;

import java.util.Scanner;

public class GettingAndStoreInput {

    public static void main(String[] args) {

//declare variables
        String firstInitial="";
        String lastName = "";
        int houseNumber=0;
        String streetName = " ";
        String streetType = " ";
        String city = " ";
        String myAnswer ;
        int zipcode=0;

        //assign variables - not needed
        /*firstInitial = "P";
        lastName = "Sherman";
        houseNumber = 42;
        streetName = "Wallaby Way";
        streetType = "Type";
        city = "Sydney";*/



//for your input - paste this P Sherman 42 Wallaby Way Sydney 20850
        System.out.println("Input all");
        Scanner keyboard = new Scanner(System.in);
        firstInitial = keyboard.next();
        lastName = keyboard.next(); //returns as string
        houseNumber = keyboard.nextInt(); //returns as int
        streetName = keyboard.next();
        streetType = keyboard.next();
        city = keyboard.next();
        zipcode = keyboard.nextInt();



        System.out.println(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city + " " + zipcode + " ");
    }
}
