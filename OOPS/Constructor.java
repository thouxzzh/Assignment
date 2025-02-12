////parameterized constructor
//package OOPS;
//public class Constructor {
//    int EmpId;
//    String EmpName;
//    public Constructor(int id, String name) {
//         EmpId = id;
//         EmpName = name;
//    }
//    public void display() {
//        System.out.println("Employee ID: " + EmpId);
//        System.out.println("Employee Name: " + EmpName);
//    }
//     public static void main(String[] args) {
//        Constructor emp1 = new Constructor(100, "Thoushi");
//        emp1.display();
//    }
//}

// package OOPS;
// public class Constructor {
//	 String theatreId;
//	 String theatreName;
//	 public Constructor(String id,String name) {
//		 theatreId=id;
//		  theatreName=name;
//	 }
//	 public void getTheatreDetails() {
//		 System.out.println("Theatre Detail");
//		 System.out.println("TheatreId:"+theatreId);
//		 System.out.println("TheatreName:"+theatreName);
//		 }
//	 public static void main(String args[]) {
//		 Constructor obj= new Constructor("100","CRM");
//		 obj.getTheatreDetails();
//	 }
// }

////Constructor Overloading(default and parameterized constructor)
//
//   package OOPS;
//   public class Constructor{
//	  String theatreId;
//	  String theatreName;
//	  public Constructor() {
//		  theatreId="1111";
//		  theatreName="AAA-BBB";
//	  }
//	  public Constructor(String id,String name) {
//	        theatreId=id;
//	        theatreName=name;
//	  
//	}
//	  public void getTheatreDetails() {
//		  System.out.println("TheatreId:"+theatreId);
//		  System.out.println("TheatreName:"+theatreName);
//	  }
//	  public static void main(String args[]) {
//		  Constructor obj=new Constructor();
//		  Constructor obj1=new Constructor("100","CRM");
//		  System.out.println("Default Constructor");
//		  obj.getTheatreDetails();
//		  System.out.println("Paramterized Costructor");
//		  obj1.getTheatreDetails();
//	  }
//   }
//Garbage Collection
//    package OOPS;
//    public class Constructor{
//    	public static void main(String args[]) {
//    		Constructor obj=new Constructor();
//            obj.finalize();
//            System.gc();
//            System.out.println("Inside the main() method");
//    		}
//    	@Override
//    	protected void finalize() {
//    		System.out.println("Object is destroyed by the Garbage Collector");
//    	}
//    	
//    }
////this keyword
//package OOPS;
//public class Constructor {
//    int EmpId;
//    String EmpName;
//    // Parameterized Constructor using 'this' keyword
//    public Constructor(int EmpId, String EmpName) {
//        this.EmpId = EmpId;   //  instance variable
//        this.EmpName = EmpName;
//    }
//    // Method to display Employee details
//    public void display() {
//        System.out.println("Employee ID: " + this.EmpId); // local variable
//        System.out.println("Employee Name: " + this.EmpName);
//    }
//    public static void main(String[] args) {
//       Constructor emp1 = new Constructor(100, "Thoushi");
//
//        emp1.display();
//    }
//}
//package OOPS;
// public class Constructor {
//	 String theatreId;
//	 String theatreName;
//	 public Constructor(String id,String name) {
//		 this.theatreId=id;

//		  this.theatreName=name;
//	 }
//	 public void getTheatreDetails() {
//		 System.out.println("Theatre Detail");
//		 System.out.println("TheatreId:"+theatreId);
//		 System.out.println("TheatreName:"+theatreName);
//		 }
//	 public static void main(String args[]) {
//		 Constructor obj= new Constructor("100","CRM");
//		 obj.getTheatreDetails();
//	 }
// }
////   static variable
//package OOPS;
//class Constructor{
//	static int empId;
//	static String empName;
//	static {
//		System.out.println("Static block1");
//		empId=1001;
//		empName="Thoushi";
//	}
//	static {
//		System.out.println("Static block 2");
//		empId=1002;
//		empName="Vishu";
//	}
//	public static void main(String args[])
//	{
//		System.out.println("Employee id"+empId);
//		System.out.println("Employee Name"+empName);
//	}
//}

////instance variable along with the static variable
//package OOPS;
//class Constructor {
//     int empId;
//    String empName;  //  instance variable
//    static String companyName = "ABC"; // Static variable for company name
//    Constructor(int id, String name) {
//        this.empId = id;
//        this.empName = name;
//    }
//    void getTheatreDetails() {
//    	System.out.println("Company Name: " + companyName);
//        System.out.println("Employee ID: " + empId);
//        System.out.println("Employee Name: " + empName);
//       
//    }
//     public static void main(String[] args) {
//        Constructor obj= new Constructor(101, "Thoushi");
//        Constructor obj1=new Constructor(102,"Vishu");
//       obj.getTheatreDetails();
//       obj1.getTheatreDetails();
//    }
//}
//static method
 //    package OOPS;
//    class Constructor {
//        int empId;
//        String empName;  // Instance variable
//        static String companyName = "ABC"; // Static variable for company name
//
//        // Static method to change company name
//        static void getCompany() {
//            companyName = "XYZ";
//        }
//        Constructor(int id, String name) {
//            this.empId = id;
//            this.empName = name;
//        }
//        void display() {
//            System.out.println("Company Name: " + companyName);
//            System.out.println("Employee ID: " + empId);
//            System.out.println("Employee Name: " + empName);
//        }
//
//        public static void main(String[] args) {
//            Constructor obj = new Constructor(101, "Thoushi");
//            Constructor obj1 = new Constructor(102, "Vishu");
//            Constructor.getCompany();
//            obj.display();  
//            obj1.display();             
//        }
//    }
//
//package OOPS;
//class Constructor {
//    static int theatreCount = 0; 
//    String theatreId;
//    String theatreName;
//    Constructor(String id, String name) {
//        this.theatreId = id;
//        this.theatreName = name;
//        theatreCount++; 
//    }
//    public void displayTheatre() {
//        System.out.println("Theatre Id: " + theatreId);
//        System.out.println("Theatre Name: " + theatreName);
//        System.out.println("Total number of theatres: " + theatreCount);
//    }
//
//    public static void main(String[] args) {
//        Constructor t1 = new Constructor("T001", "PVR Cinemas");
//        Constructor t2 = new Constructor("T002", "INOX");
//        t2.displayTheatre();
//    }
//}
//Encapsulation (getters and setters)
//package OOPS;
//class ConstructorMain {
//    private int empId;
//    private String empName;
//
//    // Setter Methods
//    public void setId(int id) {
//        empId = id;
//    } 
//     public void setName(String name) {
//        empName = name;
//    }
//
//    // Getter Methods
//    public int getEmpId() {
//        return empId;
//    }
//
//    public String getEmpName() {
//        return empName;
//    }
//}
//public class Constructor{
//    public static void main(String args[]) {
//        ConstructorMain obj = new ConstructorMain();
//        obj.setId(1001);
//        obj.setName("Thoushi");
//        System.out.println("Employee Id: " + obj.getEmpId());
//        System.out.println("Employee Name: " + obj.getEmpName());
//    }
//}

    
    

