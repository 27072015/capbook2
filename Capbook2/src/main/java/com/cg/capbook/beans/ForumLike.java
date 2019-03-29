package com.cg.capbook.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ForumLike {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int forumlikeid;
@ManyToOne
private Forum forum;
public ForumLike() {
}
public ForumLike(int forumlikeid, Forum forum) {
	super();
	this.forumlikeid = forumlikeid;
	this.forum = forum;
}
public int getForumlikeid() {
	return forumlikeid;
}
public void setForumlikeid(int forumlikeid) {
	this.forumlikeid = forumlikeid;
}
public Forum getForum() {
	return forum;
}
public void setForum(Forum forum) {
	this.forum = forum;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((forum == null) ? 0 : forum.hashCode());
	result = prime * result + forumlikeid;
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
	ForumLike other = (ForumLike) obj;
	if (forum == null) {
		if (other.forum != null)
			return false;
	} else if (!forum.equals(other.forum))
		return false;
	if (forumlikeid != other.forumlikeid)
		return false;
	return true;
}
@Override
public String toString() {
	return "ForumLike [forumlikeid=" + forumlikeid + ", forum=" + forum + "]";
}

}
