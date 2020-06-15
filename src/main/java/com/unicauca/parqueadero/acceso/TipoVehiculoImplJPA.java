/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.acceso;


import com.unicauca.parqueadero.acceso.controladores.TipoVehiculoJpaController;
import com.unicauca.parqueadero.acceso.entidades.TipoVehiculo;
import com.unicauca.parqueadero.negocio.Vehiculo;
import java.util.List;

/**
 *
 * @author alvarodanieleraso
 */
public class TipoVehiculoImplJPA implements ItipoVehiculoDAO{
    
    Vehiculo aux = new Vehiculo(); //objeto auxiliar vehiculo
    
    TipoVehiculoJpaController cTipoVehiculo = new TipoVehiculoJpaController();
    

    @Override
    public List<TipoVehiculo> getTipoVehiculos() {
        
        //System.out.println("entro en get vehiculos");
        
        List<com.unicauca.parqueadero.acceso.entidades.TipoVehiculo> listTipoVehiculos= cTipoVehiculo.findTipoVehiculoEntities();
        
         for (int i = 0; i < listTipoVehiculos.size(); i++) {
             
             System.out.println("entro aca");
            System.out.println(""+listTipoVehiculos.get(i).getNombre());
            
            //se asignan valores a los atributos del nuevo objeto
            /*aux.setPlaca(listVehiculos.get(i).getPlaca());
            aux.setModelo(listVehiculos.get(i).getModelo());
            aux.setTipoVehiculo(listVehiculos.get(i).getTipoVehiculo());
            aux.setColor(listVehiculos.get(i).getColor());
            aux.setMarca(listVehiculos.get(i).getMarca());
            
             //se añade el objeto al final del array
            listaVehiculos.add(aux);*/
            
        }
        
       return listTipoVehiculos; 
    }
    
}
