package com.pagos.prototipo.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "relacion")
public class RelacionProPe implements Serializable {

    public RelacionProPe(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_relacion;

    @ManyToOne()
    //@MapsId("id_pedido")
    @JoinColumn(name = "id_pedido", insertable = false, updatable = false)
    private Pedido pedido;

    @ManyToOne()
    @JoinColumn(name = "id_producto")
    private Producto producto;

    public Integer getId_relacion() {
        return id_relacion;
    }

    public void setId_relacion(Integer id_relacion) {
        this.id_relacion = id_relacion;
    }


    public Producto getProducto() {
        return producto;
    }
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
}
