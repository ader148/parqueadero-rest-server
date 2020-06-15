/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.service;


import com.unicauca.parqueadero.acceso.entidades.TipoVehiculo;
import com.unicauca.parqueadero.negocio.GestorTipoVehiculo;

import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


/**
 *
 * @author alvarodanieleraso
 */
@Stateless 
@Path("tipoVehiculo")
public class TipoVehiculoREST {
    
    private GestorTipoVehiculo tipoVehiculoDB;

    public TipoVehiculoREST() {
        tipoVehiculoDB = new GestorTipoVehiculo();
    }
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<TipoVehiculo> TipovehiculofindAll() {
        System.out.println("entro aca tipovehiculofindaLL");
        return tipoVehiculoDB.getTipoVehiculos();
    }
    
}
