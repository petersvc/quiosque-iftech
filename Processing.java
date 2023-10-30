import java.util.Objects;

public class Processing implements State {
    private final Kiosk context;

    public Processing(Kiosk context) {
        this.context = context;
    }

    @Override
    public void transitionTo(State state) {
        this.context.setState(state);
    }

    @Override
    public void identifyStudent(String enrollment) throws IllegalStateException {
        throw new IllegalStateException("Você já está identificado. ");
    }

    @Override
    public void selectCourse(String courseName) throws IllegalStateException {
        throw new IllegalStateException("Pagamento em processamento. Aguarde a conclusão.");
    }

    @Override
    public void payment(String cardNumber, String cvv, String expirationDate, String owner) throws Exception {

        CreditCard creditCard = this.context.creditCardRepository.findCreditCard(cardNumber);

        if (creditCard != null && Objects.equals(creditCard.getCvv(), cvv) && Objects.equals(creditCard.getExpirationDate(), expirationDate) && creditCard.getBalance() >= this.context.getCourse().getPrice()) {
            System.out.println("Cartão autorizado. Realizando o pagamento");
            creditCard.setBalance(creditCard.getBalance() - context.getCourse().getPrice());
            this.transitionTo(new Subscribed(context));
        } else {
            this.transitionTo(new OnHold(context));
            throw new Exception("Compra não autorizada. Tente novamente.");
        }
    }

    @Override
    public Ticket generateTicket() throws IllegalStateException {
        throw new IllegalStateException("Por favor, aguarde a conclusão do pagamento.");
    }

}
