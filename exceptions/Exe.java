//package exceptions;
//import java.lang.*;
//public class Exe {
//	public static void main(String args[]) {
//    try {
//    	String str=null;
//    	System.out.println(str.length());
//    }
//    catch(NullPointerException e) {
//    	System.out.println(e);
//    }
//    System.out.println("rest of code will be printed");
//	}
//}
//package exceptions;
//import java.lang.*;
//public class Exe {
//	public static void main(String[] args) {
//		try {
//			int a[]=new int[2];
//			System.out.println("Access element"+a[3]);		
//			}
//		catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
//			System.out.println(e.getMessage());
//			System.out.println(e);     
//			}
//		System.out.println("Out of block");
//	}
//}
//Hierarchy
//package exceptions;
//public class Exe {
//    public static void main(String[] args) {  
//        try {
//            int a[] = new int[5];  
//            a[5] = 30 / 0;  
//        }
//        catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Array Index Out of Bounds Exception: " + e);
//        }
//        catch (ArithmeticException e) {
//            System.out.println("Arithmetic Exception: " + e);
//        }
//        catch (Exception e) {
//            System.out.println("General Exception: " + e);
//        }
//        System.out.println("Code executed successfully!");
//    }
//}

//package exceptions;
//public class Exe {
//    static void validate(int num) {  
//        if (num < 0) {  
//            throw new ArithmeticException("Invalid value");  
//        }
//        else {  
//            System.out.println("Valid to process");
//        }
//    }
//
//    public static void main(String args[]) {
//        try {
//            validate(-10);  
//        } 
//        catch (Exception e) {
//            System.out.println("Error" + e);  
//        }
//        System.out.println("Code executed successfully!");
//    }
//}

//package exceptions;
//public class Exe {
//	static void fun() throws IllegalAccessException{
//		System.out.println("Inside fun().");
//		throw new IllegalAccessException("demo");
//	}
//	public static void main(String args[]) {
//		try {
//			fun();
//		}
//		catch(IllegalAccessException e) {
//			System.out.println("caught in main");
//		}
//	}
//}


//package exceptions;
//import java.io.*;
//public class Exe {
//    void myMethod(int num) throws IOException, ClassNotFoundException {
//        if (num == 1) {
//            throw new IOException("IO Exception Occurred");
//        } else {
//            throw new ClassNotFoundException("Class Not Found Exception");
//        }
//    }
//
//    public static void main(String args[]) {
//        try {
//            Exe obj = new Exe();  
//            obj.myMethod(1); 
//        }
//        catch (IOException ex) {  
//            System.out.println("Caught IOException " + ex);
//        } 
//        catch (ClassNotFoundException ex) {
//            System.out.println("Caught ClassNotFoundException" + ex);
//        } 
//        catch (Exception ex) {
//            System.out.println("Caught General Exception " + ex);
//        }
//    }
//}

//package exceptions;
//import java.lang.*;
//class Exe{
//	public static void main(String args[]) {
//		try {
//			int data=25/0;
//			System.out.println(data);
//		}
//		catch(NullPointerException e) {
//			System.out.println(e);
//		}
//		finally {
//			System.out.println("Code executed successfully");
//		}
//		System.out.println("rest of code executed");
//	}
//}

//package exceptions;
//class InvalidAgeException extends Exception {  
//    InvalidAgeException(String s) {
//        super(s);  
//    }
//}
//class Exe{
//    static void validate(int age) throws InvalidAgeException {
//        if (age < 18) {
//            throw new InvalidAgeException("Not eligible");
//        } else {
//            System.out.println("Eligible");
//        }
//    }
//public class Excep{
//    public static void main(String args[]) {
//        try {
//            Exe.validate(13);  
//        } 
//        catch (InvalidAgeException e) {  
//            System.out.println("Exception caught" + e);
//        }
//        System.out.println("Executed");
//    }
//}
//}

