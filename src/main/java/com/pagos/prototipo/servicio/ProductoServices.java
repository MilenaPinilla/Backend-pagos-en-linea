package com.pagos.prototipo.servicio;

import com.pagos.prototipo.model.Producto;
import com.pagos.prototipo.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoServices {
    @Autowired
    private ProductoRepository productoRepository;

    public Producto generateProducto(Producto producto){
        return productoRepository.save(producto);
    }
}
