package com.group2.kinoproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TicketType {

    @Id
    private int ticketTypeId;

    private TicketTypes type;

    private double totalPrice;


}
