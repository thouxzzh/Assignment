///Overloading
//package OOPS;
//class Polymorphism {
//    static int add(int a, int b) {
//        return a + b;
//    }
//    static double add(double a, double b) {
//        return (int)(a + b);
//    }
//    public static void main(String[] args) {
//        System.out.println("Addition of integers " +add(5, 10));
//        System.out.println("Addition of doubles " +add(3.5, 2.5));
//    }
//}
//Overriding
//package OOPS;
//class Vehicle{
//	void run() {
//		System.out.println("Vehicle is running");
//	}
//}
//class Truck extends Vehicle{
//	void run() {
//		System.out.println("Truck is running");
//	}
//}
//public class Polymorphism{
//public static void main(String args[]) {
//	Vehicle obj=new Vehicle();
//	obj.run();
//	Truck obj1=new Truck();
//	obj1.run();
//}
//}

//final keyword(variable)
//package OOPS;
//class Sample{
//	final double pi=3.14159;
////	public Sample() {
////		pi=3.14;
//}
//
//	public class Polymorphism{
//	public static void main(String args[]) {
//		Sample obj=new Sample();
//		System.out.println(obj.pi);
//		}
//	}


//final method
//class
//final class Base{
//	public final void display(String s) {
//		System.out.println(s);
//	}
//}
//class Sample extends Base{
//	public void display(String s) {
//		System.out.println(s);
//	}
//}
//public class Polymorphism{
//	public static void main(String[] args) {	
//		Sample obj=new Sample();
//		obj.display("TRY ME");
//	}
//}
