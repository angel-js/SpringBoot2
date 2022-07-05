package com.ejercicio2.springboot.controllers;

import com.ejercicio2.springboot.models.ModelUser;
import com.ejercicio2.springboot.services.ServiceUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class ControllerUser {
    @Autowired
    ServiceUser serviceUser;
    ModelUser modelUser;


    @GetMapping("/getUsers")
    public ArrayList<ModelUser> getUser(){
        return serviceUser.getUser();
    }
    @GetMapping(path = "/getId{id}")
    public Optional<ModelUser> getOneUserId(@PathVariable("id") Long id) {return serviceUser.getOneUserId(modelUser.getId());}

    @GetMapping("/getGender")
    public Optional<ModelUser> getGender() {return serviceUser.getGender(modelUser.getGender());}

    @DeleteMapping(path ="/deleteUser{id}")
    public Optional<ModelUser> deleteUser(@PathVariable("id") Long id) {return serviceUser.deleteUser(modelUser.getId());}

    @PostMapping("/addUser")
    public ModelUser addUser(@RequestBody ModelUser user) {return this.serviceUser.addUser(user);}


}
