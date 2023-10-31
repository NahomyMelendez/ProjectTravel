public class Invoice {

    private String invoiceDate;

    private String invoiceDay;

    private Reservation reservation;

    @Override
    public String toString() {
        return "Invoice{" + "invoiceDate=" + invoiceDate + ", invoiceDay=" + invoiceDay + ", reservation=" + reservation + '}';
    }

    public Invoice(String invoiceDate, String invoiceDay, Reservation reservation) {
        this.invoiceDate = invoiceDate;
        this.invoiceDay = invoiceDay;
        this.reservation = reservation;
    }

    public String getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(String invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getInvoiceDay() {
        return invoiceDay;
    }

    public void setInvoiceDay(String invoiceDay) {
        this.invoiceDay = invoiceDay;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }
}
