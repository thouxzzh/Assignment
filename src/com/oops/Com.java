////Creation of object
//package com.oops;
//public class Com {
//    String theatreId;
//    String theatreName = "INOX";
//    public void getTheatreDetails() {
//        System.out.println("Theatre ID: " + theatreId);
//        System.out.println("Theatre Name: " + theatreName);
//    }
//
//    public static void main(String args[]) {
//        Com C1 = new Com();
//        C1.theatreId = "T4563";
//        C1.getTheatreDetails();
//    }
//}
//// Creation of object using getters ,setters
//	package com.oops;
//    public class Com {
//	    private String theatreId; 
//	    private String theatreName;
//	    public void setTheatreId(String theatreId) {
//	        this.theatreId = theatreId;
//	    }
//	    public void setTheatreName(String theatreName) {
//	        this.theatreName = theatreName;
//	    }
//	    public void getTheatreDetails() {
//	        System.out.println("Theatre ID: " + theatreId);
//	        System.out.println("Theatre Name: " + theatreName);
//	    }
//
//	    public static void main(String args[]) {
//	        Com C1 = new Com();
//
//	        C1.setTheatreId("T4563");
//	        C1.setTheatreName("INOX");
//            C1.getTheatreDetails();
//	    }
//	}
////Using Array of objects
//  package com.oops;
//  public class Com {
//    private String theatreId; 
//    private String theatreName;
//    public void setTheatreId(String theatreId) {
//        this.theatreId = theatreId;
//    }
//    public void setTheatreName(String theatreName) {
//        this.theatreName = theatreName;
//    }
//    public void getTheatreDetails() {
//        System.out.println("Theatre ID: " + theatreId);
//        System.out.println("Theatre Name: " + theatreName);
//    }
//
//    public static void main(String[] args) {
//        Com[] theatre = new Com[3];
//        for (int i = 0; i < theatre.length; i++) {
//            theatre[i] = new Com();
//        }
//        theatre[0].setTheatreId("T1001");
//        theatre[0].setTheatreName("INOX");
//
//        theatre[1].setTheatreId("T1002");
//        theatre[1].setTheatreName("CSM Cinemas");
//
//        theatre[2].setTheatreId("T1003");
//        theatre[2].setTheatreName("AVR Cinemas");
//
//        for (int i = 0; i < theatre.length; i++) {
//            System.out.println("Theatre " + (i + 1) + " Details:");
//            theatre[i].getTheatreDetails();
//            System.out.println();
//        }
//    }
//}
	//// Default Constructor
// package com.oops;
// class Employee {
//     int empId;          
//     String empName;      
//     void getEmployeeDetails() {
//         System.out.println("Employee ID: " + empId);
//         System.out.println("Employee Name: " + empName);
//     }
// }
// public class Com {
//     public static void main(String[] args) {
//         Employee emp=new Employee();
//         emp.getEmployeeDetails();
//     }
// }

// package com.oops;
// class Employee{
//	 int empId;
//	 String empName;
//	 Employee(){
//		 empId=123;
//		 empName="Thoushi";
//	 }
//	 void getEmployeeDetails() {
//		 System.out.println("Employee Id: "+empId);
//		 System.out.println("Employee Name: "+empName);
//	 }
// }
// class Com{
//	   public static void main(String args[]) {
//		    Employee emp=new Employee();
//            Employee emp1=new Employee();
//		    emp.getEmployeeDetails();
//            emp1.getEmployeeDetails();
//	   }
// }

