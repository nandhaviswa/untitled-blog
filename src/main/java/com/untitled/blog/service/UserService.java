package com.untitled.blog.service;

import com.untitled.blog.model.User;
import com.untitled.blog.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    public UserRepository repository;

    public User create(User model){
        return repository.save(model);
    }

    public User view(int id){
        Optional<User> optionalUser = repository.findById(id);
        return optionalUser.orElseGet(() -> null);
    }

    public User update(int id, User source){
        Optional<User> optionalUser = repository.findById(id);
        if(optionalUser.isPresent()){
            User target = optionalUser.get();
            BeanUtils.copyProperties(source, target, "id");
            return repository.save(target);
        }
        return null;
    }

    public User delete(int id){
        return repository.deleteById(id);
    }

    public List<User> list(){
        return repository.findAll();
    }
}
