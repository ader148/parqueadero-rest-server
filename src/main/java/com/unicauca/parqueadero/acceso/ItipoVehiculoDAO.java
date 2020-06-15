/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.acceso;

import com.unicauca.parqueadero.acceso.entidades.TipoVehiculo;
import com.unicauca.parqueadero.negocio.Vehiculo;
import java.util.List;

/**
 *
 * @author alvarodanieleraso
 */
public interface ItipoVehiculoDAO {
    
     public List<TipoVehiculo> getTipoVehiculos();

    //public Vehiculo find(String codigo);

    //public boolean create(Vehiculo veh);

    //public boolean edit(Vehiculo veh);

    //public boolean remove(String codigo);

    //public int count();
    
}
