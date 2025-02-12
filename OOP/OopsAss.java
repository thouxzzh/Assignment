 //Toolbooth
//package OOP;
//import java.util.*;
//class TollBooth {
//     private int vehicle;
//     private double cash;
//
//     public TollBooth() {
//         this.vehicle = 0;
//         this.cash = 0.0;
//     }
//     public void payingVehicle() {
//         this.vehicle++;
//         this.cash += 0.50;
//     }
//     public void noPayVehicle() {
//         this.vehicle++;
//     }
//     public void display() {
//         System.out.println("Total Vehicles Passed " +this.vehicle);
//         System.out.println("Total Cash Collected " +this.cash);
//     }
// }
//
// public class OopsAss{
//     public static void main(String[] args) {
//         TollBooth obj = new TollBooth();
//         Scanner sc= new Scanner(System.in);
//
//         while (true) {
//             System.out.println("Paying Vehicle");
//             System.out.println("Non-Paying Vehicle");
//             System.out.println("Exit and Show Summary");
//             System.out.print("Enter your choice");
//             int choice = sc.nextInt();
//             if (choice == 1) 
//            	 obj.payingVehicle();
//             else if (choice == 2) 
//            	 obj.noPayVehicle();
//             else if (choice == 3) {
//                 obj.display();
//                 return;
//             }
//             else 
//            	 System.out.println("Invalid choice. Try again.");
//         }
//     }
// }
// 
//Browsing Centre
package OOP;
import java.util.Scanner;
public class OopsAss{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of members:");

        int n = sc.nextInt();

        Browse c = new Browse(n);

        for (int i = 0; i < n; i++) {

            System.out.println("Enter 1 for Prime Member, 2 for Normal Member:");

            int type = sc.nextInt();

            System.out.println("Enter Member ID, Name, Location:");

            int id = sc.nextInt();

            String name = sc.next();

            String location = sc.next();

            if (type == 1) {

                System.out.println("Enter number of weeks:");

                int weeks = sc.nextInt();

                c.addPrimeMember(id, name, location, weeks);

            } else if (type == 2) {

                System.out.println("Enter number of hours:");

                int hours = sc.nextInt();

                c.addNormalMember(id, name, location, hours);

            }

        }

        c.displayHighPayingNormalMembers();



    }

}

class Browse {

    int[] memid;

    String[] memname;

    String[] memlocation;

    String[] memtype;

    double[] membill;

    int count;

    Browse(int n) {

        memid = new int[n];

        memname = new String[n];

        memlocation = new String[n];

        memtype = new String[n];

        membill = new double[n];

        count = 0;

    }

    public void addPrimeMember(int id, String name, String location, int weeks) {

        if (count < memid.length) {

            memid[count] = id;

            memname[count] = name;

            memlocation[count] = location;

            memtype[count] = "Prime";

            membill[count] = weeks * 500;

            count++;

        }

    }

    public void addNormalMember(int id, String name, String location, int hours) {

        if (count < memid.length) {

            memid[count] = id;

            memname[count] = name;

            memlocation[count] = location;

            memtype[count] = "Normal";

            membill[count] = hours * 50;

            count++;

        }

    }

    public void displayHighPayingNormalMembers() {

        System.out.println("Normal Members paying more than 2,000 per month:");

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (memtype[i].equals("Normal") && membill[i] > 2000) {

                System.out.println("ID: " + memid[i] + ", Name: " + memname[i] + ", Location: " + memlocation[i] + ", Bill: ₹" + membill[i]);

                found = true;

            }

        }

        if (!found) {

            System.out.println("No normal members with bill > 2,000.");

        }

    }

}


 


