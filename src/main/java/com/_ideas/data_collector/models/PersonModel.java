package com._ideas.data_collector.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.UUID;

@Entity
@Getter
@Setter
public class PersonModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private UUID id;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String email;
    private String phone;
    private String address;


}


