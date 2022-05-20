package com.Veli.EShopper.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.bind.DefaultValue;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Table(name = "tblusers")
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String avatar;
    String firstname;
    String lastname;
    String phonenumber;
    String adress;
    String city;
    String country;
    String state;
    String email;
    String password;
    @Column(length = 500)
    String description;
}
