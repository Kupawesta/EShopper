package com.Veli.EShopper.controller.rest;

import com.Veli.EShopper.dto.response.HomeResponseDto;
import com.Veli.EShopper.repository.entity.Users;
import com.Veli.EShopper.service.ProductService;
import com.Veli.EShopper.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("rest/post")
@RequiredArgsConstructor
public class HomeRestController {
    private final UsersService usersService;
    private final ProductService productService;
    private final com.vektorel.VektorelSocialMedia.utility.JwtTokenManager jwtTokenManager;

    @GetMapping("/getproductbyuserid")
    public ResponseEntity<HomeResponseDto> getProduct(long id, String token){
        if(jwtTokenManager.validateToken(token)){
            Optional<Users> users =usersService.findById(id);
            if(users.isPresent()){
                HomeResponseDto homeResponseDto = HomeResponseDto.builder()
                        .userfirstname(users.get().getFirstname())
                        .usersurname(users.get().getLastname())
                        .favouriteproductamount(0)
                        .salecartamount(0)
                        .trendyproductlist(productService.findAll())
                        .newproductlist(productService.findAll())
                        .build();
                return ResponseEntity.ok(homeResponseDto);
            }else{
                HomeResponseDto homeResponseDto = HomeResponseDto.builder()
                        .trendyproductlist(productService.findAll())
                        .newproductlist(productService.findAll())
                        .build();
               return ResponseEntity.ok(homeResponseDto);
            }

        }else
            return ResponseEntity.badRequest().build();


    }

}
