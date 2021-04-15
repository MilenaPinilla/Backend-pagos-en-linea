package com.pagos.prototipo.repository;

import com.pagos.prototipo.model.Pedido;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepository extends CrudRepository<Pedido, Integer> {
}

