public interface State {
    void transitionTo();
    void identifyStudent(String enrollment) throws Exception;
    void selectCourse(String courseName) throws Exception;
    void payment(String cardNumber, String cvv, String expirationDate, String owner) throws Exception;
    Ticket generateTicket() throws Exception;
}
