package com.Veli.EShopper.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name="tblproduct")
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String name;
    double price;
    String size;
    String color;
    long categoriesId;
    @Column(length = 1000)
    String description;
    @Column(length = 2000)
    String information;
}
