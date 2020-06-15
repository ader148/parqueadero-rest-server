/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.negocio;

import com.unicauca.parqueadero.acceso.IvehiculoDAO;
import com.unicauca.parqueadero.acceso.VehiculoDAOImpJPA;
import java.util.List;

/**
 *
 * @author alvarodanieleraso
 */
public class GestorVehiculo {

    IvehiculoDAO vehiculos;

    public GestorVehiculo() {
        //cambio de implementacion arreglos a JPA
        //vehiculos = new VehiculoDAOImplArreglos();
        vehiculos = new VehiculoDAOImpJPA();
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos.getVehiculos();
    }

    public Vehiculo find(String placa) {
        return vehiculos.find(placa);
    }

    public boolean create(Vehiculo veh) {
        return vehiculos.create(veh);
    }

    public boolean edit(Vehiculo veh) {
        return vehiculos.edit(veh);
    }

    public boolean remove(String codigo) {
        return vehiculos.remove(codigo);
    }

    public int count() {
        return vehiculos.count();
    }
}
