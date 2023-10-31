import java.util.Date;

public class User extends Person {
  
    private boolean visa;
    private Date age;
    private String id;
    private String mobile;
    private Flight flight;
    private Itinerary itinerary;
    private Plane plane;

    public User(Date age, String adress, String email, String id, String mobile,
            String name, String nationality) {
        super(age, adress, email, id, mobile, name, nationality);
    }



    /**
     * @return the visa
     */
    public boolean isVisa() {
        return visa;
    }

    /**
     * @param visa the visa to set
     */
    public void setVisa(boolean visa) {
        this.visa = visa;
    }

    /**
     * @return the age
     */
    public Date getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Date age) {
        this.age = age;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile the mobile to set
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return the flight
     */
    public Flight getFlight() {
        return flight;
    }

    /**
     * @param flight the flight to set
     */
    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    /**
     * @return the itinerary
     */
    public Itinerary getItinerary() {
        return itinerary;
    }

    /**
     * @param itinerary the itinerary to set
     */
    public void setItinerary(Itinerary itinerary) {
        this.itinerary = itinerary;
    }

    /**
     * @return the plane
     */
    public Plane getPlane() {
        return plane;
    }

    /**
     * @param plane the plane to set
     */
    public void setPlane(Plane plane) {
        this.plane = plane;
    }

 
    
    
 
}
