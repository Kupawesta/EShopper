package com.Veli.EShopper.dto.response;

import com.Veli.EShopper.repository.entity.SaleDetail;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HomePageDto {
    public List<SaleDetail> trendyproducts(long id, long date){

        return null;
    }
}
