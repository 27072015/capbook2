package com.cg.capbook.services;



import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.cg.capbook.beans.UserProfile;
import com.cg.capbook.daoservices.UserProfileDAO;
import com.cg.capbook.exceptions.EmailAlreadyExistException;
import com.cg.capbook.exceptions.EmailNotFoundException;
import com.cg.capbook.exceptions.IncorrectPasswordEnteredException;
import com.cg.capbook.exceptions.IncorrectSecurityQuetsionException;
import com.cg.capbook.exceptions.UserAlreadyExistException;
import com.cg.capbook.exceptions.UserNotFoundException;
@Component("userServices")
public class UserServicesImpl implements IUserServices {
	@Autowired
	UserProfileDAO userProfileDao;
	private static String StorageLocation ="D:\\JavaFullSatckFinalProject\\CapBookRemoteRepoTeam4\\src\\main\\resources\\static\\images\\";
	private Base64 base64=new Base64();
	public UserProfile acceptUserDetails(UserProfile user)throws UserAlreadyExistException, UserNotFoundException, EmailNotFoundException, EmailAlreadyExistException {
		if(findUserProfile(user.getEmail())==null) {
			String encodedString = new String(base64.encode(user.getPassword().getBytes()));
			user.setPassword(encodedString); 
			return userProfileDao.save(user);
		}
		else throw new EmailAlreadyExistException("Email exist");
	}
	@Override
	public UserProfile updateUserDetails(UserProfile user) {
		return userProfileDao.save(user);
	}

	@Override
	public boolean deleteUserProfile(int userId) {
		userProfileDao.deleteById(userId);
		return true;
	}
	@Override																																										//update profile picture
	public UserProfile saveImage(String emailId, MultipartFile file) throws UserNotFoundException, EmailNotFoundException {
		UserProfile userProfile=findUserProfile(emailId);
		try {
			Path path = Paths.get(StorageLocation + file.getOriginalFilename());
			file.transferTo(path);
			userProfile.setProfileImage("/images/"+ file.getOriginalFilename());
		} catch ( IOException e) {

			e.printStackTrace();
		}
		return userProfileDao.save(userProfile);
	}

	@Override
	public UserProfile findUserDetails(int userId) throws UserNotFoundException {
		return userProfileDao.findById(userId).orElseThrow(()->new UserNotFoundException("User does not exist"));
	}

	@Override
	public UserProfile logIn(String email, String password) throws UserNotFoundException, EmailNotFoundException {
		UserProfile user=userProfileDao.findUserByEmail(email);
		String decodedString = new String(base64.decode(user.getPassword().getBytes()));
		user.setPassword(decodedString); 
		if(user.getPassword().equals(password))
			return user;
		else
			throw new UserNotFoundException("User Not Found ");
	}

	@Override
	public UserProfile findUserProfile(String email) throws EmailNotFoundException {
		UserProfile user = userProfileDao.findUserByEmail(email);
		return user;
	}

	@Override
	public boolean changePassword(String email, String oldpassword, String newpassword)
			throws IncorrectPasswordEnteredException, EmailNotFoundException {
		UserProfile user=userProfileDao.findUserByEmail(email);
		String decodedString = new String(base64.decode(user.getPassword().getBytes()));
		if(decodedString.equals(oldpassword)) {
			user.setPassword(new String(base64.encode(newpassword.getBytes())));
			userProfileDao.save(user);
			return true;
		}
		else
		{
			throw new IncorrectPasswordEnteredException("Incorrect Password");
		}
	}

	@Override
	public boolean forgetPassword(String email, String securityquestion, String securityanswer, String newpassword)
			throws EmailNotFoundException, IncorrectSecurityQuetsionException {
		UserProfile user=userProfileDao.findUserByEmail(email);
		if(user.getSecurityquestion().equals(securityquestion)&&
				user.getSecurityanswer().equals(securityanswer)) {
			user.setPassword(new String(base64.encode(newpassword.getBytes())));
			userProfileDao.save(user);
			return true;
		}
		else if(!user.getSecurityquestion().equals(securityquestion)) {
			throw new IncorrectSecurityQuetsionException("Security Question is not correct");
		}
		else
		{
			throw new EmailNotFoundException("User Doesnot Exists");
		}
	}




}
