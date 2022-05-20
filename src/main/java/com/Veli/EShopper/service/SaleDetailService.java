package com.Veli.EShopper.service;

import com.Veli.EShopper.repository.SaleDetailRepository;
import com.Veli.EShopper.repository.entity.SaleDetail;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SaleDetailService {
    public final SaleDetailRepository repository;
    public void save(SaleDetail item){
        repository.save(item);
    }
    public void update(SaleDetail item){
        repository.save(item);
    }
    public void delete(long id){
        repository.deleteById(id);
    }
    public List<SaleDetail> trendyproducts(long date){

        return null;
    }
}
