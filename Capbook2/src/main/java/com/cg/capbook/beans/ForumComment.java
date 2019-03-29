package com.cg.capbook.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ForumComment {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int forumcommentid;
@ManyToOne
private Forum forum;
public ForumComment() {
	}
public ForumComment(int forumcommentid, Forum forum) {
	super();
	this.forumcommentid = forumcommentid;
	this.forum = forum;
}
public int getForumcommentid() {
	return forumcommentid;
}
public void setForumcommentid(int forumcommentid) {
	this.forumcommentid = forumcommentid;
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
	result = prime * result + forumcommentid;
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
	ForumComment other = (ForumComment) obj;
	if (forum == null) {
		if (other.forum != null)
			return false;
	} else if (!forum.equals(other.forum))
		return false;
	if (forumcommentid != other.forumcommentid)
		return false;
	return true;
}
@Override
public String toString() {
	return "ForumComment [forumcommentid=" + forumcommentid + ", forum=" + forum + "]";
}

}
