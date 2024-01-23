package nine_patterns_java;
import java.util.*;
public class userthrough_solid_square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = 0;
        int c = 0;
        System.out.println("This program will print a square/ rectangle depending upon the user,\nr = No. of Rows & c = No. of Columns");
        System.out.print("Enter r: ");
        r = sc.nextInt();
        System.out.print("Enter c: ");
        c = sc.nextInt();
        for(int i = 1; i<=c; i++){
            for(int j = 1; j <= r; j++){
                System.out.print("*");
            }
            System.out.println();
            if ( i == c ){
                System.out.println("This is the required shape having,");
                System.out.print("r = ");
                System.out.println(r);
                System.out.print("c = ");
                System.out.print(c);
            }
        }
    }   
}
