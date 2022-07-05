package com.ejercicio2.springboot.repositories;

import com.ejercicio2.springboot.models.ModelUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.Optional;

@Repository
public interface RepositoryUser extends CrudRepository<ModelUser, Long> {
    public abstract Optional<ModelUser> findByGender(String gender);

    public abstract Optional<ModelUser> deleteUser(Long id);
}
