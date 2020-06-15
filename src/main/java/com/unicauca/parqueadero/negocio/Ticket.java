/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.negocio;

import java.util.Date;

/**
 *
 * @author alvarodanieleraso
 */
public class Ticket {
    
     //atributos de la clase
    private int id_ticket;
    private Date hora_entrada;
    private Date hora_salida;
    private int codigo;

    public Ticket() {
        this.id_ticket = 0;
        this.hora_entrada = new Date();
        this.hora_salida = new Date();
        this.codigo = 0;
    }
    
    public Ticket(int id_ticket, Date hora_entrada, Date hora_salida, int codigo) {
        
        //mapeamos la fecha recibida
        System.out.println("esta es la fecha");
        System.out.println(hora_entrada);
        
        this.id_ticket = id_ticket;
        this.hora_entrada = hora_entrada;
        this.hora_salida = hora_salida;
        this.codigo = codigo;
        
    }

    public int getId_ticket() {
        return id_ticket;
    }

    public void setId_ticket(int id_ticket) {
        this.id_ticket = id_ticket;
    }

    public Date getHora_entrada() {
        return hora_entrada;
    }

    public void setHora_entrada(Date hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public Date getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(Date hora_salida) {
        this.hora_salida = hora_salida;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    
    
    
    
    
}
