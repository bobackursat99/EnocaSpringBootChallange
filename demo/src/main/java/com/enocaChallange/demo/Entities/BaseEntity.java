package com.enocaChallange.demo.Entities;

import jakarta.persistence.*;

@Entity
@Table
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
