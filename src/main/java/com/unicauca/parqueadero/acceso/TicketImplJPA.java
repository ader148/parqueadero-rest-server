/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.acceso;

import com.unicauca.parqueadero.acceso.controladores.TicketJpaController;
import com.unicauca.parqueadero.negocio.Ticket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author alvarodanieleraso
 */
public class TicketImplJPA implements itiketDAO{
    
    
    TicketJpaController cTicket = new TicketJpaController();
    
    static ArrayList<Ticket> listatickets = new ArrayList();
    
    Ticket aux = new Ticket(); //objeto auxiliar vehiculoc
    
    private List<Ticket> lista;
    
    
    public TicketImplJPA() {
        lista = new ArrayList(); 
        //inicializar();
    }

    @Override
    public List<Ticket> getTikets() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        List<com.unicauca.parqueadero.acceso.entidades.Ticket> listTickets= cTicket.findTicketEntities();
            
        for (int i = 0; i < listTickets.size(); i++) {
            System.out.println(""+listTickets.get(i).getCodigo());
            
            //se asignan valores a los atributos del nuevo objeto
            aux.setCodigo(listTickets.get(i).getCodigo());
            aux.setHora_entrada(listTickets.get(i).getHoraEntrada());
            aux.setHora_salida(listTickets.get(i).getHoraSalida());
            aux.setId_ticket(listTickets.get(i).getIdTicket());
           
            
             //se añade el objeto al final del array
            listatickets.add(aux);
            
        }
        
       return listatickets;
        
    }

    @Override
    public Ticket find(int i) {
        
        com.unicauca.parqueadero.negocio.Ticket auxtic = new Ticket();
        
        Ticket ti = new Ticket();
        
        //llenamos el objeto auxiliar
        ti.setCodigo(cTicket.findTicket(i).getCodigo());
        ti.setHora_entrada(cTicket.findTicket(i).getHoraEntrada());
        ti.setHora_salida(cTicket.findTicket(i).getHoraSalida());
        ti.setId_ticket(cTicket.findTicket(i).getIdTicket());
         
         return ti;           
         
    }

    @Override
    public Integer create(Ticket ticket) {
        
        Ticket auxtic = new Ticket(ticket.getId_ticket(),ticket.getHora_entrada(),ticket.getHora_salida(),ticket.getCodigo());
        
        com.unicauca.parqueadero.acceso.entidades.Ticket tic = new com.unicauca.parqueadero.acceso.entidades.Ticket();
        tic.setIdTicket(auxtic.getId_ticket());
        tic.setHoraEntrada(auxtic.getHora_entrada());
        tic.setHoraSalida(auxtic.getHora_salida());
        tic.setCodigo(auxtic.getCodigo());
        
        try {
            //retornamos el id creado del ticket
            return cTicket.create(tic);
        } catch (Exception e) {
            Logger.getLogger(VehiculoDAOImpJPA.class.getName()).log(Level.SEVERE, null, e);
            return 0;
        }
    }

    @Override
    public boolean edit(Ticket ticket) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean remove(int idTiket) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    
}
