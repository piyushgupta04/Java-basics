package Lecture_4;
import java.util.*;
public class q3_ {
    public static void main(String[] args) {
        System.out.println("Hello xD");
        Scanner sc = new Scanner(System.in);
        int response = sc.nextInt();
        do{

        System.out.print("Enter your marks here: ");
        int grade = sc.nextInt();
        if ( grade >= 90){
            System.out.println("IMPRESSIVE!");
        } else {
            if ( grade <= 89 ){
                System.out.println("THIK THAK");
            } else {
                if(grade <= 50){
                    System.out.println("OK bhai aacha aaya ha,");
                } else {

                }
            }
        }
        } while (response == 0);
    }
}
