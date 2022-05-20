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
@Table(name = "tbluserfavouriteproduct")
@Entity
public class UserFavouriteProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    long userid;
    long productid;
}
