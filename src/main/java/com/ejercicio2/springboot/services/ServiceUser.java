package com.ejercicio2.springboot.services;

import com.ejercicio2.springboot.models.ModelUser;
import com.ejercicio2.springboot.repositories.RepositoryUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ServiceUser {
    @Autowired
    RepositoryUser repositoryUser;

    /** @params Obtiene todos los Usuarios*/
    public ArrayList<ModelUser> getUser(){
        return (ArrayList<ModelUser>) repositoryUser.findAll();
    }

    /** @params Guarda la información del usuario*/

    /**
     * @params Obtiene Un usuario por su id
     */
    public Optional<ModelUser> getOneUserId(Long id){
        return repositoryUser.findById(id);

    }

    public Optional<ModelUser> getGender(String gender) {
        return repositoryUser.findByGender(gender);
    }

    public  Optional<ModelUser> deleteUser(Long id){
        return repositoryUser.deleteUser(id);
    }


    public ModelUser addUser(ModelUser user) {
        return repositoryUser.save(user);
    }
}
