package com.epam.esm.dto;

import com.epam.esm.dao.entity.User;

public class UserDtoWithoutOrders {

    private Long id;
    private String name;
    private String surname;

    public UserDtoWithoutOrders() {
    }

    public UserDtoWithoutOrders(User entity) {
        this.id = entity.getId();
        this.name = entity.getName();
        this.surname = entity.getSurname();
    }

    public UserDtoWithoutOrders(Long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
