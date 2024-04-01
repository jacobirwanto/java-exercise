package com.adepuu.exercises.session7;

class Ticket {
    private String name;
    private double price;
    private boolean isBooked;
    private static int totalTicketsSold = 0;

    public Ticket(String name, double price) {
        this.name = name;
        this.price = price;
        this.isBooked = false;
        totalTicketsSold++;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void bookTicket() {
        if (!isBooked) {
            isBooked = true;
            System.out.println("Ticket for " + name + " has been booked successfully.");
        } else {
            System.out.println("Ticket for " + name + " is already booked.");
        }
    }

    public static int getTotalTicketsSold() {
        return totalTicketsSold;
    }

    public static int getAvailableTickets() {
        return totalTicketsSold - BookedTicket.getTotalBookedTickets();
    }
}