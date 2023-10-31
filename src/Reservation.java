public class Reservation {

    private int baggageQuantity;

    private String departureDate;

    private String returnDate;

    private String tickets;

    private String boardingGate;

    private Flight flight;

    private Itinerary itinerary;

    private User user;

    @Override
    public String toString() {
        return "Reservation{" + "baggageQuantity=" + baggageQuantity + ", departureDate=" + departureDate + ", returnDate=" + returnDate + ", tickets=" + tickets + ", boardingGate=" + boardingGate + ", flight=" + flight + ", itinerary=" + itinerary + ", user=" + user + '}';
    }

    public Reservation(int baggageQuantity, String departureDate, String returnDate, String tickets, String boardingGate, Flight flight, Itinerary itinerary, User user) {
        this.baggageQuantity = baggageQuantity;
        this.departureDate = departureDate;
        this.returnDate = returnDate;
        this.tickets = tickets;
        this.boardingGate = boardingGate;
        this.flight = flight;
        this.itinerary = itinerary;
        this.user = user;
    }

    public int getBaggageQuantity() {
        return baggageQuantity;
    }

    public void setBaggageQuantity(int baggageQuantity) {
        this.baggageQuantity = baggageQuantity;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getTickets() {
        return tickets;
    }

    public void setTickets(String tickets) {
        this.tickets = tickets;
    }

    public String getBoardingGate() {
        return boardingGate;
    }

    public void setBoardingGate(String boardingGate) {
        this.boardingGate = boardingGate;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Itinerary getItinerary() {
        return itinerary;
    }

    public void setItinerary(Itinerary itinerary) {
        this.itinerary = itinerary;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    private String ticket;

    private Client client;
}
