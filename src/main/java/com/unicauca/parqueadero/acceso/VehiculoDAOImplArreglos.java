/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.acceso;

import com.unicauca.parqueadero.negocio.Vehiculo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alvarodanieleraso
 */
public class VehiculoDAOImplArreglos implements IvehiculoDAO {

    private List<Vehiculo> lista;
    
    public VehiculoDAOImplArreglos() {
        lista = new ArrayList(); 
        inicializar();
    }
    
    private void inicializar() {
        lista.add(new Vehiculo("CVY-000","2012",0,"mazda","negro"));
        lista.add(new Vehiculo("CRY-263","2015",0,"ford","negro"));
        lista.add(new Vehiculo("WOW-666","1995",0,"hyundai","negro"));
        lista.add(new Vehiculo("HNK-452","2018",0,"honda","negro"));
        lista.add(new Vehiculo("MKY-763","2020",0,"mazda","negro"));
    }
    
    
    @Override
    public List<Vehiculo> getVehiculos() {
       return lista;
    }

    @Override
    public Vehiculo find(String placa) {
        for (Vehiculo vhe : lista) {
            if (vhe.getPlaca().equals(placa)) {
                return vhe;
            }
        }
        return null;
    }

    @Override
    public boolean create(Vehiculo veh) {
        if (this.find(veh.getPlaca()) == null) {
            lista.add(veh);
            return true;    
        }
        return false;
    }

    @Override
    public boolean edit(Vehiculo veh) {
        Vehiculo vehAux = this.find(veh.getPlaca());
        if (vehAux == null) {
            return false;
        }
        this.remove(veh.getPlaca());
        this.create(veh);
        return true;
    }

    @Override
    public boolean remove(String placa) {
        Vehiculo veh = this.find(placa);
        if (veh == null) {
            return false;
        }
        lista.remove(veh);
        return true;
    }

    @Override
    public int count() {
        return lista.size();
    }
    
}
