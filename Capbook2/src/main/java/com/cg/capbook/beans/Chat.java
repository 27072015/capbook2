package com.cg.capbook.beans;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Chat {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int chatid;
private int chatrecieverid;
@OneToMany
private List<Messages>messages;
@ManyToOne
private UserProfile user;
public Chat() {
}
public int getChatid() {
	return chatid;
}
public void setChatid(int chatid) {
	this.chatid = chatid;
}
public int getChatrecieverid() {
	return chatrecieverid;
}
public void setChatrecieverid(int chatrecieverid) {
	this.chatrecieverid = chatrecieverid;
}
public UserProfile getUser() {
	return user;
}
public void setUser(UserProfile user) {
	this.user = user;
}
public Chat(int chatid, int chatrecieverid, UserProfile user) {
	super();
	this.chatid = chatid;
	this.chatrecieverid = chatrecieverid;
	this.user = user;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + chatid;
	result = prime * result + chatrecieverid;
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
	Chat other = (Chat) obj;
	if (chatid != other.chatid)
		return false;
	if (chatrecieverid != other.chatrecieverid)
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
	return "Chat [chatid=" + chatid + ", chatrecieverid=" + chatrecieverid + ", user=" + user + "]";
}

}
