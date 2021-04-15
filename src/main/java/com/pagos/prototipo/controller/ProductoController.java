package com.pagos.prototipo.controller;

import com.pagos.prototipo.model.Producto;
import com.pagos.prototipo.servicio.ProductoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductoController {
    @Autowired
    private ProductoServices productoServices;

    @PostMapping("/create-product")
    public Producto postProducto(@RequestBody Producto producto){
        return productoServices.generateProducto(producto);
    }

}
