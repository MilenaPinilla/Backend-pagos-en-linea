package com.pagos.prototipo.controller;

import com.pagos.prototipo.model.Pedido;
import com.pagos.prototipo.model.Producto;
import com.pagos.prototipo.model.RelacionProPe;
import com.pagos.prototipo.model.Usuario;
import com.pagos.prototipo.servicio.PagoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PedidoController {

   @Autowired
   private PagoServices pagoServices;

   @PostMapping(value = "/create-pedido", consumes = "application/json")
   public Pedido postPedido(@RequestBody List<Producto> pedido){
       return pagoServices.generarPedido(pedido, new Usuario());
   }

   @PostMapping(value = "/create-pedido2/{user_id}", consumes = "application/json")
    public void crearPedido(@PathVariable("user_id") Integer user_id, @RequestBody List<RelacionProPe> productos){

   }
 }
