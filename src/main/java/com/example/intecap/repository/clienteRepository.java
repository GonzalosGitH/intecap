package com.example.intecap.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.example.intecap.models.productosModel;

public interface clienteRepository extends CrudRepository<productosModel, Object>{


    
}
