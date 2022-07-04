package com.ejercicio2.springboot.repositories;

import com.ejercicio2.springboot.models.ModelUser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryUser extends CrudRepository<ModelUser, Long> {
}
