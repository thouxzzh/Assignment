package ass;
//public class New {
//    public static void main(String args[]) {
//        int x[][] = new int[][] {{1, 2}, {3, 4}, {5, 6}};
//        for(int i = 0;i < x.length;i++) {
//            for(int j = 0;j < x[i].length;j++) {
//                System.out.print(x[i][j] + " ");  
//            }
//            System.out.println(); 
//        }
//    }
//}

//public class New {
//    public static void main(String args[]) {
//        String seatType[][] = new String[][] {{"B", "A", "A", "A", "A"},{"A", "A", "A", "B", "B"},{"A", "B", "B", "B", "B"},{"B", "A", "A", "B", "A"}};
//        int vipCount = 0, premiumCount = 0, regularCount = 0; int vipTotal = 5, premiumTotal = 10, regularTotal = 5;
//        System.out.println("Movie Seat Details:");
//        for (int i = 0; i < seatType.length; i++) {
//            if (i == 0)
//                System.out.print("VIP Seats:    ");
//            else if (i == 1 || i == 2)
//                System.out.print("Premium Seats:");
//            else
//                System.out.print("Regular Seats:");
//            for (int j = 0; j < seatType[i].length; j++) {
//                System.out.print(seatType[i][j] + " ");
//                if (i == 0 && seatType[i][j].equalsIgnoreCase("B")) {
//                    vipCount++;
//                } else if (i > 0 && i < 3 && seatType[i][j].equalsIgnoreCase("B")) {
//                    premiumCount++;
//                } else if (i == 3 && seatType[i][j].equalsIgnoreCase("B")) {
//                    regularCount++;
//                }
//            }
//            System.out.println();
//        }
//
//        System.out.println("\nSeat Booking Details:");
//        System.out.println("VIP Seats: Booked " + vipCount + ", Available " + (vipTotal - vipCount) + ", Total " + vipTotal);
//        System.out.println("Premium Seats: Booked " + premiumCount + ", Available " + (premiumTotal - premiumCount) + ", Total " + premiumTotal);
//        System.out.println("Regular Seats: Booked " + regularCount + ", Available " + (regularTotal - regularCount) + ", Total " + regularTotal);
//    }
//}
////Jagged Array
//public class New{
//	public static void main(String args[]) {
//		int bookNo[][]=new int[3][];
//		bookNo[0]=new int[] {1,2,3};
//		bookNo[1]=new int[] {4,5};
//		bookNo[2]=new int[] {6,7};
//		System.out.println("Two dimensional Array");
//		for(int i=0;i<bookNo.length;i++) {
//			for(int j=0;j < bookNo[i].length;j++) {
//				System.out.println(bookNo[i][j]+" ");
//				System.out.println("\t");
//			}
//			System.out.println();
//		}
//	}
//}
