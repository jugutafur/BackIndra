package com.asd.back.Persistence.CRUD;

import com.asd.back.Persistence.Entity.Multiplicacion;
import org.springframework.data.repository.CrudRepository;

public interface MultiplicationCRUDRepository extends CrudRepository<Multiplicacion, Integer> {
}