package com.cg.capbook.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.cg.capbook.beans.UserProfile;

@Controller
@SessionAttributes("user")
public class URIController {
 
	private UserProfile user;
	@RequestMapping(value= {"/","index"})
   public String getIndexPage() {
	   return "indexPage";
   }	
		@ModelAttribute("user")
	public UserProfile getUser() {
		user=new UserProfile();
		return user;
	}
		@RequestMapping(value= {"changepassword"})
		public String getChangePassword() {
			return "changePasswordPage";
		}
		@RequestMapping(value= {"forgetpassword"})
		public String forgetPassword() {
			return "forgetPassword";
		}
		@RequestMapping(value="/logout",method=RequestMethod.GET)
		public String logoutUser(SessionStatus logout) {
			logout.setComplete();
			return "indexPage";
		}
		@RequestMapping("/saveImage")
		public String getSaveImage() {
			return "profilePicture";
		}
		}
