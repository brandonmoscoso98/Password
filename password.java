package CST;
import java.util.Scanner;
public class password {

    public static void main(String[]args){

        Scanner scan = new Scanner(System.in);

            System.out.println("Do you have an account");
            String choice = scan.next();
            String email = "";
            String password = "";
            if (choice.equalsIgnoreCase("no")) {
                System.out.println("Create Account");
                System.out.println("Enter your email: ");
                email = scan.next();
                System.out.println("Enter your password: ");
                password = scan.next();
            }
            System.out.println("Enter your login info ");
            System.out.println("Enter your email: ");
            String emailInp = scan.next();
            //created a loop to let the system lock out the user after too many attempts
            int i = 0;
        for ( i = 0; i < 3; i++) {
            System.out.println("Enter your password: ");
            String passwordInp = scan.next();
            if (emailInp.equalsIgnoreCase(email) && passwordInp.equalsIgnoreCase(password)) {
                System.out.print("Successful login");
                i = 4;
            } else {
                System.out.println("Wrong password! ");

                }
            }if (i == 3) {
            System.out.println("You have been locked out of the account for too many consecutive failed attempts.");

        }
    }
}
