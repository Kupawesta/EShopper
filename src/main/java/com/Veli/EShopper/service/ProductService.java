package com.Veli.EShopper.service;

import com.Veli.EShopper.repository.entity.Product;
import com.Veli.EShopper.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public void save(Product item){
        productRepository.save(item);
    }
    public void update(Product item){
        productRepository.save(item);
    }
    public void delete(long id){
        productRepository.deleteById(id);
    }
    public List<Product> findAll(){
        return productRepository.findAll();
    }
    public Optional<Product> findById(long id){
        return productRepository.findById(id);
    }
    public List<Product> findBy
}
