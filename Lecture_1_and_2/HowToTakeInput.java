import java.util.*;

public class HowToTakeInput {
    public static void main(String[] args) {
        System.out.print("Please enter your name to know your name, :')\n->");
        Scanner scan_name = new Scanner(System.in);
        String user_name = scan_name.next();
        System.out.print("Your name is ... ");
        System.out.print(user_name);
        System.out.println("\nThank me later ... xD");
    }
}
