// RESOURCE

// https://www.w3schools.com/java/java_for_loop.asp
//https://www.geeksforgeeks.org/loops-in-java/
//https://www.javatpoint.com/java-for-loop


package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //THEORY

        // for loops
        /*
        for (int i = 1; i<=10;i++){
            System.out.println(i);
        }
        */
        //nested loops
        for (int i = 1; i<=2;i++){ // The outer loop activates itself
            System.out.println("Outer: " + i);
                for (int j =1; j<=3; j++){ // And the inner loop has to finish so it can go back to outer loop once again
                    System.out.println("Inner: " + j);
                }
        }

        //for each loop
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i:cars) { // String i represents a variable to iterate over every element of the array,
            // it's only declared in the scope of the loop, you cannot access it outside the loop
            System.out.println(i);
        }

        //Practical examples of for loops

        System.out.println("********************************************");
        // print even numbers
        for (int i =0; i<=10;i+=2){ // here we add to the increment the number 2 so it will always show the even number
            System.out.println(i);
        }

        //EXERCISES

        //Exercise 1
        System.out.println("Write a program to print numbers from 1 to 10.");

        for (int i = 1; i <=10; i++){
            System.out.println(i);
        }

        //Exercise 2

        int sum = 0;

        for (int i = 1;i<=10;i++){
            sum+=i;
        }
        System.out.println("Sum: " + sum);


        //Exercise 3 Multiplication table

        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Multiplication table");

        int number = input.nextInt();

        for (int i = 1;i <=10;i++){
            System.out.println(number + " x " + i + " = " + (number * i));
        }
         */

        // Exercise 4  Factorial from a number

/*
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int fact  = 1;
        for (int i = 1;i<=num;i++){
           fact = fact * i;
        }
        System.out.println("Factorial: " + fact);
*/
/*
// Exercise 5 - Number to the power of number

        int result = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Input 2 numbers and i will raise the first one to power of the second one");
        System.out.println("Give me the first number");
        int base = input.nextInt();
        System.out.println("Alright, give me the second number :)");
        int power = input.nextInt();

        for (int i = 1; i <= power; i++){
            result *= base;
        }
        System.out.println("Result: " + result);
*/
        // Exercise 6 - Star Rectangle

        /*
         **********
         **********
         **********
         **********
         **********
         */

        for (int i = 1; i<=5;i++){
            for (int j = 1; j<=10; j++){
                System.out.print("*");
            }
            System.out.println();
        }

// Exercise 7 - Numbers pyramid
        int number =  5;
        for(int i = 1; i <= number;i++){
            for (int j = 1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }




}