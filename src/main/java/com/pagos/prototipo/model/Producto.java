package com.pagos.prototipo.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "producto")
public class Producto implements Serializable {

    public Producto(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private
    Integer id_producto;

    private String nombre;
    private Double valor;


    public Integer getId_producto() {
        return id_producto;
    }

    public void setId_producto(Integer id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
