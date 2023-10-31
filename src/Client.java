
import java.util.Date;

public class Client extends Person {

    private boolean flightType;

    private boolean visa;

    private String budget;

    private String specialRequierement;

    private Person person;

    public Client(Date age, String adress, String email, String id, String mobile, String name, String nationality) {
        super(age, adress, email, id, mobile, name, nationality);
    }

    public Client(boolean flightType, boolean visa, String budget, String specialRequierement, Person person, Date age, String adress, String email, String id, String mobile, String name, String nationality) {
        super(age, adress, email, id, mobile, name, nationality);
        this.flightType = flightType;
        this.visa = visa;
        this.budget = budget;
        this.specialRequierement = specialRequierement;
        this.person = person;
    }

   

    /**
     * @return the flightType
     */
    public boolean isFlightType() {
        return flightType;
    }

    /**
     * @param flightType the flightType to set
     */
    public void setFlightType(boolean flightType) {
        this.flightType = flightType;
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
     * @return the budget
     */
    public String getBudget() {
        return budget;
    }

    /**
     * @param budget the budget to set
     */
    public void setBudget(String budget) {
        this.budget = budget;
    }

    /**
     * @return the specialRequierement
     */
    public String getSpecialRequierement() {
        return specialRequierement;
    }

    /**
     * @param specialRequierement the specialRequierement to set
     */
    public void setSpecialRequierement(String specialRequierement) {
        this.specialRequierement = specialRequierement;
    }

    /**
     * @return the person
     */
    public Person getPerson() {
        return person;
    }

    /**
     * @param person the person to set
     */
    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Client{" + "flightType=" + flightType +
                ", visa=" + visa + ", budget=" + budget +
                ", specialRequierement=" + specialRequierement +
                ", person=" + person + '}';
    }
    
}
