package com.cg.capbook.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Comments {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int commentid;
@ManyToOne
private Status status;
public Comments() {
}

public Comments(int commentid, Status status) {
	super();
	this.commentid = commentid;
	this.status = status;
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + commentid;
	result = prime * result + ((status == null) ? 0 : status.hashCode());
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
	Comments other = (Comments) obj;
	if (commentid != other.commentid)
		return false;
	if (status == null) {
		if (other.status != null)
			return false;
	} else if (!status.equals(other.status))
		return false;
	return true;
}

public int getCommentid() {
	return commentid;
}
public void setCommentid(int commentid) {
	this.commentid = commentid;
}
public Status getStatus() {
	return status;
}
public void setStatus(Status status) {
	this.status = status;
}

@Override
public String toString() {
	return "Comments [commentid=" + commentid + ", status=" + status + "]";
}


}
