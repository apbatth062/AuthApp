package com.auth.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auth.app.model.UserModel;


public interface UserRepo extends JpaRepository<UserModel,String>{

	UserModel findByUsername(String username);

}
