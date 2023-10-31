
import java.util.Date;

public class Person {

    private Date age;

    private String adress;

    private String email;

    private String id;

    private String mobile;

    private String name;

    private String nationality;

    public Person(Date age, String adress, String email,
            String id, String mobile, String name, String nationality) {
        this.age = age;
        this.adress = adress;
        this.email = email;
        this.id = id;
        this.mobile = mobile;
        this.name = name;
        this.nationality = nationality;
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
     * @return the adress
     */
    public String getAdress() {
        return adress;
    }

    /**
     * @param adress the adress to set
     */
    public void setAdress(String adress) {
        this.adress = adress;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the nationality
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * @param nationality the nationality to set
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "Person{" + "age=" + age + ", adress=" + adress +
                ", email=" + email + ", id=" + id +
                ", mobile=" + mobile + ", name=" + name +
                ", nationality=" + nationality + '}';
    }
 
 
    
    
    
}
