package com.cg.capbook.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class FriendRequest {
	@Id
	@GeneratedValue
	private int requetsId;
	private String senderEmail,receiverEmail;
	public FriendRequest() {}
	public FriendRequest(int requetsId, String senderEmail, String receiverEmail) {
		super();
		this.requetsId = requetsId;
		this.senderEmail = senderEmail;
		this.receiverEmail = receiverEmail;
	}
	public FriendRequest(String senderEmail, String receiverEmail) {
		super();
		this.senderEmail = senderEmail;
		this.receiverEmail = receiverEmail;
	}
	public int getRequetsId() {
		return requetsId;
	}
	public void setRequetsId(int requetsId) {
		this.requetsId = requetsId;
	}
	public String getSenderEmail() {
		return senderEmail;
	}
	public void setSenderEmail(String senderEmail) {
		this.senderEmail = senderEmail;
	}
	public String getReceiverEmail() {
		return receiverEmail;
	}
	public void setReceiverEmail(String receiverEmail) {
		this.receiverEmail = receiverEmail;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((receiverEmail == null) ? 0 : receiverEmail.hashCode());
		result = prime * result + requetsId;
		result = prime * result + ((senderEmail == null) ? 0 : senderEmail.hashCode());
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
		FriendRequest other = (FriendRequest) obj;
		if (receiverEmail == null) {
			if (other.receiverEmail != null)
				return false;
		} else if (!receiverEmail.equals(other.receiverEmail))
			return false;
		if (requetsId != other.requetsId)
			return false;
		if (senderEmail == null) {
			if (other.senderEmail != null)
				return false;
		} else if (!senderEmail.equals(other.senderEmail))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "FriendRequest [requetsId=" + requetsId + ", senderEmail=" + senderEmail + ", receiverEmail="
				+ receiverEmail + "]";
	}
	

}
