package com.pagos.prototipo.controller;

import com.pagos.prototipo.model.Pedido;
import com.pagos.prototipo.model.Producto;
import com.pagos.prototipo.model.Usuario;
import com.pagos.prototipo.repository.PedidoRepository;
import com.pagos.prototipo.repository.UsuarioRepository;
import com.pagos.prototipo.servicio.PagoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestControllerPagos {

    @Autowired
    PedidoRepository pedidoRepository;

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    PagoServices pagoServices;
    
    @GetMapping(path = "/")
    public Iterable<Usuario> ola(){
        return usuarioRepository.findAll();
    }

    //POST
    @PostMapping(path = "/generar")
    public void generacion_factura(@RequestBody List<Producto> productos){

    }

    //PUT
    @PutMapping(path = "/agregar/{id_pedido}")
    public void agregar_producto(@RequestBody Producto productos){

    }

    //PUT
    @PutMapping(path = "/editar/{id_pedido}")
    public void editar_factura(@RequestBody Producto productos){

    }

    //DELETE
    @DeleteMapping(path = "/borrar/{id_pedido}")
    public void eliminar_pedido(@PathVariable("id_pedido") Integer id_pedido){

    }


}
