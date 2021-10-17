package com.untitled.blog.controller;

import com.untitled.blog.model.User;
import com.untitled.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(("/user"))
public class UserController {

    @Autowired
    public UserService service;

    @PostMapping("/create")
    public User create(@RequestBody User model){
        return service.create(model);
    }

    @GetMapping("/view/{id}")
    public User view(@PathVariable int id){
        return service.view(id);
    }

    @PutMapping("/update/{id}")
    public User update(@PathVariable int id, @RequestBody User model){
        return service.update(id, model);
    }

    @DeleteMapping("/delete/{id}")
    public User delete(@PathVariable int id){
        return service.delete(id);
    }

    @GetMapping("/index")
    public List<User> create(){
        return service.list();
    }
}
