package Lecture_4;
import java.util.*;
public class practice_xd {
    public static void main ( String args [] ){
        System.out.println("This program will print the sum of x natural numbers");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter here: ");
        int n = sc.nextInt();
        int sum =0;
        for ( int o = 1; o <= n; o++){
            sum = sum + o;
        }
        System.out.print(sum);
        System.out.print(" is the sum of ");
        System.out.print(n);
        System.out.print(" natural numbers!");

    }
}
