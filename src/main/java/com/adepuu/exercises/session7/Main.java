package com.adepuu.exercises.session7;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Concert");
        System.out.println("Movie");
        System.out.println("Sporting Event\n");

        Ticket ticket1 = new Ticket("Concert", 50.0);
        Ticket ticket2 = new Ticket("Movie", 20.0);
        Ticket ticket3 = new Ticket("Sporting Event", 30.0);

        System.out.println("Available tickets: " + Ticket.getAvailableTickets());

        System.out.println("Do you want to book a ticket? (yes/no)");
        String choice = scanner.next();

        if (choice.equalsIgnoreCase("yes")) {
            System.out.println("Enter ticket name to book:");
            String ticketName = scanner.next();

            if (ticketName.equalsIgnoreCase(ticket1.getName())) {
                ticket1.bookTicket();
                BookedTicket.incrementTotalBookedTickets();
            } else if (ticketName.equalsIgnoreCase(ticket2.getName())) {
                ticket2.bookTicket();
                BookedTicket.incrementTotalBookedTickets();
            } else if (ticketName.equalsIgnoreCase(ticket3.getName())) {
                ticket3.bookTicket();
                BookedTicket.incrementTotalBookedTickets();
            } else {
                System.out.println("Ticket not found!");
            }

            System.out.println("Total tickets sold: " + Ticket.getTotalTicketsSold());
            System.out.println("Available tickets: " + Ticket.getAvailableTickets());
        }
    }
}