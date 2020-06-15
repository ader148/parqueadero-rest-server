/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.service;


import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import com.unicauca.parqueadero.acceso.entidades.Ticket;
import com.unicauca.parqueadero.negocio.GestorTicket;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import jdk.nashorn.internal.parser.JSONParser;
import org.json.JSONObject;

/**
 *
 * @author alvarodanieleraso
 */
@Stateless 
@Path("ticket")
public class TicketREST {
    
    private GestorTicket TicketDB;
    
    public TicketREST() {
        TicketDB = new GestorTicket();
    }
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<com.unicauca.parqueadero.negocio.Ticket> ticketsfinAll() {
        System.out.println("entro aca todos los tickets");
        return TicketDB.getTickets();
    }

    
    
    @GET
    @Path("{id_ticket}")
    @Produces({MediaType.APPLICATION_JSON})
    public com.unicauca.parqueadero.negocio.Ticket find(@PathParam("id_ticket") int id_ticket) {
        System.out.println("buscara id");
        return TicketDB.find(id_ticket);
    }
    
    @POST
    //@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    @Consumes(MediaType.APPLICATION_JSON)
    //public String create(com.unicauca.parqueadero.negocio.Ticket tic) {
    public String create(String jsonn) {
        
        com.unicauca.parqueadero.negocio.Ticket ticc= new com.unicauca.parqueadero.negocio.Ticket();
        
       JSONObject jsonObject = new JSONObject(jsonn);
       
       int codigoPOST= jsonObject.getInt("codigo");
       
       String fechaPOST = jsonObject.getString("hora_entrada");
       
       SimpleDateFormat formatter = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
       
        try {
            Date date = formatter.parse(fechaPOST);
            System.out.println(date.toString());

       
       ticc.setHora_entrada(date);
       //ticc.setHora_salida("");
       ticc.setCodigo(codigoPOST);
        
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        //lamada para crear el objeto
        Integer resultado = TicketDB.create(ticc);
          
        if ( resultado== 0) {
            return "{\"ok\":\"false\", \"mensaje\":\"No se pudo crear el ticket\",\"errores\":\"id ya existe\",\"id\":\"false\"   }";
        } else {
            return "{\"ok\":\"true\", \"mensaje\":\"Ticket creado\",\"errores\":\"\", \"id\":\" "+resultado+" \" }";
            
        }
    }

  /*  @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public String edit(@PathParam("id") int id, Ticket tic) {
        if (TicketDB.edit(tic)) {
            return "{\"ok\":\"true\", \"mensaje\":\"ticket modificado \",\"errores\":\"\"}"; 
        } else {
            return "{\"ok\":\"false\", \"mensaje\":\"No se pudo modificar el ticket\",\"errores\":\"id no existe\"}";
        }
    }*/
    
    
    
    @DELETE
    @Path("{id}")
    public String remove(@PathParam("id") int id) {
        if (TicketDB.remove(id)) {
            return "{\"ok\":\"true\", \"mensaje\":\"ticket borrado\",\"errores\":\"\"}";
        } else {
            return "{\"ok\":\"false\", \"mensaje\":\"No se pudo borrar el ticket\",\"errores\":\"ticket no existe\"}"; }
    }


    
}
