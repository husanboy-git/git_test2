package com.example.demo4;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Member {
    @Id
    @GeneratedValue
    private String id;
}
