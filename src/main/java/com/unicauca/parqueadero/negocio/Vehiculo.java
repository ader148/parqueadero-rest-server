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
public class Vehiculo {
    
    //atributos de la clase
    private String placa;
    private String modelo;
    private int tipoVehiculo;
    private String marca;
    private String color;
    
    //constructor parametrizado
    public Vehiculo(String placa, String modelo, int tipoVehiculo, String marca, String color) {
        this.placa = placa;
        this.modelo = modelo;
        this.tipoVehiculo = tipoVehiculo;
        this.marca = marca;
        this.color = color;
    }

    //constructor no parametrizado
    public Vehiculo() {
        this.placa = "";
        this.modelo = "";
        this.tipoVehiculo = 0;
        this.marca = "";
        this.color = "";
    }
    
     public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(int tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
