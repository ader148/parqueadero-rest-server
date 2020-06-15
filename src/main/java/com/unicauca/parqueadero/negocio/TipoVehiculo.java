/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.negocio;

/**
 *
 * @author alvarodanieleraso
 */
public class TipoVehiculo {
    
    private int id;
    private String tipo;
    
    //constructor parametrizado
    public TipoVehiculo(int id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    //constructor no parametrizado
    public TipoVehiculo() {
        this.id = 0;
        this.tipo = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
