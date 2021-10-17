package com.untitled.blog.service;

import com.untitled.blog.model.Profile;
import com.untitled.blog.repository.ProfileRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfileService {

    @Autowired
    public ProfileRepository repository;

    public Profile create(Profile model){
        return repository.save(model);
    }

    public Profile view(int id){
        Optional<Profile> optionalProfile = repository.findById(id);
        return optionalProfile.orElseGet(() -> null);
    }

    public Profile update(int id, Profile source){
        Optional<Profile> optionalProfile = repository.findById(id);
        if(optionalProfile.isPresent()){
            Profile target = optionalProfile.get();
            BeanUtils.copyProperties(source, target, "user_id");
            return repository.save(target);
        }
        return null;
    }

    public Profile delete(int id){
        return repository.deleteById(id);
    }

    public List<Profile> list(){
        return repository.findAll();
    }
}
