package org.poc.Donor.DonorHub.Model;

public class BloodBank {

	private String bankId;
	private String bankName;
	private String bankLocation;
	private Long contactNumber;
	public String getBankId() {
		return bankId;
	}
	public void setBankId(String bankId) {
		this.bankId = bankId;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankLocation() {
		return bankLocation;
	}
	public void setBankLocation(String bankLocation) {
		this.bankLocation = bankLocation;
	}
	public Long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public BloodBank(String bankId, String bankName, String bankLocation, Long contactNumber) {
		super();
		this.bankId = bankId;
		this.bankName = bankName;
		this.bankLocation = bankLocation;
		this.contactNumber = contactNumber;
	}
	
	public BloodBank()
	{
		
	}
	
	
}
