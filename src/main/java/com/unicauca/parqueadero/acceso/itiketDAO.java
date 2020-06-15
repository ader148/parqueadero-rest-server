/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.acceso;


import com.unicauca.parqueadero.negocio.Ticket;
import java.util.List;

/**
 *
 * @author alvarodanieleraso
 */
public interface itiketDAO {
    
    public List<Ticket> getTikets();

    public Ticket find(int id_ticket);

    public Integer create(Ticket tic);

    public boolean edit(Ticket tik);

    public boolean remove(int idTiket);

    //public int count();
    
}
