package com.karome.homework3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.karome.homework3.model.BusTicket;
import com.karome.homework3.model.BusTicketDiscount;

public class MainActivity extends AppCompatActivity {

    // Создание объекта для просто взрослых
    BusTicket busTicket = new BusTicketDiscount(70, 9, 0);
    // Создание объекта для детей
    BusTicket busTicketKid = new BusTicketDiscount(70, 11, 50);
    // Создание объекта для пенсионеров
    BusTicket busTicketElder = new BusTicketDiscount(70, 5, 30);

    private TextView busTicketOut;
    private TextView busTicketKidOut;
    private TextView busTicketElderOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        busTicketOut = findViewById(R.id.busTicketOut);
        busTicketKidOut = findViewById(R.id.busTicketKidOut);
        busTicketElderOut = findViewById(R.id.busTicketElderOut);

        busTicketOut.setText(Float.toString(busTicket.ticketPriceAll()) + " монет");
        busTicketKidOut.setText(Float.toString(busTicketKid.ticketPriceAll()) + " монет");
        busTicketElderOut.setText(Float.toString(busTicketElder.ticketPriceAll()) + " монет");
    }
}