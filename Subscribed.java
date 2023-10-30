public class Subscribed implements State {
    private final Kiosk context;

    public Subscribed(Kiosk context) {
        this.context = context;
    }

    @Override
    public void transitionTo(State state) {
        this.context.setState(state);
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
        throw new IllegalStateException("Operação inválida. O pagamento já foi realizado.");
    }

    @Override
    public Ticket generateTicket() {
        Ticket ticket = new Ticket(
                context.getStudent(),  // Substitua pelo valor apropriado
                context.getCourse()
        );

        context.getCourse().ocuparVaga();
        context.ticketsRepository.addTicket(ticket);

        transitionTo(new Completed(context));

        System.out.println("Inscrição realizada com sucesso");
        System.out.println("vagas restantes para o minicurso '" + context.getCourse().getName() + "': " + context.getCourse().getSlots());
        System.out.println("\n-------- Ticket gerado --------\n" + ticket + "\n" + "-------------------------------\n");

        return ticket;

    }

}
