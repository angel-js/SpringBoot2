package com.ejercicio2.springboot.controllers;

import com.ejercicio2.springboot.models.ModelUser;
import com.ejercicio2.springboot.services.ServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/user")
public class ControllerUser {
    @Autowired
    ServiceUser serviceUser;

    @GetMapping()
    public ArrayList<ModelUser> getUser(){
        return serviceUser.getUser();
    }
    @PostMapping()
    public ModelUser saveUser(@RequestBody ModelUser user){
        return this.serviceUser.safeUser(user);
    }
}
