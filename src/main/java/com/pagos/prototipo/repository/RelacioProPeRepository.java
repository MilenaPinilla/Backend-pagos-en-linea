package com.pagos.prototipo.repository;


import com.pagos.prototipo.model.RelacionProPe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RelacioProPeRepository extends CrudRepository<RelacionProPe, Integer> {
}
