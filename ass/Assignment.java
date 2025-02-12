////Control Flow Statements(Easy)
 //Question 1
// package ass;
// import java.util.*;
// public class Assignment{
//	 public static void main(String args[]) {
//		 Scanner sc=new Scanner(System.in);
//		 System.out.println("Enter the employee Details:");
//		 System.out.println("Enter the employee name:");
//		 String name=sc.next();
//		 System.out.println("Enter the employee age:");
//		 int age=sc.nextInt();
//		 System.out.println("Enter the Wages per day:");
//		 int wages=sc.nextInt();
//		 System.out.println("Enter the Number of Days worked:");
//		 int daysWorked=sc.nextInt();
//		 int totalSalary=wages*daysWorked;
//		 System.out.println("Name of the Employee: "+name);
//		 System.out.println("Age of the Employee: "+age);
//		 System.out.println("TotalSalary: "+totalSalary);
//	 }
// }
 
 //Question 2
// package ass;
// import java.util.*;
// public class Assignment{
//	 public static void main(String args[]) {
//		 Scanner sc=new Scanner(System.in);
//		 System.out.println("Enter the number");
//		 int num=sc.nextInt();
//		 if(num%7==0) {
//			 System.out.println("The number is divisor of 7");
//		 }
//		 else {
//			 System.out.println("The number is not divisor of 7");
//			 }
//	 }
// }
 
//Question 3
//package ass;
//import java.util.*;
//public class Assignment {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a character: ");
//        char ch = sc.next().charAt(0);
//        switch (ch) {
//            case 'a':
//            case 'e':
//            case 'i':
//            case 'o':
//            case 'u':
//            case 'A':
//            case 'E':
//            case 'I':
//            case 'O':
//            case 'U':
//                System.out.println(ch + " is a vowel");
//                break;
//            default:
//                if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
//                    System.out.println(ch + " is a consonant");
//                } else {
//                    System.out.println(ch + " is a symbol");
//                }
//        }
//    }
//}


//Question 4
//package ass;
//import java.util.*;
//public class Assignment{
//	 public static void main(String args[]) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number");
//		int num=sc.nextInt();
//		int sum=0;
//		int count=1;
//		do {
//			sum+=count;
//			count++;
//		}while(count<=num);
//		System.out.println("The sum of the series is "+sum);
//	 }
//}

////Question 5
//package ass;
//import java.util.*;
//public class Assignment{
//	 public static void main(String args[]) {
//		char s1='a';
//		char s2='z';
//		for(int i=1;i<26;i++) {
//			System.out.print(s1+""+ s2+" ");
//			s1++;
//			s2--;
//	 }
//}
//}
//Question 6
//package ass;
//import java.util.*;
//public class Assignment {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int count = 0;
//         while (true) {
//        	System.out.print("Enter an integer: ");
//            int num = sc.nextInt();
//            if (num < 0) {
//                break;
//            }
//           count += num;
//            for (int i = 0; i < num; i++) {
//                System.out.println("Hello");
//            }
//        }
//      System.out.println("Total number of Hello displayed: " +count);
//    }
//}


//Question 7
//package ass;
//import java.util.*;
//public class Assignment{
//	public static void main(String args[]) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the age");
//		int age=sc.nextInt();
//		System.out.println("Enter the weight");
//		int weight=sc.nextInt();
//		if(age>18) {
//			if(weight>50) 
//				System.out.println("You are eligible for blood donor");
//			else
//				System.out.println("You are not eligible for blood donor");
//		}
//		else
//			System.out.println("No Appropriate for blood donor criteria");
//		}
//}

//Question 8
// package ass;
// import java.util.*;
// public class Assignment{
//	 public static void main(String args[]) {
//		 Scanner sc=new Scanner(System.in);
//		 System.out.println("Enter a character");
//		 char ch=sc.next().charAt(0);
//		 if((ch>='a'&& ch<='z') || (ch>='A' && ch<='Z'))
//			 System.out.println(ch+" is an alphabet");
//		 else if(ch>='0' && ch<='9') 
//			 System.out.println(ch+" is an digit");
//		 else
//			 System.out.println(ch+" is an special symbol");
//	 }
// }

////Question 9
//package ass;
//import java.util.*;
//public class Assignment{
//public static void main(String args[]) {
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter an number");
//	int num=sc.nextInt();
//	int sum=0;
//	while(num!=0){
//		sum+=num%10;
//		num=num/10;
//	}
//	System.out.println("Sum of digits "+sum);
//}	
//}

////Question 10
//package ass;
//import java.util.*;
//public class Assignment{
//	public static void main(String args[]) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the values");
//		int n=sc.nextInt();
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(i+ " ");
//			}
//			System.out.println();
//		}
//	}
//}

////Control Flow Statements(Medium)
//Question 1
//package ass;
//import java.util.*;
//public class Assignment{
//	public static void main(String args[]) {
//		int a=86400;
//		int b=7;
//		int c= a*b;
//		System.out.println("The seconds are in the week are "+c);
//	}
//}

////Question 2
//package ass;
//import java.util.*;
//public class Assignment{
//	public static void main(String args[]) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the price of an item");
//		 int item=sc.nextInt();
//		System.out.println("Enter the quantity purchased");
//		int q=sc.nextInt();
//		int cost=item*q;
//		if(q>500) {
//			double dis=0.15*cost;
//			cost-=dis;
//			System.out.println("A discount of 15% has been applied");
//		}
//		System.out.println("Total expenses: "+cost);
//	}
//}

////Question 3
//package ass;
//import java.util.*;
//public class Assignment{
//	public static void main(String args[]) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the number of pages typed");
//		int tyPg=sc.nextInt();
//		System.out.println("Enter the number of pages printed");
//		int prPg=sc.nextInt();
//		System.out.println("Enter the no of copies for each printed page");
//		int noCp=sc.nextInt();
//		int tyCs=tyPg * 3;
//        int prCs= 0;
//        if (noCp > 0) {
//            prCs += prPg; 
//            prCs += prPg * 3 * (noCp - 1); 
//        }
//        int cost= tyCs + prCs;
//        System.out.println("Total cost: Rs " + cost);
//    }
//}

////Question 4
//package ass;
//import java.util.*;
//public class Assignment {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a= 50;
//        int b= 1;
//        int c= 200;
//        int d= 7;
//        System.out.print("Enter browsing hours ");
//        int hr = sc.nextInt();
//        System.out.print("Enter additional minutes ");
//        int min = sc.nextInt();
//        if (hr > d || (hr == d && min > 0)) {
//            System.out.println("Time cannot exceed 7 hours");
//        } else {
//            int bill = 0;
//            if (hr >= 5) {
//                bill = c; 
//                hr -= 5; 
//            }
//            bill += hr * a; 
//            bill += min * b; 
//            System.out.println("Total bill: Rs. " + bill);
//        }
//    }
//}

 //Question 5
//package ass;
//import java.util.*;
//public class Assignment {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter month number: ");
//        int m = sc.nextInt();
//        if (m < 1 || m > 12) {
//            System.out.println("Invalid month");
//            return;
//        }
//        System.out.print("Enter the start day of the month");
//        int s = sc.nextInt();
//        if (s < 1 || s > 7) {
//            System.out.println("Invalid day");
//            return;
//        }
//        int d = getDaysInMonth(m);
//        System.out.println("\n" + getMonthName(m) + " Calendar");
//        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
//        for (int i = 1; i < s; i++) System.out.print("    ");
//        for (int day = 1; day <= d; day++) {
//            System.out.printf("%3d ", day);
//            if ((s + day - 1) % 7 == 0) System.out.println();
//        }
//        System.out.println();
//    }
//
//    public static int getDaysInMonth(int month) {
//        if (month == 2) return 28;
//        if (month == 4 || month == 6 || month == 9 || month == 11) return 30;
//        return 31;
//    }
//    public static String getMonthName(int month) {
//        switch (month) {
//            case 1: return "January";
//            case 2: return "February";
//            case 3: return "March";
//            case 4: return "April";
//            case 5: return "May";
//            case 6: return "June";
//            case 7: return "July";
//            case 8: return "August";
//            case 9: return "September";
//            case 10: return "October";
//            case 11: return "November";
//            case 12: return "December";
//            default: return "";
//        }
//    }
//}

////Question 6
//package ass;
//import java.util.*;
//public class Assignment{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the price of the item ");
//        double p = sc.nextDouble();
//        System.out.print("Enter the quantity ");
//        int q= sc.nextInt();
//        double amt= p* q;
//        double dis;
//        if (p > 1000) {
//            dis = amt * 0.10;
//        } else {
//            dis = amt * 0.05;
//        }
//
//        double Amt = amt - dis;
//        System.out.println("Amount to be Paid: Rs" +Amt);
// }
//}
//Question 7
//  package ass;
//  import java.util.*;
//	public class Assignment{
//	    public static void main(String[] args) {
//	        Scanner sc = new Scanner(System.in);
//	        System.out.println("Enter the basic salary of the employee:");
//	        double s= sc.nextDouble();
//	        double hra= 0, da = 0;
//	        if (s <= 10000) {
//	            hra = 0.20 * s; 
//	            da = 0.80 * s; 
//	        } else if (s <= 20000) {
//	            hra = 0.25 * s; 
//	            da = 0.90 * s; 
//	        } else { 
//	            hra = 0.30 * s;
//	            da = 0.95 * s; 
//	        }
//
//	        double g = s + hra + da;
//	        System.out.println("Gross Salary: Rs " + g);
//	    }
//	}

//Question 8
//package ass;
//import java.util.*;
//public class Assignment {
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter String: ");
//        String str = sc.next();
//        int let= 0, dig = 0, sym = 0;
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//            if (Character.isLetter(ch)) {
//                let++;
//            } 
//            else if (Character.isDigit(ch)) {
//                dig++;
//            } 
//            else if (!Character.isWhitespace(ch)) {
//                sym++;
//            }
//        }
//       System.out.println("Letters: " + let+ ", Digits: " + dig+ ", Symbols: " + sym);
//    }
//}

//Question 9
//package ass;
//import java.util.*;
//public class Assignment{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num = sc.nextInt();
//        int orgNum = num;
//        int res = 0;
//        int n = 0;
//        while (orgNum!= 0) {
//            orgNum /= 10;
//            n++;
//        }
//        orgNum = num;
//        while (orgNum != 0) {
//            int digit = orgNum % 10;
//            res += Math.pow(digit, n);
//            orgNum /= 10;
//        }
//        if (res == num) {
//            System.out.println(num + " is an Armstrong number.");
//        } else {
//            System.out.println(num + " is not an Armstrong number.");
//        }
//    }
//}
	
//	Hard(Question 1)
//package ass;
//import java.util.*;
//import java.util.Arrays;
//public class Assignment {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter String: ");
//        String in= sc.next();
//        char[] ch = in.toCharArray();
//        Arrays.sort(ch);
//        System.out.print("Sorted characters: ");
//        for (char c:ch) {
//            System.out.print(c);
//        }
//    }
//}

//Question 2
//package ass;
//import java.util.*;
//public class Assignment {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        double a = 0; 
//        int b = 0;
//        while(true) {
//            System.out.print("Enter Exercise Grade: ");
//            double c = sc.nextDouble();
//            if(c == -1) 
//                break;
//            System.out.print("Enter Exam Grade: ");
//            double d = sc.nextDouble();
//            if(d == -1)
//                break; 
//            if(c < 0 || c > 10 || d < 0 || d > 10) {
//                System.out.println("Invalid input");
//                continue;
//            }
//            double e;
//            if(c >= 5 && d >= 5) {
//                e = c * 0.30 + d * 0.70;
//            }
//            else {
//                e = Math.min(c, d);
//            }
//            System.out.println("Final Grade: " +e);
//            a += e;
//            b++;
//        }
//        if (b > 0) {
//            double f = a/b;
//            System.out.println("Average Grade: " +f);
//        } else {
//            System.out.println("No valid grades entered");
//        }
//    }
//}


//Hard(Question 3)
//package ass;
//import java.util.*;
//public class Assignment {
//		    public static void main(String[] args) {
//		        Scanner sc= new Scanner(System.in);
//		        System.out.print("Enter the car no: ");
//		        int n=sc.nextInt();
//		        int num=n;
//		        int sum=0;
//		        int t=0;
//		        if(num<999) {
//		        	System.out.println("It is not an lucky number");
//		        }
//		        else {
//		        while(n>0) {
//		        	int rem=n%10;
//		        	sum+=rem;
//		        	n=n/10;
//		        }
//		        if(sum%3==0 || sum%5==0 || sum%7==0) {
//		        	System.out.println("Lucky number");
//		        }
//		        else {
//		        	System.out.println("Sorry it's not my lucky number");
//		        }
//		        }
//		    }
//}

//Question 4
//package ass;
//import java.util.*;
//public class Assignment {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the total cost: ");
//        double a = sc.nextDouble();
//        double dis = 0;
//        if (a < 2000) {
//            dis = 0.5;
//        }
//        else if (a >= 2000 && a < 5000) {
//            dis = 0.025;
//        } 
//        else if (a >= 5000 && a < 10000) {
//            dis = 0.35;
//        } 
//        else {
//            dis = 0.50;
//        }
//
//        double amt = a - (a * dis);
//        System.out.println("Amount to be paid: " + amt);
//    }
//}

//Question 5
//package ass;
//import java.util.*;
//public class Assignment {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int in= sc.nextInt();
//        if (in<= 0) {
//            System.out.println("Invalid Input");
//        }
//        else {
//            int fact = 1;
//            int n = 1;
//            while (fact < in) {
//                n++;
//                fact *= n;
//            }
//            if (fact == in) {
//                System.out.println(n);
//            } else {
//                System.out.println("Sorry. The given number is not a perfect factorial");
//            }
//        }
//    }
//}
//



