package com.cg.capbook.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Messages {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int messageid;
@ManyToOne
private Chat chat;
private String messagebody;
public Messages() {
}


public Messages(int messageid, Chat chat, String messagebody) {
	super();
	this.messageid = messageid;
	this.chat = chat;
	this.messagebody = messagebody;
}

public int getMessageid() {
	return messageid;
}


public void setMessageid(int messageid) {
	this.messageid = messageid;
}


public Chat getChat() {
	return chat;
}


public void setChat(Chat chat) {
	this.chat = chat;
}


public String getMessagebody() {
	return messagebody;
}


public void setMessagebody(String messagebody) {
	this.messagebody = messagebody;
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((chat == null) ? 0 : chat.hashCode());
	result = prime * result + ((messagebody == null) ? 0 : messagebody.hashCode());
	result = prime * result + messageid;
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
	Messages other = (Messages) obj;
	if (chat == null) {
		if (other.chat != null)
			return false;
	} else if (!chat.equals(other.chat))
		return false;
	if (messagebody == null) {
		if (other.messagebody != null)
			return false;
	} else if (!messagebody.equals(other.messagebody))
		return false;
	if (messageid != other.messageid)
		return false;
	return true;
}
@Override
public String toString() {
	return "Messages [messageid=" + messageid + ", chat=" + chat + ", messagebody=" + messagebody + "]";
}

}
