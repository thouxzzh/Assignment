//package OOPS;
//import java.util.*;
//abstract class Shape {
//    void draw() {
//        System.out.println("drawing");
//    }
//    abstract void area();
//    abstract void perimeter();
//}
//class Rectangle extends Shape {
//    private int length,breadth;
//    
//    Rectangle(int length, int breadth) {
//        this.length = length;
//        this.breadth = breadth;
//    }
//    
//    @Override
//    void area() {
//        System.out.println("Area of Rectangle: " +(length * breadth));
//    }
//    
//    @Override
//    void perimeter() {
//        System.out.println("Perimeter of Rectangle: " +(2 * (length + breadth)));
//    }
//}
//
//class Square extends Shape {
//    private int side;
//    
//    Square(int side) {
//        this.side = side;
//    }
//    
//    @Override
//    void area() {
//        System.out.println("Area of Square: " + (side * side));
//    }
//    
//    @Override
//    void perimeter() {
//        System.out.println("Perimeter of Square: " + (4 * side));
//    }
//}
//
//class Circle extends Shape {
//    private double radius;
//    final static double PI = 3.14;
//    
//    Circle(double radius) {
//        this.radius = radius;
//    }
//    
//    @Override
//    void area() {
//        System.out.println("Area of Circle: " + (PI * radius * radius));
//    }
//    
//    @Override
//    void perimeter() {
//        System.out.println("Perimeter of Circle: " + (2 * PI * radius));
//    }
//}
//
//public class Abstraction {
//    public static void main(String args[]) {
//        Shape s;
//        
//        s = new Rectangle(3, 5);
//        s.area();
//        s.perimeter();
//        
//        s = new Square(5);
//        s.area();
//        s.perimeter();
//        
//        s = new Circle(4.5);
//        s.area();
//        s.perimeter();
//    }
//}

//package OOPS;
//import java.util.*;
//abstract class Payment {
//    protected double amount;
//    protected int transactionId;
//    protected String createdOn;
//    protected PaymentStatus status;
//    enum PaymentStatus {UNPAID, PAID}
//
//    Payment(int transid, String date) {
//        transactionId = transid;
//        amount = 0.0;
//        createdOn = date;
//        status = PaymentStatus.UNPAID;
//    }
//
//    public abstract void pay(double amt);
//}
//
//class Card extends Payment {
//    private int cardNumber;
//
//    Card(int transid, String date) {
//        super(transid, date);
//    }
//
//    @Override
//    public void pay(double amt) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your card number:");
//        cardNumber = sc.nextInt();
//        amount = amt;
//        System.out.println("Thank you for making payment");
//        status = PaymentStatus.PAID;
//    }
//
//    public void getCardDetails() {
//        System.out.println("Transaction ID: " + transactionId);
//        System.out.println("Amount: " + amount);
//        System.out.println("Created On: " + createdOn);
//        System.out.println("Payment Status: " + status);
//        System.out.println("Card Number: " + cardNumber);
//    }
//}
//
//class Cash extends Payment {
//    private double cashAmount;
//
//    Cash(int transid, String date) {
//        super(transid, date);
//    }
//
//    @Override
//    public void pay(double amt) {
//        amount = amt;
//        cashAmount = amt;
//        System.out.println("Thank you for cash payment");
//        status = PaymentStatus.PAID;
//    }
//
//    public void getCashDetails() {
//        System.out.println("Transaction ID: " + transactionId);
//        System.out.println("Amount: " + amount);
//        System.out.println("Created On: " + createdOn);
//        System.out.println("Payment Status: " + status);
//        System.out.println("Cash Payment: " + cashAmount);
//    }
//}
//
//public class Abstraction {
//    public static void main(String[] args) {
//        Card card = new Card(1234,"03/04/2025");
//        card.pay(120.0);
//        card.getCardDetails();
//        Cash cash = new Cash(1235,"03/04/2025");
//        cash.pay(480.0);
//        cash.getCashDetails();
//    }
//}

   

