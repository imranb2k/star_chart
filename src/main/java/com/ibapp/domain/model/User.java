package com.ibapp.domain.model;

import java.util.Date;

public class User {

    private Long id;
    private String name;
    private Integer age;
    private Date dateCreated;

    public User() {
    }

    public User(Long id,
                String name,
                Integer age,
                Date dateCreated)
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

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }
}
