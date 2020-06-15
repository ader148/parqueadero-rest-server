/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.negocio;


import com.unicauca.parqueadero.acceso.TicketImplJPA;
import com.unicauca.parqueadero.acceso.itiketDAO;
import java.util.List;

/**
 *
 * @author alvarodanieleraso
 */
public class GestorTicket {
    
    itiketDAO tickets;
    
    
     public GestorTicket() {
        tickets = new TicketImplJPA();
    }
     
     
      
    public List<Ticket> getTickets() {
        return tickets.getTikets();
    }
    
    public Ticket find(int id_ticket) {
        return tickets.find(id_ticket);
    }

    public Integer create(Ticket tic) {
        return tickets.create(tic);
    }

    public boolean edit(Ticket tic) {
        return tickets.edit(tic);
    }

    public boolean remove(int id) {
        return tickets.remove(id);
    }

   

}
