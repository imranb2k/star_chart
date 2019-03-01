package com.ibapp.domain.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class User {

    @Id
    private Long id;
    private String name;
    private Integer age;
    private LocalDateTime dateCreated;

    public User() {
    }

    public User(Long id,
                String name,
                Integer age,
                LocalDateTime dateCreated)
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.dateCreated = dateCreated;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDateTime getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }
}
