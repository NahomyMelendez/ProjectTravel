public class Flight {

    private double price;

    private String destination;

    private String flightDuration;

    private String flightNumber;

    private String numberLayover;

    private String origin;

    private String route;
    
    private Plane plane;

    public Flight(double price, String destination, String flightDuration, String flightNumber, String numberLayover, String origin, String route, Plane plane) {
        this.price = price;
        this.destination = destination;
        this.flightDuration = flightDuration;
        this.flightNumber = flightNumber;
        this.numberLayover = numberLayover;
        this.origin = origin;
        this.route = route;
        this.plane = plane;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * @return the flightDuration
     */
    public String getFlightDuration() {
        return flightDuration;
    }

    /**
     * @param flightDuration the flightDuration to set
     */
    public void setFlightDuration(String flightDuration) {
        this.flightDuration = flightDuration;
    }

    /**
     * @return the flightNumber
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * @param flightNumber the flightNumber to set
     */
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    /**
     * @return the numberLayover
     */
    public String getNumberLayover() {
        return numberLayover;
    }

    /**
     * @param numberLayover the numberLayover to set
     */
    public void setNumberLayover(String numberLayover) {
        this.numberLayover = numberLayover;
    }

    /**
     * @return the origin
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * @param origin the origin to set
     */
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    /**
     * @return the route
     */
    public String getRoute() {
        return route;
    }

    /**
     * @param route the route to set
     */
    public void setRoute(String route) {
        this.route = route;
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

    @Override
    public String toString() {
        return "Flight{" + "price=" + price + ", destination=" +
                destination + ", flightDuration=" + flightDuration +
                ", flightNumber=" + flightNumber + ", numberLayover=" +
                numberLayover + ", origin=" + origin + ", route=" + route + 
                ", plane=" + plane + '}';
    }
   

  
}
