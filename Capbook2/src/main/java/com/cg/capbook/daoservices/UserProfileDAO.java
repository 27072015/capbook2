package com.cg.capbook.daoservices;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cg.capbook.beans.UserProfile;
import com.cg.capbook.exceptions.EmailNotFoundException;

public interface UserProfileDAO extends JpaRepository<UserProfile, Integer> {
	@Query("from UserProfile u where u.email=:email")
	public UserProfile findUserByEmail(@Param("email")String email)throws EmailNotFoundException;
	@Modifying
	@Query("update UserProfile u set u.password=: password where u.email=: email")
	public UserProfile updateUserPassword(@Param("password")String password,@Param("email")String email);
}