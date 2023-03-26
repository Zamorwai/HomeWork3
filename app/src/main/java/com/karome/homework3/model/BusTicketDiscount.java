package com.karome.homework3.model;

public class BusTicketDiscount extends BusTicket{
    private float ticketDiscount;

    public BusTicketDiscount() {
    }

    // Создание конструктора из исходных данных
    public BusTicketDiscount(float ticketPrice, int numbersOfTickets, float ticketDiscount) {
        super(ticketPrice, numbersOfTickets);
        this.ticketDiscount = ticketDiscount;
    }

    public float ticketPriceAll() {
        return (getTicketPrice() * getNumbersOfTickets() * (100 - ticketDiscount))/100;
    }
}
