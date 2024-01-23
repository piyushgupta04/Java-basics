package Lecture_3;

import java.util.*;

public class ElseIf {
    public static void main(String[] args) {
        System.out.println("This program will print greetings to the user according to the user's language\n1 for English\n2 for Hindi\n3 for Haryanvi");
        System.out.print("Enter your choice:");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        // if (choice == 1){
        //     System.out.println("Welcome User,");
        // } else if (choice == 2){
        //     System.out.println("Namaste User,");
        // } else if (choice == 3){
        //     System.out.println("Ram Ram bhai,");
        // } else {
        //     System.out.println("Invalid Input!");
        // }
        switch (choice) {
            case 1:
                System.out.println("Hello User!");
                break;
            case 2:
                System.out.println("Namaste User!!");
                break;
            case 3:
                System.out.println("Ram Ram bhai saryane!!!");
                break;
            default:
                System.out.println("Invalid Greeting language entered!");
        }
    }
}
