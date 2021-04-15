package com.pagos.prototipo.repository;

import com.pagos.prototipo.model.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
}
