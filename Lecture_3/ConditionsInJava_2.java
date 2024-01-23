package Lecture_3;

import java.util.*;

public class ConditionsInJava_2 {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------------------");
        // System.out.println("A program to find, the entered number is odd or even!");
        // System.out.print("Please enter a number to check weather it is Odd or Even: ");
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // if(num%2 == 0){
        //     System.out.print(num);
        //     System.out.println(" is an Even number!");
        // } else {
        //     System.out.print(num);
        //     System.out.println(" is an Odd number!");
        // }
        System.out.println("A program which tells which number is grater, Entered by the user!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();

        System.out.print("You have entered a: ");
        System.out.print(a);
        System.out.print(" and b: ");
        System.out.println(b);

        if(a > b){
            System.out.print(a);
            System.out.print(" is grater then ");
            System.out.println(b);
        } else {
            if (a < b){
            System.out.print(b);
            System.out.print(" is grater then ");
            System.out.println(a);
            }
            else {
                if (a == b){
                    System.out.println("Both are Equal!");
                }
            }
        }
        
    }
}

