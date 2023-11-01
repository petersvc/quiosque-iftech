package example.states;

// Interface que define os métodos que devem ser implementados pelas classes que representam os estados do Kiosk
public interface State {
    void transitionTo(State state);
    void identifyStudent(String enrollment) throws Exception;
    void selectCourse(String courseName) throws Exception;
    void payment(String cardNumber, String cvv, String expirationDate, String owner) throws Exception;
    void generateTicket() throws Exception;
}
