package Lecture_4;
import java.util.*;
public class practice {
    public static void main ( String args [] ){
        System.out.println("Program to print the even no. till n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for(int i = 0; i<=n; i++){
            
            if(i%2 == 0){
                System.out.print(i);
            } else {
                System.out.println("");
            }
        }
    }
}
