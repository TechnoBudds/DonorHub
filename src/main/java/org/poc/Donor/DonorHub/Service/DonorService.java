package org.poc.Donor.DonorHub.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.poc.Donor.DonorHub.Model.Donor;
import org.poc.Donor.DonorHub.Util.SQLUtil;

public class DonorService {
	
	ArrayList<Donor> donorList = new ArrayList<Donor>();
	

	public Donor getRegistrationDetails(String donorId) {
		System.out.println("dId" + donorId);
		ArrayList<Donor> donorList = new ArrayList<Donor>();
		try {
			donorList = (ArrayList<Donor>) new SQLUtil().getSqlInstance().queryForList("donorIdInXml", donorId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("size-->" + donorList.size());
		for (Donor donor : (ArrayList<Donor>) donorList) {
			return donor;
		}
		return null;

	}

	public ArrayList<Donor> getAllDonors() {
		ArrayList<Donor> donorList = new ArrayList<Donor>();
		try {
			donorList = (ArrayList<Donor>) new SQLUtil().getSqlInstance().queryForList("getAllDonors");
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		System.out.println("donorList size 3-->" + donorList.size());
		return donorList;
	}

	public ArrayList<Donor> insertNewDonor(Donor donor) {
		Map donorMap= new HashMap();
		donorMap.put("DONORNAME", donor.getDonorName());
		donorMap.put("DONORID", donor.getDonorId());
		donorMap.put("BLOODGROUP", donor.getBloodGroup());
		donorMap.put("CONTACTNUMBER", donor.getContactNumber());
		//Boolean insertFlag = false;
		try {
		new SQLUtil().getSqlInstance().insert("insertDonorInfo", donorMap);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("insertFlag-->"+insertFlag);
		//if(insertFlag)
		//{
		return ((ArrayList<Donor>) getAllDonors());
	/*	}
		else
		{
			return null;
		}
*/	}
}
