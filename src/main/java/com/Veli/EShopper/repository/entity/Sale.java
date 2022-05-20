package com.Veli.EShopper.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "tblsale")
@Entity
public class Sale {
    long id;
    long userid;
    long saledate;
    double price;
    double taxes;
    double totalprice;
}
