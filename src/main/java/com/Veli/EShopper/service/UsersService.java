package com.Veli.EShopper.service;

import com.Veli.EShopper.repository.UsersRepository;
import com.Veli.EShopper.repository.entity.Users;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UsersService {
    public final UsersRepository usersRepository;
    public void save(Users item){
        usersRepository.save(item);
    }
    public void upload(Users item){
        usersRepository.save(item);
    }
   public void delete(long id){
        usersRepository.deleteById(id);
   }
   public List<Users> findAll(){
        return usersRepository.findAll();
   }
   public Optional<Users> findById(long id){
        return usersRepository.findById(id);
   }


}
