/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unicauca.parqueadero.acceso.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author alvarodanieleraso
 */
@Entity
@Table(name = "ticket")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ticket.findAll", query = "SELECT t FROM Ticket t"),
    @NamedQuery(name = "Ticket.findByIdTicket", query = "SELECT t FROM Ticket t WHERE t.idTicket = :idTicket"),
    @NamedQuery(name = "Ticket.findByHoraEntrada", query = "SELECT t FROM Ticket t WHERE t.horaEntrada = :horaEntrada"),
    @NamedQuery(name = "Ticket.findByHoraSalida", query = "SELECT t FROM Ticket t WHERE t.horaSalida = :horaSalida"),
    @NamedQuery(name = "Ticket.findByCodigo", query = "SELECT t FROM Ticket t WHERE t.codigo = :codigo")})
public class Ticket implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_ticket")
    private Integer idTicket;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hora_entrada")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaEntrada;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hora_salida")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaSalida;
    @Basic(optional = false)
    @NotNull
    @Column(name = "codigo")
    private int codigo;

    public Ticket() {
    }

    public Ticket(Integer idTicket) {
        this.idTicket = idTicket;
    }

    public Ticket(Integer idTicket, Date horaEntrada, Date horaSalida, int codigo) {
        this.idTicket = idTicket;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.codigo = codigo;
    }
    
    public Ticket(Date horaEntrada, Date horaSalida, int codigo) {
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.codigo = codigo;
    }

    public Integer getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(Integer idTicket) {
        this.idTicket = idTicket;
    }

    public Date getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(Date horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTicket != null ? idTicket.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ticket)) {
            return false;
        }
        Ticket other = (Ticket) object;
        if ((this.idTicket == null && other.idTicket != null) || (this.idTicket != null && !this.idTicket.equals(other.idTicket))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.unicauca.parqueadero.acceso.entidades.Ticket[ idTicket=" + idTicket + " ]";
    }
    
}
