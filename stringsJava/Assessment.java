//program 1 easy
//package stringsJava;
//public class Assessment {
//    public static void main(String[] args) {
//        String text = "INDIA";
//        String en = "";
//        String de= "";
//        for (char c : text.toCharArray()) {
//            en += (char) (c + 2);
//        }
//        for (char c : en.toCharArray()) {
//            de+= (char) (c - 2);
//        }
//
//        System.out.println("Encrypted: " + en);
//        System.out.println("Decrypted: " + de);
//    }
//}


//program 2
//package stringsJava;
//import java.util.*;  
//public class Assessment{  
//    public static void main(String[] args) {  
//        Scanner sc = new Scanner(System.in);  
//        System.out.print("Enter the string: ");  
//        String input = sc.nextLine();  
//        sc.close();  
//        StringBuilder res = new StringBuilder();  
//        for (char c : input.toCharArray()) {  
//            if (Character.isLetter(c)) res.append(c);  
//        }  
//        System.out.println("Output: " + res.toString());  
//    }  
//}
//Program 3(Easy)
//package stringsJava;
//import java.util.Arrays;
//public class Assessment {
//   public static void main(String args[]) {
//	           String[] names = {"Thoushi", "Vishu", "Varsh", "Tharani"};
//              Arrays.sort(names);
//	           System.out.println("Sorted Names:");
//	           for (String name : names) {
//	               System.out.println(name);
//	           }
//	       }
//	   }

// program 4
//package stringsJava;
//import java.util.*; 
//public class Assessment {  
//    public static void main(String[] args) {  
//        Scanner sc = new Scanner(System.in);  
//        System.out.print("Enter an uppercase string: ");  
//        String in = sc.nextLine();  
//        sc.close();  
//        int[] a= new int[26];  
//        for (char c : in.toCharArray()) {  
//            if (c >= 'A' && c <= 'Z') a[c - 'A']++;  
//        }  
//        for (int i = 0; i < 26; i++) {  
//            if (a[i] > 0) System.out.println((char) (i + 'A') + " : " + a[i]);  
//        }  
//    }  
//}

// Medium -1

//package stringsJava;
//import java.util.*;
//public class Assessment {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a sentence: ");
//        String a = sc.nextLine();
//        String b[] = a.replaceAll("[.]", "").split(" ");
//
//        Arrays.sort(b);
//
//        System.out.println("\nOutput:");
//        for (int i = 0; i < b.length; i++) {
//            System.out.print(b[i] + " ");
//            if (i == 1) { 
//                System.out.println("\n...Pls wait"); 
//            }
//        }
//    }
//}

//program 2

//package stringsJava;
//import java.util.*;  
//public class Assessment{  
//    public static void main(String[] args) {  
//        Scanner sc= new Scanner(System.in);  
//        System.out.print("Enter first name ");  
//        String fName = sc.next();  
//        System.out.print("Enter last name: ");  
//        String lName = sc.next();  
//        sc.close();  
//        String a = fName.substring(0, 3);  
//        String b = lName.substring(lName.length() - 3);  
//        int lengthSum = fName.length() + lName.length();  
//        String password = a + b + lengthSum;  
//        System.out.println("Generated Password: " + password.toLowerCase());  
//    }  
//}`

//Program 3 (Medium)

//package stringsJava;
//import java.util.*;
//import java.util.Arrays;
//import java.util.Scanner;
//public class Assessment{
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter no.of.names:");
//		int n=sc.nextInt();
//        String name[]=new String[n];
//		for(int i=0;i<n;i++) {
//			name[i]=sc.next();
//	}
//		 Arrays.sort(name);
//        System.out.println("Sorted Names:");
//        for(int i=0;i<n;i++) {
//            System.out.println(name[i]);
//      }
//	}
//}

//Program 4
//package stringsJava;
//import java.util.*;  
//public class Assessment{  
//    public static void main(String[] args) {  
//        Scanner sc = new Scanner(System.in);  
//        System.out.println("Enter a sentence:");  
//        String text = sc.nextLine().toLowerCase();  
//        sc.close();  
//
//        String vowels = "aeiou";  
//        int count = 0;  
//
//        System.out.print("Vowel pairs: ");  
//        for (int i = 0; i < text.length() - 1; i++) {  
//            char first = text.charAt(i);  
//            char second = text.charAt(i + 1);  
//
//            if (vowels.indexOf(first) != -1 && vowels.indexOf(second) != -1) {  
//                System.out.print(first + "" + second + " ");  
//                count++;  
//            }  
//        }  
//
//        System.out.println("\nTotal occurrences: " + count);  
//    }  
//}
//


//Hard -1
//package stringsJava;
//import java.util.Scanner;
//public class Assessment {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("1. Sender\n2. Receiver");
//		System.out.print("Enter your choice: ");
//		int choice = sc.nextInt();
//		sc.nextLine();
//
//		System.out.print("Enter key: ");
//		int key = sc.nextInt();
//		sc.nextLine();
//		System.out.print("Enter text: ");
//		String text = sc.nextLine();
//
//		if (choice == 1)
//			System.out.println("Encrypted text: " + a(text, key));
//		else if (choice == 2)
//			System.out.println("Decrypted text: " + a(text, -key));
//		else
//			System.out.println("Invalid choice!");
//	}
//
//	public static String a(String text, int key) {
//		char[] ch = text.toCharArray();
//		for (int i = 0; i < ch.length; i++) {
//			if (Character.isLetter(ch[i])) {
//				char d = Character.isUpperCase(ch[i]) ? 'A' : 'a';
//				ch[i] = (char) ((ch[i] - d + key + 26) % 26 + d);
//			}
//		}
//		return new String(ch);
//	}
//}

//package stringsJava;
//import java.util.*;
//public class Assessment{
//	    public static void main(String[] args) {
//	      Scanner sc=new Scanner(System.in);
//	      String pw=sc.nextLine();
//	      String pattern="(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{6,}";
//	      if(pw.matches(pattern)){
//	    	  System.out.println("Strong");
//	      }
//	      else{
//	    	 System.out.println("Not Strong");
//	      }
//	   }
//	}
