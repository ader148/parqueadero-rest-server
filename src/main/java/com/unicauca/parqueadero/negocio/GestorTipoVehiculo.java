/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.negocio;

import com.unicauca.parqueadero.acceso.ItipoVehiculoDAO;
import com.unicauca.parqueadero.acceso.TipoVehiculoImplJPA;
import java.util.List;

/**
 *
 * @author alvarodanieleraso
 */
public class GestorTipoVehiculo {
    
    ItipoVehiculoDAO Tipovehiculos;
    
     public GestorTipoVehiculo() {
        Tipovehiculos = new TipoVehiculoImplJPA();
    }
    
    public List<com.unicauca.parqueadero.acceso.entidades.TipoVehiculo> getTipoVehiculos() {
        return Tipovehiculos.getTipoVehiculos();
    }
    
}
