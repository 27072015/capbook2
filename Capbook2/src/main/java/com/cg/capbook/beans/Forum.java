package com.cg.capbook.beans;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Forum {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int forumid;
private String forumcontent;
@OneToMany(mappedBy="forum",targetEntity=ForumLike.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
@ElementCollection
private List<ForumLike>forumlike;
@OneToMany(mappedBy="forum",targetEntity=ForumComment.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
@ElementCollection
private List<ForumComment>forumcomment;
@ManyToMany
@ElementCollection
private List<UserProfile> user;
public Forum(int forumid, String forumcontent, List<UserProfile> user) {
	super();
	this.forumid = forumid;
	this.forumcontent = forumcontent;
	this.user = user;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((forumcontent == null) ? 0 : forumcontent.hashCode());
	result = prime * result + forumid;
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
	Forum other = (Forum) obj;
	if (forumcontent == null) {
		if (other.forumcontent != null)
			return false;
	} else if (!forumcontent.equals(other.forumcontent))
		return false;
	if (forumid != other.forumid)
		return false;
	if (user == null) {
		if (other.user != null)
			return false;
	} else if (!user.equals(other.user))
		return false;
	return true;
}
public int getForumid() {
	return forumid;
}
public void setForumid(int forumid) {
	this.forumid = forumid;
}
public String getForumcontent() {
	return forumcontent;
}
public void setForumcontent(String forumcontent) {
	this.forumcontent = forumcontent;
}
public List<UserProfile> getUser() {
	return user;
}
public void setUser(List<UserProfile> user) {
	this.user = user;
}
@Override
public String toString() {
	return "Forum [forumid=" + forumid + ", forumcontent=" + forumcontent + ", user=" + user + "]";
}

}