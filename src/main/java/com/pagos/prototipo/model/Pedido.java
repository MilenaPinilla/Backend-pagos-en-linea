package com.pagos.prototipo.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "pedido")
public class Pedido {

    public Pedido(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_pedido;
    private Date fecha_creacion;
    private Double total;
    private Integer cedula;

    @ManyToOne()
    @JoinColumn(name = "cedula", insertable = false, updatable = false)
    private Usuario cliente;

    public Integer getId_pedido() {
        return id_pedido;
    }

    public void setId_pedido(Integer id_pedido) {
        this.id_pedido = id_pedido;
    }

    public Date getFecha_creacion() {
        return fecha_creacion;
    }

    public void setFecha_creacion(Date fecha_creacion) {
        this.fecha_creacion = fecha_creacion;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public Usuario getCliente() {
        return cliente;
    }

    public void setCliente(Usuario cliente) {
        this.cliente = cliente;
    }
}
