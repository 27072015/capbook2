package com.cg.capbook.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
@Entity
public class Status {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int statusId;
	@NotEmpty
	private String statusDescription;
	@ManyToOne
	private UserProfile user;
	@OneToMany(mappedBy="status",targetEntity=Likes.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY) 
	private List<Likes> likes;	
	@OneToMany(mappedBy="status",targetEntity=Comments.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Comments>comments;
	public Status() {
	}
	public Status(int statusId, @NotEmpty String statusDescription, UserProfile user, List<Likes> likes,
			List<Comments> comments) {
		super();
		this.statusId = statusId;
		this.statusDescription = statusDescription;
		this.user = user;
		this.likes = likes;
		this.comments = comments;
	}
	public Status(int statusId, String statusDescription) {
		super();
		this.statusId = statusId;
		this.statusDescription = statusDescription;
	}
	
	public int getStatusId() {
		return statusId;
	}
	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}
	public String getStatusDescription() {
		return statusDescription;
	}
	public void setStatusDescription(String statusDescription) {
		this.statusDescription = statusDescription;
	}
	public UserProfile getUser() {
		return user;
	}
	public void setUser(UserProfile user) {
		this.user = user;
	}
	public List<Likes> getLikes() {
		return likes;
	}
	public void setLikes(List<Likes> likes) {
		this.likes = likes;
	}
	public List<Comments> getComments() {
		return comments;
	}
	public void setComments(List<Comments> comments) {
		this.comments = comments;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comments == null) ? 0 : comments.hashCode());
		result = prime * result + ((likes == null) ? 0 : likes.hashCode());
		result = prime * result + ((statusDescription == null) ? 0 : statusDescription.hashCode());
		result = prime * result + statusId;
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		Status other = (Status) obj;
		if (comments == null) {
			if (other.comments != null)
				return false;
		} else if (!comments.equals(other.comments))
			return false;
		if (likes == null) {
			if (other.likes != null)
				return false;
		} else if (!likes.equals(other.likes))
			return false;
		if (statusDescription == null) {
			if (other.statusDescription != null)
				return false;
		} else if (!statusDescription.equals(other.statusDescription))
			return false;
		if (statusId != other.statusId)
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Status [statusId=" + statusId + ", statusDescription=" + statusDescription + ", user=" + user
				+ ", likes=" + likes + ", comments=" + comments + "]";
	}
	
	

}
