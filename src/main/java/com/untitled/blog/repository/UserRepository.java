package com.untitled.blog.repository;

import com.untitled.blog.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    public abstract User deleteById(int id);
}
