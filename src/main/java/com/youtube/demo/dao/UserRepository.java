package com.youtube.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.youtube.demo.model.User;

public interface UserRepository extends JpaRepository<User,Integer>{
	
	@SuppressWarnings("unchecked")
	User save(User user);

	

}
