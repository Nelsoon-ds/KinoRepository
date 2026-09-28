package com.group2.kinoproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;

@Entity
public class Ticket {


    @Id
    private int ticketId;

    @JoinTable(name = "ticket_type")
    @ManyToOne
    private TicketType ticketType;


}
