package com.Veli.EShopper.repository;

import com.Veli.EShopper.repository.entity.UserFavouriteProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserFavouriteProductRepository extends JpaRepository<UserFavouriteProduct,Long> {
    List<UserFavouriteProduct> findByUserid(long id);
}
