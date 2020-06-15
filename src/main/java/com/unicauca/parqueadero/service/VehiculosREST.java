/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.service;

//import com.unicauca.simca.negocio.Estudiante;
//import com.unicauca.simca.negocio.EstudianteDAO;

import com.unicauca.parqueadero.negocio.GestorVehiculo;
import com.unicauca.parqueadero.negocio.Vehiculo;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


/**
 *
 * @author alvarodanieleraso
 */
@Stateless 
@Path("vehiculos")
public class VehiculosREST {
    
    private GestorVehiculo vehiculoDB;

    public VehiculosREST() {
        vehiculoDB = new GestorVehiculo();
    }
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<Vehiculo> vehiculofindAll() {
        return vehiculoDB.getVehiculos();
    }

    @GET
    @Path("{placa}")
    @Produces({MediaType.APPLICATION_JSON})
    public Vehiculo find(@PathParam("placa") String placa) {
        return vehiculoDB.find(placa);
    }
    
    @POST
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String create(Vehiculo veh) {
        if (vehiculoDB.create(veh)) {
            return "{\"ok\":\"true\", \"mensaje\":\"Vehiculo creado\",\"errores\":\"\"}";
        } else {
            return "{\"ok\":\"false\", \"mensaje\":\"No se pudo crear el vehiculo\",\"errores\":\"placa ya existe\"}";
        }
    }

    @PUT
    @Path("{placa}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String edit(@PathParam("placa") String placa, Vehiculo vhe) {
        if (vehiculoDB.edit(vhe)) {
            return "{\"ok\":\"true\", \"mensaje\":\"vehiculo modificado \",\"errores\":\"\"}"; 
        } else {
            return "{\"ok\":\"false\", \"mensaje\":\"No se pudo modificar el vehiculo\",\"errores\":\"placa no existe\"}";
        }
    }
    
    
    
    @DELETE
    @Path("{placa}")
    public String remove(@PathParam("placa") String placa) {
        if (vehiculoDB.remove(placa)) {
            return "{\"ok\":\"true\", \"mensaje\":\"vehiculo borrado\",\"errores\":\"\"}";
        } else {
            return "{\"ok\":\"false\", \"mensaje\":\"No se pudo borrar el vehiculo\",\"errores\":\"placa no existe\"}"; }
    }
    
    
    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(vehiculoDB.count());
    }
    
    
    
}
