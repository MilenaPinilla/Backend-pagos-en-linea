package com.pagos.prototipo.repository;


import com.pagos.prototipo.model.Producto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends CrudRepository<Producto, Integer> {
}
