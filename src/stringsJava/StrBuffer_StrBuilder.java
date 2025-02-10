//append
//package stringsJava;
//import java.util.*;
//public class StrBuffer_StrBuilder {
//	public static void main(String args[]) {
//  StringBuffer s1=new StringBuffer("Hello ");
//  s1.append("World");
//  System.out.println(s1);
//}
//}

//insert method
//package stringsJava;
//import java.util.*;
//public class StrBuffer_StrBuilder {
//    public static void main(String args[]) {
//        StringBuilder s1 = new StringBuilder("I want a Job");
//        StringBuilder s2 = new StringBuilder("Success");
//        StringBuilder s3 = new StringBuilder("Helping");
//        StringBuilder s4 =new StringBuilder("step");
//        
//
//        s1.insert(2, " really"); 
//        s2.replace(2, 3, "TTTT");
//        s3.delete(1,4);
//        s4.reverse();
//       
//
//        System.out.println(s1); 
//        System.out.println(s2);
//        System.out.println(s3);
//        System.out.println(s4);
//        
//    }
//}
//capacity
//package stringsJava;
//import java.util.*;
//public class StrBuffer_StrBuilder {
//	public static void main(String args[]) {
//  StringBuffer s1=new StringBuffer();
// 
//  System.out.println("s1"+s1+"capacity "+s1.capacity());
//  s1.append("Java");
//  System.out.println("s1"+s1+"capacity "+s1.capacity());
//  s1.append("is my favourite Language");
//  System.out.println("s1"+s1+"capacity "+s1.capacity());
//  s1.append("Hello this");
//  System.out.println("s1"+s1+"capacity "+s1.capacity());
//}
//}

//concate
//package stringsJava;
//import java.util.*;
//public class StrBuffer_StrBuilder{
//	public static void concat1(String s1) {
//		s1=s1+"Ram";
//	}
//	public static void concat2(StringBuilder s2) {
//		s2.append("Raj");
//	}
//	public static void concat3(StringBuilder s3) {
//		s3.append("Ravi");
//	}
//	public static void main(String args[]) {
//		String s1="Hello,";
//		concat1(s1);
//		System.out.println("String "+s1);
//		
//		StringBuilder s2=new StringBuilder("Hello,");
//		concat2(s2);
//		System.out.println("StringBuilder:"+s2);
//		
//		StringBuffer s3=new StringBuffer("Hello,");
//		concat3(s3);
//		System.out.println("StringBufferL"+s3);
//	}
//}

//package stringsJava;
//import java.util.*;
//
//public class StrBuffer_StrBuilder {
//    public static void concat1() {
//        String s1 = "Thoushi";
//        String s2 = "Twinkle";
//        System.out.println(s1.compareTo(s2)); 
//    }
//
//    public static void main(String args[]) {
//        concat1();
//    }
//}

package stringsJava;
import java.util.*;
public class StrBuffer_StrBuilder{
	    public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
	      String pw=sc.nextLine();
	      String pattern="(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{6,}";
	      if(pw.matches(pattern)){
	    	  System.out.println("Strong");
	      }
	      else{
	    	 System.out.println("Not Strong");
	      }
	   }
	}