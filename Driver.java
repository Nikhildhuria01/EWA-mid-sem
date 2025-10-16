import java.util.*;

public class Driver{
    int did;
    String dname;
    Float drating;
    int tripsCompleted;
    Scanner sc=new Scanner(System.in);
    //takinh 3 input
    
    
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
}