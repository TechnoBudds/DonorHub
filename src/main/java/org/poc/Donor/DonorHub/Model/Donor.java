package org.poc.Donor.DonorHub.Model;

import java.sql.Timestamp;

public class Donor {
	
	private String donorName;
	private String donorId;
	private String bloodGroup;
	private long contactNumber;
	private String address;
	public long getContactNumber() {
		return contactNumber;
	}


	private Timestamp updt_ts;
	private Timestamp crte_ts;
	private Timestamp lastDonated;
	private String active;
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Timestamp getUpdt_ts() {
		return updt_ts;
	}
	public void setUpdt_ts(Timestamp updt_ts) {
		this.updt_ts = updt_ts;
	}
	public Timestamp getCrte_ts() {
		return crte_ts;
	}
	public void setCrte_ts(Timestamp crte_ts) {
		this.crte_ts = crte_ts;
	}
	public Timestamp getLastDonated() {
		return lastDonated;
	}
	public void setLastDonated(Timestamp lastDonated) {
		this.lastDonated = lastDonated;
	}
	public String getActive() {
		return active;
	}
	public void setActive(String active) {
		this.active = active;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getDonorName() {
		return donorName;
	}
	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}
	public String getDonorId() {
		return donorId;
	}
	public void setDonorId(String donorId) {
		this.donorId = donorId;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	
	
	public Donor()
	{}

}
