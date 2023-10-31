public class  Itinerary {

    private int arrivalTime;
    private int departureTime;

    @Override
    public String toString() {
        return "Itinerary{" + "arrivalTime=" + getArrivalTime() + ", departureTime=" + getDepartureTime() + '}';
    }

    public Itinerary(int arrivalTime, int departureTime) {
        this.arrivalTime = arrivalTime;
        this.departureTime = departureTime;
    }

    /**
     * @return the arrivalTime
     */
    public int getArrivalTime() {
        return arrivalTime;
    }

    /**
     * @param arrivalTime the arrivalTime to set
     */
    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    /**
     * @return the departureTime
     */
    public int getDepartureTime() {
        return departureTime;
    }

    /**
     * @param departureTime the departureTime to set
     */
    public void setDepartureTime(int departureTime) {
        this.departureTime = departureTime;
    }
}
