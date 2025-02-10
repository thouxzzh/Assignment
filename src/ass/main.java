package ass;
import java.util.*;
//public class main {
//	public static void main(String args[]) {
//		 Scanner sc=new Scanner(System.in);
//		 System.out.println("Enter the name of the user");
//		 String name=sc.next();
//		 System.out.println("Enter the age of the user");
//		 int age=sc.nextInt();
//		 System.out.println("Enter the wages of the user");
//		 int wages=sc.nextInt();
//		 System.out.println("Enter the no of days worked of the user");
//		 int days=sc.nextInt();
//		int totalsalary= days*wages;
//		System.out.println("The total salary is: "+totalsalary);
//}
//}
//Question 2
   public class main{
   public static void main(String args[]) {
   	Scanner sc=new Scanner(System.in);
   	int number =14;
   	if(number%7==0) {
   		System.out.println("It is divisable");
   	}
   	else {
   		System.out.println("It is not divisable");
   	}
   }
   }
////Question 3
//      public class main{
//	  public static void main(String args[]) {
//		  Scanner sc=new Scanner(System.in);
//		  System.out.println("Enter the age");
//		  int age=sc.nextInt();
//		  System.out.println("Enter the weight of the user");
//		  int weight=sc.nextInt();
//		  if((age<18 && age>55) || ( weight>45)) {
//			  System.out.println("Eligible for blood donation");
//		  }
//		  else {
//			  System.out.println("Not eligible for blood donation");
//		  }
//	  }
//}
 //Question 4
//public class main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a character:");
//        char ch = sc.next().charAt(0); 
//        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
//            System.out.println(ch + " is an alphabet");
//        } 
//        else if (ch >= '0' && ch <= '9') {
//            System.out.println(ch + " is a digit");
//        } 
//        else {
//            System.out.println(ch + " is a special symbol");
//        }
//
//    }
//}
//Question 5
//public class main{
//	public static void main(String args[]) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the age");
//		int age=sc.nextInt();
//		System.out.println("Enter the weight");
//		int weight=sc.nextInt();
//		if(age>18) {
//			if(weight>50)
//				System.out.println("You are eligible");
//			else
//				System.out.println("You are not eligible");
//		}
//		else {
//			System.out.println("Not eligible because you are under age");
//		}
//		
//	}
//}
//public class main{
//	public static void main(String args[]) {
//		Scanner sc=new Scanner(System.in);
//		String username="Sarvesh",password="sarvesh@3",usernameentered,passwordentered;
//		boolean seatno=true;
//		System.out.println("Enter the username");
//		String usernameentered=sc.next();
//		System.out.println("Enter the password");
//		
//		String seatno;
//		
//		if(username.equals(usernameentered)&& password.equals(passwordentered))
//	   {
//			if(seatno==true) 
//				System.out.println("Your seatno is booked");
//			else 
//				System.out.println("your seatno is not booked");
//	    }
//		else {
//			System.out.println("you are not logged in");
//	}
//		
//	}
//}
// public class main {
//    public static void main(String[] args) {
//    	  char letter = 'A';
//    	    switch (letter) {
//    	       case 'a':
//    	         System.out.println("Lowercase");
//    	          break;
//    	        case 'A':
//    	          System.out.println("Uppercase");
//    	          break;
//    	        default:
//    	          System.out.println("Not valid");
//    	        }
//    	    }
//    	}
// public class main{
//    public static void main(String args[]) {
//      Scanner sc=new Scanner(System.in);
//      System.out.println("Enter your search");
//      System.out.println("1.Search by title\n 2.Search by Language\n 3.Search by Date\n 4.Search by Genre");
//      System.out.println("Enter your choice");
//      int choice=sc.nextInt();
//      switch(choice) {
//      case 1:
//	      System.out.println("your search is based on title");
//	      break;
//     case 2:
//	      System.out.println("your search is based on Language");
//	      break;
//     case 3:
//	      System.out.println("your search is based on date");
//	      break;
//     case 4:
//	      System.out.println("your search is based on Genre");
//	      break;
//     default:
//	      System.out.println("your search is not valid");
//	      break;
//}
//}
//}
//Looping(while)
//public class main {
//	    public static void main(String[] args) {
//	        int maxSeatCount = 10, seatCount = 0;
//        while (seatCount < maxSeatCount) {
//	            System.out.println("Current Seat count" +(maxSeatCount - seatCount));
//	            seatCount++;
//	        }
//
//	        System.out.println("Seats are filled");
//	    }
//	}
//Looping (dowhile)
//public class main {
//    public static void main(String[] args) {
//        int maxSeatCount = 10, seatCount = 0;
//        do {
//            System.out.println("Current Seat count" +(maxSeatCount - seatCount));
//            seatCount++;
//        } while (seatCount < maxSeatCount);
//
//        System.out.println("Seats are filled");
//    }
//}
//Looping(for)
//public class main {
//    public static void main(String[] args) {
//        int maxSeatCount = 10;
//
//        for (int seatCount = 0; seatCount < maxSeatCount; seatCount++) {
//            System.out.println("Current Seat count: " +(maxSeatCount - seatCount));
//        }
//
//        System.out.println("Seats are filled");
//    }
//}
//Looping(for each)
//public class main {
//    public static void main(String[] args) {
//        int[] marks = {125, 132, 95, 116, 110};
//        int maxSoFar = marks[0];
//        for (int mark : marks) {
//            if (mark > maxSoFar) {
//                maxSoFar = mark;
//            }
//        }
//
//        System.out.println("The maximum value is " +maxSoFar);
//    }
//}
//  public class main{
// 	 public static void main(String args[]) {
//  Scanner sc=new Scanner(System.in);
//  String moviename[]= {"AAA","BBB","CCC","DDD"};
//   String moviegenre[]= {"COMEDY","THRILLER","ACTION","ACTION"};
//   String input=sc.nextLine();
//   System.out.println("Enter genre to be searched:");
//   String genre=sc.nextLine();
//   int counter=0;
//   for(int i:moviegenre){
//     if(i.equals(genre)) {
//        System.out.println(moviegenre+" movies are "+moviename[counter]);
// }
// }
// }
// }
//(Nested Loop)
//public class main{
//    public static void main(String[] args){
//        int maxSeatCount = 5, totalScreenCount = 2, seatCount = 0, screenCount = 0;
//        while (screenCount < totalScreenCount){
//            seatCount = 0;
//            System.out.println("Screen " + (screenCount + 1) + " Availability details");
//
//            while (seatCount < maxSeatCount){
//                System.out.println("Current Seat: " +(maxSeatCount - seatCount));
//                seatCount++;
//            }
//
//            screenCount++;
//        }
//    }
//}
//converting the above code into do while
//public class main{
//    public static void main(String[] args){
//        int maxSeatCount = 5, totalScreenCount = 2, seatCount = 0, screenCount = 0;
//
//        do{
//            seatCount = 0;
//            System.out.println("Screen " + (screenCount + 1) + "Availability details");
//
//            do{
//                System.out.println("Current Seat " + (maxSeatCount - seatCount));
//                seatCount++;
//            }while (seatCount < maxSeatCount);
//
//            screenCount++;
//        }while (screenCount < totalScreenCount);
//    }
//}

////Branching-Unconditional(break)
//public class main{
//    public static void main(String args[]) {
//        int premiumseat=5,vipseat=5,seatbooked=0;
//       int total=premiumseat+vipseat;
//       for(seatbooked=0;seatbooked<total;seatbooked++) {
//       if(seatbooked>premiumseat) {
//            System.out.println("All premium seats are booked\n All Vip seats are reserved");
//            break;
//       }
//       else {
//          System.out.println("premium seat availability:"+ (premiumseat-seatbooked));
//}
//}
// }
//}
////Branching - unconditional(continue)
//public class main{
//	public static void main(String args[]) {
//    int exeseat=5,premiumseat=5,vipseat=5,seatbooked=0,regularseat=0;
//    int total=regularseat+exeseat+premiumseat+vipseat;
//    for(seatbooked=0;seatbooked<total;seatbooked++) {
//    if(seatbooked<(vipseat)) {
//      System.out.println("All vip seats are reserved");
//      continue;
//     }
//    else if(seatbooked<(vipseat+premiumseat)) {
//      System.out.println("Premium seatno: "+(seatbooked+1));
//    }
//    else if(seatbooked<(vipseat+premiumseat+exeseat)) {
//      System.out.println("Premium seatno: "+(seatbooked+1));
//}
//}
//}
//}
//////Branching(Unconditional-Label)
// public class main {
//	  public static void main(String args[]) 
//		  int maxSeatCount=10,totalScreenCount=2,seatCount=0,screenCount=-1;
//		  Start:
//		   while(screenCount < totalScreenCount) {
//			   screenCount++;
//			   System.out.println("Screen"+(screenCount+1)+" Seat Booked detail");
//			   seatCount=0;
//			   while(seatCount < maxSeatCount) {
//				   if(seatCount >=3 && screenCount==1) {
//					   System.out.println("Seat no 4 and 5 are Reserved");
//					  break Start;
//				   }
//				   else
//					   System.out.println("Seats No booked: "+(seatCount+1));
//				   seatCount++;
//			   }
//			   System.out.println("All Seats filled in Screen"+(screenCount+1));
//		   }
//		  
//	  }
// }

 