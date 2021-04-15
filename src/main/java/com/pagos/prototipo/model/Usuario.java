package com.pagos.prototipo.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "usuario")
public class Usuario {

    public Usuario(){

    }

    @Id
    private Integer cedula;
    private String direccion;

    @OneToMany(
            mappedBy = "cedula",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    private List<Pedido> pedidos;

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
