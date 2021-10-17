package com.untitled.blog.repository;

import com.untitled.blog.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Integer> {
    public abstract Profile deleteById(int id);
}
