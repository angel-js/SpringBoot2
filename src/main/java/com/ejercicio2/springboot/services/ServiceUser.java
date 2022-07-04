package com.ejercicio2.springboot.services;

import com.ejercicio2.springboot.models.ModelUser;
import com.ejercicio2.springboot.repositories.RepositoryUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ServiceUser {
    @Autowired
    RepositoryUser repositoryUser;

    public ArrayList<ModelUser> getUser(){
        return (ArrayList<ModelUser>) repositoryUser.findAll();
    }

    public ModelUser safeUser(ModelUser user){
        return repositoryUser.save(user);
    }

}
