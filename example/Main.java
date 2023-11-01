package example;

import example.repositories.CoursesRepository;
import example.repositories.CreditCardsRepository;
import example.repositories.StudentsRepository;
import example.repositories.TicketsRepository;

public class Main {
    public static void main(String[] args) {
        // Criando um kiosk e os repositorios necessarios
        StudentsRepository studentsRepository = new StudentsRepository();
        CoursesRepository coursesRepository = new CoursesRepository();
        CreditCardsRepository creditCardsRepository = new CreditCardsRepository();
        TicketsRepository ticketsRepository = new TicketsRepository();

        Kiosk kiosk = new Kiosk(studentsRepository, coursesRepository, creditCardsRepository, ticketsRepository);

        // Iniciando o kiosk
        kiosk.start();
    }
}
