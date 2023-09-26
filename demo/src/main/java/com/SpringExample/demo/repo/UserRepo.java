package com.SpringExample.demo.repo;

import com.SpringExample.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository <User, Integer> {

    @Query(value = "SELECT * FROM USER WHERE ID = ?1", nativeQuery = true)
    User getUserById(String userId);

    @Query(value = "SELECT * FROM USER WHERE ID = ?1 AND ADDRESS = ?2", nativeQuery = true)
    User getUserByIdAndAddress(String userId, String address);

    //if update query add
    //@Modifying
}
