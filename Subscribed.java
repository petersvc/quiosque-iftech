public class Subscribed implements State {
    private final Kiosk context;

    public Subscribed(Kiosk context) {
        this.context = context;
    }

    @Override
    public void transitionTo() {
        this.context.setState(new Completed(context));
    }

    @Override
    public void identifyStudent(String enrollment) throws IllegalStateException {
        throw new IllegalStateException("Você já está identificado.");
    }

    @Override
    public void selectCourse(String courseName) throws IllegalStateException {
        throw new IllegalStateException("Operação inválida. Já está inscrito em um minicurso.");
    }

    @Override
    public void payment(String cardNumber, String cvv, String expirationDate, String owner) throws IllegalStateException {
        throw new IllegalStateException("Operação inválida. Já o pagamento já foi realizado.");
    }

    @Override
    public Ticket generateTicket() throws Exception {
        Ticket ticket = new Ticket(
                context.getStudent(),  // Substitua pelo valor apropriado
                context.getCourse().getName(),
                context.getCourse().getPrice()
        );

        context.getCourse().ocuparVaga();
        System.out.println("Inscrição realizada com sucesso");
        context.setState(new Completed(context));
        System.out.println("vagas restantes: " + context.getCourse().getSlots());
        System.out.println("-------- Ticket gerado --------\n" + ticket + "\n" + "-------------------------------");
        return ticket;

    }

}
