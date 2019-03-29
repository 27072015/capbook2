package com.cg.capbook.services;

import org.springframework.web.multipart.MultipartFile;

import com.cg.capbook.beans.UserProfile;
import com.cg.capbook.exceptions.EmailAlreadyExistException;
import com.cg.capbook.exceptions.EmailNotFoundException;
import com.cg.capbook.exceptions.IncorrectPasswordEnteredException;
import com.cg.capbook.exceptions.IncorrectSecurityQuetsionException;
import com.cg.capbook.exceptions.UserAlreadyExistException;
import com.cg.capbook.exceptions.UserNotFoundException;

public interface IUserServices {
	 public UserProfile acceptUserDetails(UserProfile user) throws UserAlreadyExistException, UserNotFoundException, EmailNotFoundException, EmailAlreadyExistException;
	 public UserProfile updateUserDetails(UserProfile user);
	 boolean deleteUserProfile(int userId);
	 public UserProfile findUserDetails(int userId) throws UserNotFoundException;
	 public UserProfile logIn(String userName,String pass)throws UserNotFoundException, EmailNotFoundException;
	 public UserProfile findUserProfile(String email) throws EmailNotFoundException;
	 public boolean changePassword(String email,String oldpassword,String newpassword)throws IncorrectPasswordEnteredException, EmailNotFoundException;
     public boolean forgetPassword(String email,String securityquestion,String securityanswer,String newpassword)throws EmailNotFoundException,IncorrectSecurityQuetsionException;
     public UserProfile saveImage(String email, MultipartFile image) throws UserNotFoundException, EmailNotFoundException;
}
