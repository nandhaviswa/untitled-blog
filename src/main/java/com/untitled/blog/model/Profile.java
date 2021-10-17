package com.untitled.blog.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Profile {
    @Id
    public int user_id;
    public String firstname;
    public String lastname;
}
