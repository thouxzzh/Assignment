//package OOPS;
//interface Vehicle {
//    void changeGear(int newGear);
//    void speedUp(int increment);
//    void applyBrakes(int decrement);
//}
//class Bicycle implements Vehicle {
//    int speed;
//    int gear;
//
//    public void changeGear(int newGear) {
//        gear = newGear;
//    }
//
//    public void speedUp(int increment) {
//        speed += increment;
//    }
//
//    public void applyBrakes(int decrement) {
//        speed -= decrement;
//    }
//
//    public void printStates() {
//        System.out.println("BicycleSpeed: " + speed + " Gear: " + gear);
//    }
//}
//class Bike implements Vehicle {
//    int speed;
//    int gear;
//
//    public void changeGear(int newGear) {
//        gear = newGear;
//    }
//
//    public void speedUp(int increment) {
//        speed += increment;
//    }
//
//    public void applyBrakes(int decrement) {
//        speed -= decrement;
//    }
//
//    public void printStates() {
//        System.out.println("BikeSpeed: " + speed + " Gear: " + gear);
//    }
//}
//public class Interface{
//    public static void main(String args[]) {
//        Bicycle bicycle = new Bicycle();
//        bicycle.changeGear(3);
//        bicycle.speedUp(2);
//        bicycle.applyBrakes(1);
//        System.out.println("Bicycle present state:");
//        bicycle.printStates();
//
//        Bike bike = new Bike();
//        bike.changeGear(4);
//        bike.speedUp(5);
//        bike.applyBrakes(6);
//        System.out.println("Bike present state:");
//        bike.printStates();
//    }
//}
//
////ass Catalog implements Search{
//						private static Date lastUpdated;
//						private static List<Movie> MovieList = new ArrayList<movie>();
//						void addMovie(Movie M) {
//							MovieList.add(M);
//							Calendar cal = Calendar.getInstance();
//							DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//							Date date = cal.getTime();
//							String todaysdate = dateFormat.format(date);
//							System.out.println("Todays date: "+todaysdate);
//							lastUpdated= date;
//						}
//						void listMovie() {
//							for(Movie movie : MovieList) {
//								movie.getMovieDetails();
//							}
//						}
//						@Override
//						void searchbyTitle(String title)
//					}
