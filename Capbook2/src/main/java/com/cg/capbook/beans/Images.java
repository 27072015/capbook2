package com.cg.capbook.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotEmpty;
@Entity
public class Images {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int imageId;
	@NotEmpty
	private String imageName;
	@ManyToOne
	private UserProfile user;
	public Images() {
	}
	public Images(int imageId, String imageName) {
		super();
		this.imageId = imageId;
		this.imageName = imageName;
	}
	public int getImageId() {
		return imageId;
	}
	public void setImageId(int imageId) {
		this.imageId = imageId;
	}
	public String getImageName() {
		return imageName;
	}
	public void setImageName(String imageName) {
		this.imageName = imageName;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + imageId;
		result = prime * result + ((imageName == null) ? 0 : imageName.hashCode());
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
		Images other = (Images) obj;
		if (imageId != other.imageId)
			return false;
		if (imageName == null) {
			if (other.imageName != null)
				return false;
		} else if (!imageName.equals(other.imageName))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Images [imageId=" + imageId + ", imageName=" + imageName + "]";
	}



}
