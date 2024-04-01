package com.adepuu.exercises.session7;

class BookedTicket {
    private static int totalBookedTickets = 0;

    public static void incrementTotalBookedTickets() {
        totalBookedTickets++;
    }

    public static int getTotalBookedTickets() {
        return totalBookedTickets;
    }
}
