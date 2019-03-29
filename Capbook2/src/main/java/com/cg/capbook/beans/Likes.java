package com.cg.capbook.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Likes {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int likeid;
@ManyToOne
private Status status;
public Likes() {
}
public Likes(int likeid, Status status) {
	super();
	this.likeid = likeid;
	this.status = status;
}
public int getLikeid() {
	return likeid;
}
public void setLikeid(int likeid) {
	this.likeid = likeid;
}
public Status getStatus() {
	return status;
}
public void setStatus(Status status) {
	this.status = status;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + likeid;
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
	Likes other = (Likes) obj;
	if (likeid != other.likeid)
		return false;
	if (status == null) {
		if (other.status != null)
			return false;
	} else if (!status.equals(other.status))
		return false;
	return true;
}
@Override
public String toString() {
	return "Likes [likeid=" + likeid + ", status=" + status + "]";
}

}
