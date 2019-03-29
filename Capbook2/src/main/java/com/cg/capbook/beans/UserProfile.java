package com.cg.capbook.beans;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
@Entity
@Table(name="UserTable")
public class UserProfile {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int userId;
	@NotEmpty
	private String firstName;
	@NotEmpty
	private String lastName;
	private String dOB;
	@NotEmpty
	private String gender;
	@NotEmpty
	@Email
	private String email;
	@NotEmpty
	private String password;
	
	private String profileImage;
	@NotEmpty
    private String securityquestion;
	@NotEmpty
	private String securityanswer;
	@Embedded
	private Address address;
	@OneToMany(mappedBy="user",targetEntity=Images.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@ElementCollection
	private List<Images> images=new ArrayList<Images>();
	private Long mobileNo;
	@OneToMany(mappedBy="user",targetEntity=Status.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@ElementCollection
	private List<Status> status;
	@OneToMany(mappedBy="user",targetEntity=Chat.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@ElementCollection
	private List<Chat> chat;
	@OneToMany(mappedBy="user",targetEntity=FriendList.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@ElementCollection
	private List<FriendList>friendlist;
	@ManyToMany(mappedBy="user",targetEntity=Forum.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@ElementCollection
	private List<Forum>forum;
	public UserProfile() {}
	
	
	public UserProfile(int userId, @NotEmpty String firstName, @NotEmpty String lastName, String dOB,
			@NotEmpty String gender, @NotEmpty @Email String email, @NotEmpty String password,
			@NotEmpty String securityquestion, @NotEmpty String securityanswer, Address address, List<Images> images,
			Long mobileNo, List<Status> status, List<Chat> chat, List<FriendList> friendlist, List<Forum> forum) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dOB = dOB;
		this.gender = gender;
		this.email = email;
		this.password = password;
		this.securityquestion = securityquestion;
		this.securityanswer = securityanswer;
		this.address = address;
		this.images = images;
		this.mobileNo = mobileNo;
		this.status = status;
		this.chat = chat;
		this.friendlist = friendlist;
		this.forum = forum;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((chat == null) ? 0 : chat.hashCode());
		result = prime * result + ((dOB == null) ? 0 : dOB.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((forum == null) ? 0 : forum.hashCode());
		result = prime * result + ((friendlist == null) ? 0 : friendlist.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((images == null) ? 0 : images.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((mobileNo == null) ? 0 : mobileNo.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((securityanswer == null) ? 0 : securityanswer.hashCode());
		result = prime * result + ((securityquestion == null) ? 0 : securityquestion.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + userId;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserProfile other = (UserProfile) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (chat == null) {
			if (other.chat != null)
				return false;
		} else if (!chat.equals(other.chat))
			return false;
		if (dOB == null) {
			if (other.dOB != null)
				return false;
		} else if (!dOB.equals(other.dOB))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (forum == null) {
			if (other.forum != null)
				return false;
		} else if (!forum.equals(other.forum))
			return false;
		if (friendlist == null) {
			if (other.friendlist != null)
				return false;
		} else if (!friendlist.equals(other.friendlist))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (images == null) {
			if (other.images != null)
				return false;
		} else if (!images.equals(other.images))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (mobileNo == null) {
			if (other.mobileNo != null)
				return false;
		} else if (!mobileNo.equals(other.mobileNo))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (securityanswer == null) {
			if (other.securityanswer != null)
				return false;
		} else if (!securityanswer.equals(other.securityanswer))
			return false;
		if (securityquestion == null) {
			if (other.securityquestion != null)
				return false;
		} else if (!securityquestion.equals(other.securityquestion))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (userId != other.userId)
			return false;
		return true;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getdOB() {
		return dOB;
	}
	public void setdOB(String dOB) {
		this.dOB = dOB;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Images> getImages() {
		return images;
	}
	public void setImages(List<Images> images) {
		this.images = images;
	}
	public Long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public List<Status> getStatus() {
		return status;
	}
	public void setStatus(List<Status> status) {
		this.status = status;
	}
	public List<Chat> getChat() {
		return chat;
	}
	public void setChat(List<Chat> chat) {
		this.chat = chat;
	}
	public List<FriendList> getFriendlist() {
		return friendlist;
	}
	public void setFriendlist(List<FriendList> friendlist) {
		this.friendlist = friendlist;
	}
	public List<Forum> getForum() {
		return forum;
	}
	public void setForum(List<Forum> forum) {
		this.forum = forum;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSecurityquestion() {
		return securityquestion;
	}
	public void setSecurityquestion(String securityquestion) {
		this.securityquestion = securityquestion;
	}
	public String getSecurityanswer() {
		return securityanswer;
	}
	public void setSecurityanswer(String securityanswer) {
		this.securityanswer = securityanswer;
	}
	public String getProfileImage() {
		return profileImage;
	}
	public void setProfileImage(String profileImage) {
		this.profileImage = profileImage;
	}


	@Override
	public String toString() {
		return "UserProfile [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", dOB=" + dOB
				+ ", gender=" + gender + ", email=" + email + ", password=" + password + ", securityquestion="
				+ securityquestion + ", securityanswer=" + securityanswer + ", address=" + address + ", images="
				+ images + ", mobileNo=" + mobileNo + ", status=" + status + ", chat=" + chat + ", friendlist="
				+ friendlist + ", forum=" + forum + "]";
	}
	
}
