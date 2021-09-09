package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 David Bradford
 */
import java.util.Scanner;

public class LegalDriving {
    public static void main(String[] args) {
        int age ;



        String yes = "You are old enough to legally drive.";
        String no = "You are not old enough to legally drive.";
        Scanner input = new Scanner(System.in);

        System.out.print( "What is your age? " );
        age = input.nextInt();

        String canDrive = age > 15 ? yes : no ;
        System.out.println(canDrive);



    }
}
