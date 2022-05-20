package com.Veli.EShopper.service;

import com.Veli.EShopper.repository.CategoriesRepository;
import com.Veli.EShopper.repository.entity.Categories;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.LifecycleState;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoriesService {
    public final CategoriesRepository categoriesRepository;
    public void save(Categories item) {
        categoriesRepository.save(item);
    }
    public void update(Categories item){
        categoriesRepository.save(item);
    }
    public void delete(long id){
        categoriesRepository.deleteById(id);
    }
    public List<Categories> findAll(){
        return categoriesRepository.findAll();
    }
    public Optional<Categories> findById(long id){
        return categoriesRepository.findById(id);
    }
}
