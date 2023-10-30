public class Main {
    public static void main(String[] args) {
        // Criando um kiosk e carregando os cursos e alunos
        StudentsRepository studentsRepository = new StudentsRepository();
        CoursesRepository coursesRepository = new CoursesRepository();
        CreditCardRepository creditCardRepository = new CreditCardRepository();
        Kiosk kiosk = new Kiosk(studentsRepository, coursesRepository, creditCardRepository);

        // Simulando interações do aluno com o
        do {
            kiosk.start();
            kiosk.identifyStudent();
            kiosk.selectCourse();
            kiosk.payment();
            kiosk.generateTicket();
            kiosk.finalizar();
        } while (true);

    }
}
