//easy 
//Question 1
//package ass;
//import java.util.*;
//import java.util.Scanner;  
//public class Arr {  
//    public static void main(String[] args) {  
//        Scanner sc = new Scanner(System.in);  
//        int evenSum = 0, oddSum = 0;  
//        int evenNum[] = new int[10], oddNum[] = new int[10];  
//        int evenIndex = 0, oddIndex = 0;  
//        System.out.println("Enter 10 numbers:");  
//        for (int i = 0; i < 10; i++) {  
//            int num = sc.nextInt();  
//            if (num % 2 == 0) {  
//                evenNum[evenIndex++] = num;  
//                evenSum += num;  
//            } else {  
//                oddNum[oddIndex++] = num;  
//                oddSum += num;  
//            }  
//        } 
//        System.out.print("Even numbers: ");  
//        for (int i = 0; i < evenIndex; i++) {  
//            System.out.print(evenNum[i] + " ");  
//        }  
//        System.out.println("\nSum of even numbers: " + evenSum);  
//
//        System.out.print("Odd numbers: ");  
//        for (int i = 0; i < oddIndex; i++) {  
//            System.out.print(oddNum[i] + " ");  
//        }  
//        System.out.println("\nSum of odd numbers: " + oddSum);  
//    }  
//}  

//Question 2
//package ass;
//import java.util.*;
//import java.util.Arrays;  
//public class Arr {  
//    public static void main(String[] args) {  
//        Scanner sc = new Scanner(System.in);  
//        System.out.print("Enter the number of elements: ");  
//        int n = sc.nextInt();  
//        int arr[] = new int[n];  
//        System.out.println("Enter the elements: ");  
//        for (int i = 0; i < n; i++) {  
//            arr[i] = sc.nextInt();  
//        }  
//
//        Arrays.sort(arr);  
//
//        System.out.println("Sorted array in ascending order: ");  
//        for (int num : arr) {  
//            System.out.print(num + " ");  
//        } 
//    }  
//}

//Question 3
//package ass;
//import java.util.*;
//public class Arr{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number of elements: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.println("Enter the elements:");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        int max = arr[0], min = arr[0];
//        for (int num : arr) {
//            if (num > max)
//                max = num;
//            if (num < min)
//                min = num;
//        }
//        System.out.println("Maximum value: " + max);
//        System.out.println("Minimum value: " + min);
//    }
//}

//Question 4
//package ass;
//import java.util.*;
//public class Arr {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of elements: ");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        System.out.println("Enter the elements:");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        System.out.println("Element   Frequency");
//        for (int i = 0; i < n; i++) {
//            int count = 1;
//            if (arr[i] == -1) 
//           	   continue; 
//         for (int j = i + 1; j < n; j++) {
//                if (arr[i] == arr[j]) {
//                    count++;
//                    arr[j] = -1; 
//                }
//            }
//            System.out.println("   " + arr[i] + "       " + count);
//        }
//    }
//}

//Question 5
//package ass;
//import java.util.*;
//public class Arr {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the size of the array: ");
//        int n = sc.nextInt();
//        int[] A = new int[n];
//        System.out.println("Enter the elements of the array:");
//        for (int i = 0; i < n; i++) {
//            A[i] = sc.nextInt();
//        }
//        int max = A[0];
//        for (int i = 1; i < n; i++) {
//            if (A[i] > max) {
//                max = A[i];
//            }
//        }
//        System.out.println("Greatest element in the array: " + max);
//    }
//}

//Question 6
//package ass;
//import java.util.*;
//public class Arr{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the size of array 1: ");
//        int n1 = sc.nextInt();
//
//        System.out.print("Enter the size of array 2: ");
//        int n2 = sc.nextInt();
//        int[] arr1 = new int[n1];
//        int[] arr2 = new int[n2];
//        System.out.println("Enter the elements of array 1:");
//        for (int i = 0; i < n1; i++) {
//            arr1[i] = sc.nextInt();
//        }
//        System.out.println("Enter the elements of array 2:");
//        for (int i = 0; i < n2; i++) {
//            arr2[i] = sc.nextInt();
//        }
//        int[] arr3 = new int[n1 + n2]; 
//        int i = 0;
//        for (i = 0; i < n1; i++) {
//            arr3[i] = arr1[i];
//        }
//        for (int j = 0; j < n2; j++) {
//            arr3[i + j] = arr2[j];  
//        }
//        System.out.print("\nMerged Array 3: ");
//        for (i = 0; i < n1 + n2; i++) {
//            System.out.print(arr3[i] + " ");
//        }
//     
//    }
//}

//Question 7
//package ass;
//import java.util.*;
//public class Arr {
//    public static void main(String[] args) {
//        int[] arr1 = {1, 2, 3, 4};
//        int[] arr2 = {5, 6, 7, 8};
//        int[] merge = new int[arr1.length + arr2.length];
//        int index = 0;
//        for (int i = 0; i < arr1.length; i++) {
//            merge[index++] = arr1[i];
//        }
//        for (int i = 0; i < arr2.length; i++) {
//            merge[index++] = arr2[i];
//        }
//        System.out.print("Array1 ");
//        for (int i : arr1) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        System.out.print("Array2 ");
//        for (int i : arr2) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//        System.out.print("Merged Array");
//        for (int i : merge) {
//            System.out.print(i + " ");
//        }
//        System.out.println();
//    }
//}

//Question 8
//package ass;
//import java.util.*;
//public class Arr {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = 100;
//        
//        System.out.println("Enter the number of elements in the array ");
//        int size = sc.nextInt();
//        
//        int[] arr = new int[size];
//        System.out.println("Enter the elements of the array ");
//        
//        for (int i = 0; i < size; i++) {
//            arr[i] = sc.nextInt();
//        }
//        
//        int totalSum = n * (n + 1) / 2;
//        int arrSum = 0;
//        
//        for (int num : arr) {
//            arrSum += num;
//        }
//        
//        int misNum = totalSum - arrSum;
//        System.out.println("The missing number is: " + misNum);
//    }
//}
 //Medium
//package ass;
//import java.util.*;
//public class Arr {
//    public static boolean searchElement(int[] arr, int key) {
//        for (int num : arr) {
//            if (num == key) {
//                return true;
//            }
//        }
//        return false;
//    }
//      public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number of elements in the array: ");
//        int size = sc.nextInt();
//        int[] arr = new int[size];
//        System.out.println("Enter the elements of the array: ");
//        for (int i = 0; i < size; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.print("Enter the key to search: ");
//        int key = sc.nextInt();
//        System.out.println(searchElement(arr, key));
//    }
//}

//Question 2
//package ass;
//import java.util.*;
//public class Arr {
//    public static void main(String[] args) {
//        Random r= new Random();
//        int[] f = new int[6];
//        for (int i = 0; i < 100; i++) {
//            int roll= r.nextInt(6) + 1; 
//            f[roll - 1]++; 
//        }
//        System.out.println("Dice Roll Frequencies:");
//        for (int i = 0; i < 6; i++) {
//            System.out.println((i + 1) +"-"+f[i] +"times");
//        }
//    }
//}

//medium 3
//package ass;
//import java.util.Scanner;
//import java.util.HashSet;
//public class Arr {
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter array size: ");
//        int size = sc.nextInt();
//        int[] arr = new int[size];
//        System.out.println("Enter array elements: ");
//        for (int i = 0; i < size; i++) {
//            arr[i] = sc.nextInt();
//        }
//        HashSet<Integer> uS= new HashSet<>();
//        HashSet<Integer> dS = new HashSet<>();
//        for (int num : arr) {
//            if (!uS.add(num)) {
//                dS.add(num);
//            }
//        }
//        int dC = dS.size();
//        int uC= uS.size() - dC;
//
//        System.out.println("No of duplicate elements" + dC);
//        System.out.println("No of unique elements: " + uC);
//    }
//}

//medium 4
//package ass;
//import java.util.*;
//public class Arr{
//	public static void main(String args[]) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the no of elements");
//		int n=sc.nextInt();
//		System.out.println("Enter the elements");
//		int arr[]=new int[n];
//		for(int i=0;i<n;i++) {
//			arr[i]=sc.nextInt();
//		}
//		for(int i=0;i<n;i++) {
//			for(int j=i+1;j<n;j++) {
//				if(arr[i]==arr[j]) {
//					arr[i]=-999;
//				}
//			}
//		}
//		System.out.println("The unique elements are ");
//		for(int i=0;i<n;i++) {
//			if(arr[i]!=-999) {
//				System.out.println(arr[i]);
//			}
//		}
//	}
//}

//Question 5
//package ass;
//import java.util.*;
//public class Arr{
//    public static void main(String[] args) {
//        int[] rec = {10, 10, 10, 10, 20, 20, 20, 20, 40, 40, 50, 50, 30};
//        int[] freq = new int[rec.length];
//
//        for (int i = 0; i < rec.length; i++) {
//            if (freq[i] == 0) {
//                int count = 1;
//                for (int j = i + 1; j < rec.length; j++) {
//                    if (rec[i] == rec[j]) {
//                        count++;
//                        freq[j] = -1; 
//                    }
//                }
//                freq[i] = count;
//                System.out.println("Element: " + rec[i] + ", Frequency: " + count);
//            }
//        }
//    }  
//}

//Question(6)
//package ass;
//import java.util.*;
//public class Arr{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[25];
//        System.out.println("Enter 25 numbers:");
//        for (int i = 0; i < 25; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.print("Enter the number you want to search: ");
//        int sNum = sc.nextInt();
//        int count = 0;
//        for (int i = 0; i < 25; i++) {
//            if (arr[i] == sNum) {
//                count++;
//            }
//        }
//        if (count > 0) {
//            System.out.println("The number appears " + count + " times in the array");
//        } else {
//            System.out.println("The number " + sNum + " is not present in the array.");
//        }
//    }
//}


//hard 1
//package ass;
//import java.util.*;
//public class Arr{
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] a= new int[n];
//        int sum = 0;
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//            sum += a[i];
//        }
//        if (sum % n == 0) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }
//    }
//}

//package ass;
//import java.util.*;
//public class Arr{
//    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter Arun's choices: ");
//        int[] a = new int[10];
//        for (int i = 0; i < 10; i++) {
//            a[i] = sc.nextInt();
//        }
//        System.out.print("Enter Naveen's choices");
//        int[] b = new int[10];
//        for (int i = 0; i < 10; i++) {
//            b[i] = sc.nextInt();
//        }
//        int c = 0;
//        int d = 0;
//        for (int i = 0; i < 10; i++) {
//            c += a[i];
//            d += b[i];
//        }
//        if (c > d) {
//            System.out.println("Arun Wins!!!");
//        } else if (d > c) {
//            System.out.println("Naveen Wins!!!");
//        } else {
//            System.out.println("It's a Tie!!!");
//        }
//    }
//}
//
//package ass;
//import java.util.*;
//public class Arr{
//    public static void a(int[] arr, int size) {
//        for (int i = 0; i < size; i++) {
//            if (arr[i] % 7 == 0 && arr[i] % 8 == 0) 
//            	arr[i] = -6;
//            else if (arr[i] % 7 == 0) 
//            	arr[i] = -2;
//            else if (arr[i] % 8 == 0) 
//            	arr[i] = -9;
//        }
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[100]; 
//        int count = 0;
//        while (true) {
//            int num = sc.nextInt();
//            if (num < 0) break;
//            arr[count++] = num;
//        }
//        a(arr, count);
//        for (int i = 0; i < count; i++) 
//        	System.out.print(arr[i] + " ");
//    }
//}


//package ass;
//import java.util.Arrays;
//import java.util.*;
//public class Arr {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the size of array 1");
//        int n1 = sc.nextInt();
//
//        System.out.print("Enter the size of array 2");
//        int n2 = sc.nextInt();
//        int[] arr1 = new int[n1];
//        int[] arr2 = new int[n2];
//        System.out.println("Enter the elements of array 1");
//        for (int i = 0; i < n1; i++) {
//            arr1[i] = sc.nextInt();
//        }
//        System.out.println("Enter the elements of array 2");
//        for (int i = 0; i < n2; i++) {
//            arr2[i] = sc.nextInt();
//        }
//        int[] arr3 = new int[n1 + n2]; 
//        int i = 0;
//        for (i = 0; i < n1; i++) {
//            arr3[i] = arr1[i];
//        }
//        for (int j = 0; j < n2; j++) {
//            arr3[i + j] = arr2[j];  
//        }
//        Arrays.sort(arr3);
//        System.out.print("\nSorted Array ");
//        for (i = 0; i < n1 + n2; i++) {
//            System.out.print(arr3[i] + " ");
//        }
//     
//    }
//}



