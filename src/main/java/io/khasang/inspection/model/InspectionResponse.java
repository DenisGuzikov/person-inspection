package io.khasang.inspection.model;

import java.io.Serializable;

public class InspectionResponse implements Serializable{

	private long userId;
	private int returnCode;
	private String comment;
	
	public long getOrderId() {
		return userId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public void setReturnCode(int returnCode) {
		this.returnCode = returnCode;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
/*	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}*/
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		InspectionResponse other = (InspectionResponse) obj;
		if (userId == 0) {
			if (other.userId != 0)
				return false;
		} else if (userId != other.userId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "InspectionResponse [userId=" + userId + ", returnCode=" + returnCode + ", comment=" + comment + "]";
	}


}
