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
//Program 3 (Medium)
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


