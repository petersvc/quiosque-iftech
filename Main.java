public class Main {
    public static void main(String[] args) {
        // Criando um kiosk e carregando os cursos e alunos
        StudentsRepository studentsRepository = new StudentsRepository();
        CoursesRepository coursesRepository = new CoursesRepository();
        CreditCardsRepository creditCardsRepository = new CreditCardsRepository();
        TicketsRepository ticketsRepository = new TicketsRepository();
        Kiosk kiosk = new Kiosk(studentsRepository, coursesRepository, creditCardsRepository, ticketsRepository);

        // Iniciando o kiosk
        kiosk.start();
    }
}
