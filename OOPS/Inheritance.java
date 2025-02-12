//package OOPS;
// class Person {
//    String empName;
//    int empId;
//
//    void setData(String name, int id) {
//        empName = name;
//        empId = id;
//    }
//
//    void displayData() {
//        System.out.println("Employee Name: " + empName);
//        System.out.println("ID: " + empId);
//    }
//}
//
//class Manager extends Person {
//    String empDept;
//
//    void setDept(String dept) {
//        empDept = dept;
//    }
//
//    void displayMgrData() {
//        displayData(); // Call parent class method
//        System.out.println("Department: " + empDept);
//    }
//}
//public class Inheritance{
//    public static void main(String[] args) {
//        Manager mgr = new Manager();
//        mgr.setData("Thoushi", 101);
//        mgr.setDept("CSE");
//        mgr.displayMgrData();
//    }
//}

//package OOPS;
//class Person { 
//    private String name;
//    private String address;
//    private String mobile;
//    private String email;
//    private String gender;
//    public void createPersonDetail(String name, String mobile, String email, String gender, String address) {
//        name = name;
//        mobile = mobile;
//        email = email;
//        gender = gender;
//        address = address;
//    }
//    protected void viewPersonDetails() {
//        System.out.println("Name: " + name);
//        System.out.println("Address: " + address);
//        System.out.println("Mobile: " + mobile);
//        System.out.println("Email: " + email);
//        System.out.println("Gender: " + gender);
//    }
//}
//class Admin extends Person {
//    private String usertype;
//    Admin() {
//        usertype = "Administrator";
//    }
//
//    public void getUserType() {
//        System.out.println("User Type: " + usertype);
//    }
//}
//public class Inheritance {
//    public static void main(String args[]) {
//        Admin admin = new Admin();
//        admin.createPersonDetail("Admin", "123456", "admin@xyz.com", "Male", "Chennai");
//        admin.getUserType();
//        admin.viewPersonDetails();
//    }
//}
//MultiLevel Inheritance

//package OOPS;
//class Person {
//    private String name;
//    private String address;
//    private String mobile;
//    private String email;
//    private String gender;
//
//    public void createPersonDetail(String name, String mobile, String email, String gender, String address) {
//        this.name = name;
//        this.mobile = mobile;
//        this.email = email;
//        this.gender = gender;
//        this.address = address;
//    }
//    protected void viewPersonDetails() {
//        System.out.println("Name: " + name);
//        System.out.println("Address: " + address);
//        System.out.println("Mobile: " + mobile);
//        System.out.println("Email: " + email);
//        System.out.println("Gender: " + gender);
//    }
//}
//class User extends Person {
//    private String username;
//    private String role;
//    
//    public void setUserDetails(String username, String role) {
//        this.username = username;
//        this.role = role;
//    }
//
//    public void viewUserDetails() {
//        System.out.println("Username: " + username);
//        System.out.println("Role: " + role);
//    }
//}
//class Admin extends User {
//    private String adminPri;
//    
//    Admin() {
//        adminPri = "Full Control";
//    }
//
//    public void getAdminPri() {
//        System.out.println("Admin Privileges: " + adminPri);
//    }
//}
//public class Inheritance {
//    public static void main(String args[]) {
//        Admin admin = new Admin();
//        
//        admin.createPersonDetail("Thoushi", "9876543210", "thoushi@example.com", "Female", "New York");
//        admin.setUserDetails("admin", "Administrator");
//        admin.viewPersonDetails();  
//        admin.viewUserDetails();    
//    }
//}

//Hierarchial Inheritance
//package OOPS;
//
//class CricketPlayer {
//    String playerName;
//    String teamName;
//
//    void setPlayerData(String playerName, String teamName) {
//        this.playerName = playerName;
//        this.teamName = teamName;
//    }
//
//    void displayPlayerData() {
//        System.out.println("Player Name: " + playerName);
//        System.out.println("Team Name: " + teamName);
//    }
//}
//
//class Batsman extends CricketPlayer {
//    int hScore;
//    float batAvg;
//
//    void setBatsmanData(int hScore, float batAvg) {
//        this.hScore = hScore;
//        this.batAvg = batAvg;
//    }
//
//    void displayBatsmanData() {
//        System.out.println("Highest Score: " + hScore);
//        System.out.println("Batting Average: " + batAvg);
//    }
//}
//class Bowler extends CricketPlayer {
//    int wickets;
//    float bowlAvg;
//
//    void setBowlerData(int wickets, float bowlAvg) {
//        this.wickets = wickets;
//        this.bowlAvg = bowlAvg;
//    }
//
//    void displayBowlerData() {
//        System.out.println("Total Wickets: " + wickets);
//        System.out.println("Bowling Average: " + bowlAvg);
//    }
//}
//public class Inheritance {
//    public static void main(String args[]) {
//        Batsman B1 = new Batsman();
//        Bowler B2 = new Bowler();
//
//        B1.setPlayerData("Karmal", "India");
//        B1.setBatsmanData(200, 85.5f);
//
//        B2.setPlayerData("Naveen", "India");
//        B2.setBowlerData(140, 7.85f);
//
//        B1.displayPlayerData();
//        B1.displayBatsmanData();
//
//        B2.displayPlayerData();
//        B2.displayBowlerData();
//    }
//}

//Superkey word in method level
//package OOPS;                                                                                                                                       class ProjectLeader{
//	String proleadName="Ram Kumar";
//	int empId=1000;
//}
//class Programmer extends ProjectLeader{
//	String progName;
//	int empId;
//	
//	void setData(String name,int id) {
//		progName=name;
//		empId=id;
//	}
//	void displayData() {
//		System.out.println("Programmer Name:"+progName);
//		System.out.println("Programmer Id:"+empId);
//		System.out.println("Project Leader name:"+super.proleadName);
//		System.out.println("Project Leader ID:"+super.empId);	//access base class using super
//	}
//}
//public class Inheritance {
//	public static void main(String[] args) {
//		Programmer obj=new Programmer(); //child cls obj
//		obj.setData("Thoushi",1100);
//		obj.displayData();
//	}
//}

////Constructor and Inheritance
//package OOPS;
//class Base{
//	Base(){
//		System.out.println("INside Base Constructor");
//	}
//}
//	class Derived1 extends Base{
//		Derived1(){
//			System.out.println("Inside the Derived1 Constructor");
//		}
//	}
//	class Derived2 extends Derived1{
//		Derived2(){
//			System.out.println("Inside the Derived2 Constructor");
//		}
//	}
//	class Inheritance{
//		public static void main(String args[]) {
//			Derived2 obj=new Derived2();
//		}
//	}
	
//
//Assignment - 1 st question
//package OOPS;
//class Person {
//    String name;
//    String address;
//
//    public Person(String name, String address) {
//        this.name = name;
//        this.address = address;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    @Override
//    public String toString() {
//        return "Person{name=" + name + "address=" + address + "}";
//    }
//}
//
//class Student extends Person {
//    private String program;
//    private int year;
//    private double fee;
//   public Student(String name, String address, String program, int year, double fee) {
//        super(name, address); 
//        this.program = program;
//        this.year = year;
//        this.fee = fee;
//    }
//
//    public String getProgram() {
//        return program;
//    }
//
//    public void setProgram(String program) {
//        this.program = program;
//    }
//
//    public int getYear() {
//        return year;
//    }
//
//    public void setYear(int year) {
//        this.year = year;
//    }
//
//    public double getFee() {
//        return fee;
//    }
//
//    public void setFee(double fee) {
//        this.fee = fee;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{"+super.toString()+"program="+program+"year="+ year +"fee="+fee +"}";
//    }
//}
//
//class Staff extends Person {
//    private String school;
//    private double pay;
//
//    public Staff(String name, String address, String school, double pay) {
//        super(name, address); 
//        this.school = school;
//        this.pay = pay;
//    }
//
//    public String getSchool() {
//        return school;
//    }
//
//    public void setSchool(String school) {
//        this.school = school;
//    }
//
//    public double getPay() {
//        return pay;
//    }
//
//    public void setPay(double pay) {
//        this.pay = pay;
//    }
//  @Override
//    public String toString() {
//        return "Staff{" + super.toString()+"school=" + school+"pay="+pay +"}";
//    }
//}
//public class Inheritance {
//    public static void main(String[] args) {
//        Student student = new Student("Thoushi ", "New York ", "Computer Science ", 2024, 50000.0);
//        Staff staff = new Staff("Vishu ", "India ", "High School ", 60000.0);
//         System.out.println(student);
//        System.out.println(staff);
//    }
//}
//
//Assignment - 3rd question
//package OOPS;
//abstract class Shape{
//	protected  String color;
//	protected boolean filled;
//	public Shape() {
//		
//	}
//	void draw() {
//		System.out.println("draw");
//	}
//	public Shape(String color,boolean filled) {
//		this.color=color;
//		this.filled=filled;
//	}
//	public String getColor() {
//		return color;
//	}
//	public void setColor(String color) {
//		this.color=color;
//	}
//	public boolean getFilled() {
//		return filled;
//	}
//	public void setFilled(boolean filled) {
//		this.filled=filled;
//	}
//	
//	public abstract double getArea();
//	public abstract double getPerimeter();
//	@Override
//	public String toString() {
//		
//		return "Shape[color=" + color+" ,filled= "+filled+" ]";
//		
//	}
//	
//	
//	
//}
//class Circle extends Shape{
//    protected double radius;
//    public Circle() {
//    	
//    }
//    public Circle(double radius) {
//    	this.radius=radius;
//    }
//	public Circle(double radius,String color, boolean filled) {
//		super(color, filled);
//		this.radius=radius;
//	}
//	
//	public double getRadius() {
//		return radius;
//	}
//	public void setRadius(double radius) {
//		this.radius=radius;
//	}
//
//	@Override
//	public double getArea() {
//		
//		return (3.14*(radius*radius));
//	}
//
//	@Override
//	public double getPerimeter() {
//		
//		return (2*3.14*radius);
//	}
//	@Override
//	public String toString() {
//		
//		return "Circle[Shape[color=" + color+" ,filled= "+filled+" ,radius= "+radius+" ]";
//		
//	}
//}
//class Rectangle extends Shape{
//	protected double width;
//	protected double length;
//	
//	public Rectangle() {
//		
//	}
//
//	public Rectangle(double width,double length,String color, boolean filled) {
//		super(color, filled);
//		this.width=width;
//		this.length=length;
//	}
//	public Rectangle(double width,double length) {
//		this.width=width;
//		this.length=length;
//	}
//    
//	public double getWidth() {
//		return width;
//	}
//	public void setWidth(double width) {
//		this.width=width;
//	}
//	public double getLength() {
//		return width;
//	}
//	public void setLength(double length) {
//		this.length=length;
//	}
//	
//	@Override
//	public double getArea() {
//		
//		return length*width;
//	}
//
//	@Override
//	public double getPerimeter() {
//		return 2*(length+width);
//	}
//	
//	@Override
//	public String toString() {
//		
//		return "Rectangle[Shape[color=" + color+" ,filled= "+filled+" ,width= "+width+" ,length= "+length+"  ]";
//		
//	}
//	
//}
//class Square extends Rectangle{
//	public double side;
//	
//	public Square() {
//		
//	}
//	public Square(double side) {
//		this.side=side;
//	}
//
//	public Square(double side, String color, boolean filled) {
//		super(side,side,color, filled);
//		
//	}
//	
//	public double getSide() {
//		return width;
//	}
//	public void setSide(double side) {
//		this.side=side;
//	}
//	
//	public void setWidth(double side) {
//		this.side=side;
//	}
//	public void setLength(double side) {
//		this.side=side;
//	}
//	@Override
//    public String toString() {
//		
//		return "Square[Rectangle[Shape[color=" + color+" ,filled= "+filled+" ,width= "+width+" ,length= "+length+"  ]]";
//		
//	}	
//}
//
//public class Inheritance{
// public static void main(String [] args) {
//	 
//	 Square s=new Square(5,"red",true);
//	 System.out.println(s.toString());
//	 
//	 Rectangle r=new Rectangle(2,4,"blue",true);
//	 System.out.println(r.toString());
//	 
//	 Circle c=new Circle(3,"green",false);
//	 System.out.println(c.toString());
//	 
// }
//	
//}

//Assignment -4th Question
//package OOPS;
//import java.util.*;
//
//class Customer {
//    String name, address;
//    int customerID;
//
//    public Customer(String name, String address, int customerID) {
//        this.name = name;
//        this.address = address;
//        this.customerID = customerID;
//    }
//
//    public void displayCustomer() {
//        System.out.println("Customer ID: " + customerID);
//        System.out.println("Name: " + name);
//        System.out.println("Address: " + address);
//    }
//}
//
//class Account1 {
//    int accountNumber;
//    double balance;
//
//    public Account1(int accountNumber, double balance) {
//        this.accountNumber = accountNumber;
//        this.balance = balance;
//    }
//
//    public void displayAccount() {
//        System.out.println("Account Number: " + accountNumber);
//        System.out.println("Balance: Rs. " + balance);
//    }
//}
//
//class RBI {
//    Customer c;
//    Account1 a;  // Changed from Account to Account1
//
//    public RBI(Customer c, Account1 a) {
//        this.c = c;
//        this.a = a;
//    }
//
//    public double getInterestRate() {
//        return 4.0;
//    }
//
//    public double getWithdrawalLimit() {
//        return 50000;
//    }
//
//    public void displayDetails() {
//        c.displayCustomer();
//        a.displayAccount();
//        System.out.println("Interest Rate: " + getInterestRate() + "%");
//        System.out.println("Max Withdrawal Limit: Rs. " + getWithdrawalLimit());
//    }
//}
//
//class SBI extends RBI {
//    public SBI(Customer c, Account1 a) {
//        super(c, a);
//    }
//
//    @Override
//    public double getInterestRate() {
//        return 4.5;
//    }
//
//    @Override
//    public double getWithdrawalLimit() {
//        return 60000;
//    }
//}
//
//class ICICI extends RBI {
//    public ICICI(Customer c, Account1 a) {
//        super(c, a);
//    }
//
//    @Override
//    public double getInterestRate() {
//        return 5.0;
//    }
//
//    @Override
//    public double getWithdrawalLimit() {
//        return 70000;
//    }
//}
//
//class PNB extends RBI {
//    public PNB(Customer c, Account1 a) {
//        super(c, a);
//    }
//
//    @Override
//    public double getInterestRate() {
//        return 4.2;
//    }
//
//    @Override
//    public double getWithdrawalLimit() {
//        return 55000;
//    }
//}
//
//public class Inheritance {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Enter Customer ID: ");
//        int id = sc.nextInt();
//        sc.nextLine();  // Consume the newline
//
//        System.out.print("Enter Name: ");
//        String name = sc.nextLine();
//
//        System.out.print("Enter Address: ");
//        String address = sc.nextLine();
//
//        System.out.print("Enter Account Number: ");
//        int accNo = sc.nextInt();
//
//        System.out.print("Enter Balance: ");
//        double balance = sc.nextDouble();
//
//        Customer customer = new Customer(name, address, id);
//        Account1 account = new Account1(accNo, balance);
//
//        System.out.println("\nChoose Bank:\n1. SBI\n2. ICICI\n3. PNB");
//        int choice = sc.nextInt();
//
//        RBI bank;
//        switch (choice) {
//            case 1:
//                bank = new SBI(customer, account);
//                break;
//            case 2:
//                bank = new ICICI(customer, account);
//                break;
//            case 3:
//                bank = new PNB(customer, account);
//                break;
//            default:
//                System.out.println("Invalid choice. Defaulting to RBI.");
//                bank = new RBI(customer, account);
//        }
//
//        System.out.println("\nBank Details:");
//        bank.displayDetails();
//    }
//}
