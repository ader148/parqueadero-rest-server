package com.unicauca.parqueadero.acceso.entidades;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-06-13T12:50:04")
@StaticMetamodel(Ticket.class)
public class Ticket_ { 

    public static volatile SingularAttribute<Ticket, Integer> idTicket;
    public static volatile SingularAttribute<Ticket, Integer> codigo;
    public static volatile SingularAttribute<Ticket, Date> horaEntrada;
    public static volatile SingularAttribute<Ticket, Date> horaSalida;

}