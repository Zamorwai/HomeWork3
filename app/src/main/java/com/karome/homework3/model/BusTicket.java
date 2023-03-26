package com.karome.homework3.model;

public class BusTicket {
    private float ticketPrice;
    private int numbersOfTickets;

    public BusTicket() {
    }

    public BusTicket(float ticketPrice, int numbersOfTickets) {
        this.ticketPrice = ticketPrice;
        this.numbersOfTickets = numbersOfTickets;
    }

    public float ticketPriceAll() {
        return ticketPrice * numbersOfTickets;
    }


    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getNumbersOfTickets() {
        return numbersOfTickets;
    }

    public void setNumbersOfTickets(int numbersOfTickets) {
        this.numbersOfTickets = numbersOfTickets;
    }
}
