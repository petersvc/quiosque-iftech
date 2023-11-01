package example.repositories;

import example.models.Ticket;

import java.util.ArrayList;
import java.util.List;

public class TicketsRepository {

    private final List<Ticket> tickets;

    public TicketsRepository() {
        this.tickets = new ArrayList<>();

    }

    public void addTicket(Ticket ticket) {
        this.tickets.add(ticket);
    }

    public Ticket findTicketByOwnerEnrollment(String ownerEnrollment) {
        for (Ticket ticket : this.tickets) {
            if (ticket.getStudent().getEnrollment().equals(ownerEnrollment)) {
                return ticket;
            }
        }
        return null;
    }

    public List<Ticket> findTicketsByCourseName(String courseName) {
        List<Ticket> tickets = new ArrayList<>();
        for (Ticket ticket : this.tickets) {
            if (ticket.getCourse().getName().equals(courseName)) {
                tickets.add(ticket);
            }
        }
        return tickets;
    }

    public List<Ticket> getTickets() {
        return this.tickets;
    }
}
