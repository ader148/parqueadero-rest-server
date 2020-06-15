/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.acceso;

import com.unicauca.parqueadero.negocio.Vehiculo;
import java.util.List;

/**
 *
 * @author alvarodanieleraso
 */
public interface IvehiculoDAO {
    
    //define los metodos que va a tener vehiculo
    //para comunicarse con la implementacion de JPA etc.
    
    public List<Vehiculo> getVehiculos();

    public Vehiculo find(String placa);

    public boolean create(Vehiculo veh);

    public boolean edit(Vehiculo veh);

    public boolean remove(String placa);

    public int count();
    
}
