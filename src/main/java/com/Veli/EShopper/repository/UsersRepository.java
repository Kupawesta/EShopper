package com.Veli.EShopper.repository;

import com.Veli.EShopper.repository.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsersRepository extends JpaRepository<Users,Long> {

    Users findByUsernameAndPassword(String username, String password);

    Optional<Users> findOptionalByUsernameAndPassword(String username, String password);

}
