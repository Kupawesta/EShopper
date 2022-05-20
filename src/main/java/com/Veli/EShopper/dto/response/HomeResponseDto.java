package com.Veli.EShopper.dto.response;

import com.Veli.EShopper.repository.UserFavouriteProductRepository;
import com.Veli.EShopper.repository.entity.Product;
import com.Veli.EShopper.repository.entity.Users;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HomeResponseDto {
    String userfirstname;
    String usersurname;
    int favouriteproductamount;
    int salecartamount;
    List<Product> trendyproductlist;
    List<Product> newproductlist;

}
