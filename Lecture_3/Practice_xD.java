package Lecture_3;
import java.util.*;

public class Practice_xD {
    public static void main(String[] args) {
        System.out.println("\nA program which can perform multiple Arithematic operations with the given number.\n---------------------------------------- How to use ----------------------------------------\nJust enter a and b and select the required option to use this cool calculator!\n--------------------------------------------------------------------------------------------\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Ok, Now enter b:");
        int b = sc.nextInt();
        System.out.print("This Calculator can perform-\n1) Addition\n2) Multiplication\n3) Remainder\n4) Subtraction\n5) Division\n--------------------------------------------------------------------------------------------\nEnter your response according to the option to perform that operation!\nResponse:");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("You have selected Option 1(Addition)\nOutput: ");
                System.out.println(a+b);
                break;
            case 2:
                System.out.print("You have selected Option 2(Multiplication)\nOutput: ");
                System.out.println(a*b);
                break;
            case 3:
                System.out.print("You have selected Option 3(Remainder)\nOutput: ");
                System.out.println(a%b);
                break;
             case 4:
                System.out.print("You have selected Option 4(Subtraction)\nOutput: ");
                System.out.println(b-a);
                break;
            case 5:
                System.out.print("You have selected Option 5(Division)\nOutput: ");
                System.out.println(a/b);
                break;
            default:
                System.out.println("Dhek ke input daal!");
        }

    }
}
