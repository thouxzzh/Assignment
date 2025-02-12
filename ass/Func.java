//package ass;
//import java.util.*;
//public class Func{
//	public static int[] c(int[] num){
//		int a=0;
//		int b=0;
//		for(int i:num) {
//			if(i%2==0) {
//				a+=i;
//			}
//			else {
//				b+=i;		
//			}
//		}
//           return new int[] {a,b};	
//	}
//public static void main(String[] args) {
//	Scanner sc=new Scanner(System.in);
//	System.out.println("Enter n: "); 
//	int n=sc.nextInt();
//    int[] num=new int[n];
//    for(int i=0;i<n;i++) {
//    	num[i]=sc.nextInt();
//    }
//    int[] res=c(num);
//    System.out.println("Even no sum is: "+res[0]);
//    System.out.println("Even no sum is: "+res[1]);
//}
//}
//package ass;
//class Func {
//	public static void main(String[] args) {
//		int start=1;
//		int end=100;
//		System.out.print("Prime numbers from 1 to 100 is:\n");
//	    for(int i=start;i<=end;i++) {
//		   if(isPrime(i)) {
//			  System.out.print(i+" ");
//		}
//	}
//	}
//	static boolean isPrime(int num) {
//		if(num<=1) {
//			return false;
//		}
//		for(int i=2;i<=Math.sqrt(num);i++) {
//			if(num%i==0) {
//				return false;
//			}
//		}return true;
//		
//	}
//
//}
//package ass;
//import java.util.*;
//public class Func{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your old salary:");
//        int a = sc.nextInt();
//        System.out.println("Enter your hike:");
//        double b = sc.nextDouble(); 
//        double c = d(a, b);
//        System.out.println("Your new salary with hike is:" + c);
//    }
//
//    public static double d(int a, double b) {
//        return a + (a * (b / 100));
//    }
//}

//package ass;
//import java.util.*;
//public class Func{
// public static String a(int age) {
//    if (age>=18) {
//        return "Eligible";
//    }
//    else {
//      return "Not Eligible";
//    }
//}
//    public static void main(String[] args) {
//	   Scanner sc=new Scanner(System.in);
//	   System.out.println("Enter age:");
//	   int age=sc.nextInt();
//	   String b= a(age);
//       System.out.println(b);
//   }
//}

//package ass;
//import java.util.*;
//public class Func {
//	static int a(int l, int u) {
//        int sum = 0;
//        for (int i = l; i <= u; i++) {
//            if (i % 2 != 0)
//                sum += i;
//        }
//        return sum;
//    }
//    
//    static int b(int l, int u) {
//        int sum = 0;
//        for (int i = l; i <= u; i++) {
//            if (i % 2 == 0)
//                sum += i;
//        }
//        return sum;
//    }
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in); 
//		int lbound=sc.nextInt();
//		int ubound=sc.nextInt();
//        int c = a(lbound, ubound);
//        int d= b(lbound, ubound);
//	    int e= Math.abs(c - d);
//	    System.out.println("Absolute difference between two sum is: "+e);
//	}
//	}
//package ass;
//import java.util.*;
//public class Func {
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Enter the initial range:");
//		int start=sc.nextInt();
//		System.out.print("Enter the final range:");
//		int end=sc.nextInt();
//		System.out.print("Prime numbers from 1 to 100 is:\n");
//	    for(int i=start;i<=end;i++) {
//		   if(isPrime(i)) {
//			  System.out.print(i+" ");
//		}
//	}
//	}
//	static boolean isPrime(int num) {
//		if(num<=1) {
//			return false;
//		}
//		for(int i=2;i<=Math.sqrt(num);i++) {
//			if(num%i==0) {
//				return false;
//			}
//		}
//        return true;		
//	}
//}
//package ass;
//import java.util.*;
//public class Func {
//    public static double c(int b) {
//        final double c = 15.00;
//        return b *c;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        for (int i = 1; i <= 5; i++) {
//            System.out.println("Enter the total hours worked by employee");
//            int a = sc.nextInt();
//            int b = 0;
//            if (a > 40) {
//                b = a - 40;
//            }
//            double d = c(b);
//            if (b > 0) {
//                System.out.println("Employee worked " + b + " overtime hours");
//                System.out.println("Overtime pay for Employee Rs. " + d);
//            } else {
//                System.out.println("Employee did not work overtime.");
//                System.out.println("Overtime pay for Employee Rs. 0");
//            }
//        }
//    }
//}

//package ass;
//import java.util.*;
//public class Func{
// public static String isEligible(int age, double weight) {
//    if ((age < 18 || age>55) || (weight<=45)) {
//        return "Not eligible";
//    }
//  else {
//      return "Eligible";
//    }
//}
//
//   public static void main(String[] args) {
//	   Scanner sc=new Scanner(System.in);
//	   System.out.println("Enter age:");
//	   int age=sc.nextInt();
//	   System.out.println("Enter weight:");
//	   double weight=sc.nextInt();
//	   String a= isEligible(age, weight);
//              System.out.println(a);
//   }
//}

//package ass;
//import java.util.*;
//public class Func {
//    public static double a(double s, double r) {
//        if (s <= 0 || r < 1 || r > 10) {
//            System.out.println("Invalid Input");
//            return -1;
//        }
//        double in = 0;
//        if (r >= 1 && r <= 4) {
//            in = 0.10 * s;
//        } else if (r > 4 && r <= 7) {
//            in = 0.25 * s;
//        } else if (r > 7 && r <= 10) {
//            in = 0.30 * s;
//        }
//        return s + in;
//    }
//public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the salary: ");
//        double s = sc.nextDouble();
//        System.out.print("Enter the appraisal rating: ");
//        double r = sc.nextDouble();
//        double c = a(s, r);
//        if (c != -1) {
//            System.out.println((int) c);
//        }
//    }
//}
//package ass;
//import java.util.*;
//public class Func {
//    public static String a(int CS, int EC, int ME) {
//        if (CS <= 0 || EC <= 0 || ME <= 0) {
//            return "Invalid Input";
//        } 
//      else if (CS == 0 && EC == 0 && ME == 0) {
//            return "None of the departments have the highest placement";
//        }
//       else if ((CS > EC) && (CS > ME)) {
//            return "Highest placement CS";
//        } 
//      else if ((EC > CS) && (EC > ME)) {
//            return "Highest placement EC";
//        } 
//      else if ((ME > EC) && (ME > CS)) {
//            return "Highest placement ME";
//        } 
//       else if ((EC == ME) && (ME > CS)) {
//            return "Highest placement EC ME";
//        } 
//       else if ((CS == ME) && (ME > EC)) {
//            return "Highest placement CS ME";
//        }
//        else if ((CS == EC) && (EC > ME)) {
//            return "Highest placement CS EC";
//        }
//       else {
//            return "All departments have the same highest placement";
//        }
//    }
//	  public static void main(String[] args) {
//	        Scanner sc= new Scanner(System.in); 
//	        System.out.print("Enter the no of students placed in CS: ");
//	        int CS = sc.nextInt(); 
//	        System.out.print("Enter the no of students placed in EC: ");
//	        int EC = sc.nextInt(); 
//	        System.out.print("Enter the no of students placed in ME: ");
//	        int ME = sc.nextInt(); 
//	        String max= a(CS,EC,ME);
//	        System.out.println(max);
//	  }
//}









