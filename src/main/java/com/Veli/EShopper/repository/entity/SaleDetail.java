package com.Veli.EShopper.repository.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tblsaledetail")
@Entity
public class SaleDetail {
    long id;
    long userid;
    long productid;
    double price;
    long amount;
    double taxes;
    double totalprice=amount*(price*taxes);
    long saledate;
}
