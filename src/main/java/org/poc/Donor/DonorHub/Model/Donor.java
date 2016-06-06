package org.poc.Donor.DonorHub.Model;


public class Donor {
	
	private String donorName;
	private String donorId;
	private String bloodGroup;
	private String contactNumber;
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
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public Donor(String donorName, String donorId, String bloodGroup, String contactNumber) {
		super();
		this.donorName = donorName;
		this.donorId = donorId;
		this.bloodGroup = bloodGroup;
		this.contactNumber = contactNumber;
	}
	public Donor()
	{}

}
