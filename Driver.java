import java.util.*;

 class Driver{
    int did;
    String dname;
    Float drating;
    int tripsCompleted;
    Scanner sc=new Scanner(System.in);
    //takinh 3 input
    public Driver(int did, String dname, Float drating, int tripsCompleted) {
        this.did = did;
        this.dname = dname;
        this.drating = drating;
        this.tripsCompleted = tripsCompleted;
    }

    
}
class SmartCab{
  
    List<Driver> drivers = new ArrayList<>();
//sorting drivers based on higest rating
    public void sortDriversByRating() {
        Collections.sort(drivers, (d1, d2) -> d2.drating.compareTo(d1.drating));
    }
    //sorting drivers based on number of trips completed
    public void sortDriversByTripsCompleted() {
        Collections.sort(drivers, (d1, d2) -> Integer.compare(d2.tripsCompleted, d1.tripsCompleted));
    }

    
    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    
    public void displayDrivers() {
        for (Driver driver : drivers) {
            System.out.println("Driver ID: " + driver.did + ", Name: " + driver.dname + ", Rating: " + driver.drating + ", Trips Completed: " + driver.tripsCompleted);
        }
    }
    public static void main(String[] args) {
        SmartCab smartCab = new SmartCab();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of drivers to add:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter Driver ID, Name, Rating, Trips Completed:");
            int did = sc.nextInt();
            String dname = sc.next();
            Float drating = sc.nextFloat();
            int tripsCompleted = sc.nextInt();
            Driver driver = new Driver(did, dname, drating, tripsCompleted);
            smartCab.addDriver(driver);
        }

        System.out.println("Drivers sorted by Rating:");
        smartCab.sortDriversByRating();
        smartCab.displayDrivers();

        System.out.println("\nDrivers sorted by Trips Completed:");
        smartCab.sortDriversByTripsCompleted();
        smartCab.displayDrivers();
    }
}