public class Booking {

    private Flight flight;

    private Itenerary itenerary;

    private Plane plane;

    private Reservation reservation;

    private static class Itenerary {

        public Itenerary() {
        }
    }

    public Booking(Flight flight, Itenerary itenerary, Plane plane, Reservation reservation) {
        this.flight = flight;
        this.itenerary = itenerary;
        this.plane = plane;
        this.reservation = reservation;
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
     * @return the itenerary
     */
    public Itenerary getItenerary() {
        return itenerary;
    }

    /**
     * @param itenerary the itenerary to set
     */
    public void setItenerary(Itenerary itenerary) {
        this.itenerary = itenerary;
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
        return "Booking{" + "flight=" + flight + ", itenerary=" +
                itenerary + ", plane=" + plane + ", reservation=" +
                reservation + '}';
    }


}
