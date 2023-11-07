
import java.util.ArrayList;
import java.util.Date;

public class Flight {

    private String date;
    private String origin;
    private String arrival;
    private ArrayList<User> passengers;
    private int id;
    private int price;
    private int capacity;

    public Flight(int id, String date, String origin, String arrival, int price, int capacity) {
        this.date = date;
        this.origin = origin;
        this.arrival = arrival;
        this.price = price;
        this.capacity = capacity;
        this.passengers = new ArrayList();
        this.id = id;
    }
    /*
    in this method evaluate the size of the arraylist and allows delete a 
    passager
    @param deletingPassager method to evoke the deleter 
    */
    public boolean deletingPassager(String id){
        for(int i=0; 1<passengers.size();i++){
            if (passengers.get(i).equals(id)){
                passengers.remove(i);
                capacity++;
                return true;
            }
        }
        return false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public void addPassenger(User user){
        passengers.add(user);
        capacity --;
    }
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public ArrayList<User> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<User> passengers) {
        this.passengers = passengers;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    


}
