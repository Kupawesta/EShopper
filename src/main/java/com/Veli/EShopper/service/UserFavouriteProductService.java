package com.Veli.EShopper.service;

import com.Veli.EShopper.repository.UserFavouriteProductRepository;
import com.Veli.EShopper.repository.entity.UserFavouriteProduct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserFavouriteProductService {
    public final UserFavouriteProductRepository repository;
    public void save(UserFavouriteProduct item){
        repository.save(item);
    }
    public void update(UserFavouriteProduct item){
        repository.save(item);
    }
    public void delete(long id){
        repository.deleteById(id);
    }
    public List<UserFavouriteProduct> findAll(long id){
        return repository.findAll();
    }
    public List<UserFavouriteProduct> findByUserid(long id){
        return repository.findByUserid(id);
    }
}
