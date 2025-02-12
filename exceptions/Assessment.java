package exceptions;
import java.util.*;
class NoMatchException extends Exception {
    NoMatchException(String message) {
        super(message);
    }
}
public class Assessment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a,b,c,d,f;
        System.out.print("Enter Aadhar Number: ");
        a = sc.nextLine();
        System.out.print("Enter Name: ");
        b = sc.nextLine();
        System.out.print("Enter City: ");
        c= sc.nextLine();
        System.out.print("Enter State: ");
        d = sc.nextLine();
        System.out.print("Enter Country: ");
        f = sc.nextLine();

        try {
            if (!f.equalsIgnoreCase("India")) {
                throw new NoMatchException("Country must be India");
            }

            System.out.println("\nCitizen Details:");
            System.out.println("Aadhar Number: " +a);
            System.out.println("Name: " +b);
            System.out.println("City: " +c);
            System.out.println("State: " +d);
            System.out.println("Country: " +f);
        } catch (NoMatchException e) {
            System.out.println("Error: " +e);
        }
    }
}
