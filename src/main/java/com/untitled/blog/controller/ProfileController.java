package com.untitled.blog.controller;

import com.untitled.blog.model.Profile;
import com.untitled.blog.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    @Autowired
    public ProfileService service;

    @PostMapping("/create")
    public Profile create(@RequestBody Profile model){
        return service.create(model);
    }

    @GetMapping("/view/{id}")
    public Profile view(@PathVariable int id){
        return service.view(id);
    }

    @PutMapping("/update/{id}")
    public Profile update(@PathVariable int id, @RequestBody Profile model){
        return service.update(id, model);
    }

    @DeleteMapping("/delete/{id}")
    public Profile delete(@PathVariable int id){
        return service.delete(id);
    }

    @GetMapping("/index")
    public List<Profile> create(){
        return service.list();
    }
}
