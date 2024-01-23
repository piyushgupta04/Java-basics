package Lecture_3;

import java.util.*;

public class ConditionsInJava {
    public static void main ( String args [] ){
        System.out.println("Conditional Statements fr");
        System.out.println("Let's check are you adult or not ?");
        System.out.print("Enter your age here: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age > 18){
            System.out.println("Yes, You are adult bro ...");
        } else {
            System.out.println("Bacche! System se dur rho!!!");
        }
    }
}
