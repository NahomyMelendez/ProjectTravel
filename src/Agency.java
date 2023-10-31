public class Agency {

    private String company;

    private Reservation reservation;

    public Agency(String company, Reservation reservation) {
        this.company = company;
        this.reservation = reservation;
    }
    

    /**
     * @return the company
     */
    public String getCompany() {
        return company;
    }

    /**
     * @param company the company to set
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * @return the reservation
     */
    public Reservation getReservation() {
        return reservation;
    }

    /**
     * @param reservation the reservation to set
     */
    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    @Override
    public String toString() {
        return "Agency{" + "company=" + company +
                ", reservation=" + reservation + '}';
    }
    
    
    
}
