public class Completed implements State {
    private final Kiosk context;

    public Completed(Kiosk context) {
        this.context = context;
    }

    @Override
    public void transitionTo() throws IllegalStateException {
        throw new IllegalStateException("Inscrição Finalizada.");
    }

    @Override
    public void identifyStudent(String enrollment) throws IllegalStateException {
        throw new IllegalStateException("Inscrição Finalizada.");
    }

    @Override
    public void selectCourse(String courseName) throws IllegalStateException {
        throw new IllegalStateException("Inscrição Finalizada.");
    }

    @Override
    public void payment(String cardNumber, String cvv, String expirationDate, String owner) throws IllegalStateException {
        throw new IllegalStateException("Inscrição Finalizada.");
    }

    @Override
    public Ticket generateTicket() throws IllegalStateException {
        throw new IllegalStateException("Inscrição Finalizada.");
    }

}
