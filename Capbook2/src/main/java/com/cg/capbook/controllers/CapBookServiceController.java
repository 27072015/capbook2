package com.cg.capbook.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.cg.capbook.beans.UserProfile;
import com.cg.capbook.daoservices.UserProfileDAO;
import com.cg.capbook.exceptions.EmailAlreadyExistException;
import com.cg.capbook.exceptions.EmailNotFoundException;
import com.cg.capbook.exceptions.IncorrectPasswordEnteredException;
import com.cg.capbook.exceptions.IncorrectSecurityQuetsionException;
import com.cg.capbook.exceptions.UserAlreadyExistException;
import com.cg.capbook.exceptions.UserNotFoundException;
import com.cg.capbook.services.IUserServices;
@Controller
public class CapBookServiceController {
	@Autowired
    IUserServices userServices;
	@RequestMapping("/registration")
	public ModelAndView registerUser(@Valid@ModelAttribute("user") UserProfile user) throws UserAlreadyExistException, UserNotFoundException, EmailNotFoundException, EmailAlreadyExistException {
		user=userServices.acceptUserDetails(user);
		return new ModelAndView("homePage","user",user);
	}
	@RequestMapping("/loginuser")
	 public ModelAndView logIn(@RequestParam String email,@RequestParam String password) throws UserNotFoundException, EmailNotFoundException {
		UserProfile user= userServices.logIn(email, password); 		 
		 return new ModelAndView("homePage","user",user);
		 }
	@RequestMapping("/changepass")
	public ModelAndView changePassword(@RequestParam String email, @RequestParam String oldpassword, @RequestParam String newpassword ) throws IncorrectPasswordEnteredException, EmailNotFoundException {
		boolean changepassword=userServices.changePassword(email, oldpassword, newpassword);
		return new ModelAndView("changePasswordPage","changepassword",changepassword);
	}
	@RequestMapping("/forgetpass")
	public ModelAndView forgetPassword(@RequestParam String email,@RequestParam String securityquestion,@RequestParam String securityanswer,@RequestParam String newpassword) throws EmailNotFoundException, IncorrectSecurityQuetsionException {
		boolean forgetpassword=userServices.forgetPassword(email, securityquestion, securityanswer, newpassword);
		return new ModelAndView("successPageForgetpass","forgetpassword",forgetpassword);
		}
	@RequestMapping("/saveImageForm")   
	public ModelAndView editPic(@RequestParam("file") MultipartFile file,@RequestParam String emailId) throws UserNotFoundException, EmailNotFoundException {
		UserProfile saveimage=userServices.saveImage(emailId,file);
		return new ModelAndView("profilePicture", "userProfile", saveimage);
	}		
}
