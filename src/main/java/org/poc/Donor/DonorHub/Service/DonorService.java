package org.poc.Donor.DonorHub.Service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
		
		return (donorList.size()>0)?donorList.get(0):null;

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
		Boolean insertFlag=true;
		Map donorMap= new HashMap();
		donorMap.put("DONORNAME", donor.getDonorName());
		donorMap.put("DONORID", getDonorId()+"");
		donorMap.put("BLOODGROUP", donor.getBloodGroup());
		donorMap.put("CONTACTNUMBER", donor.getContactNumber());
		donorMap.put("ADDRESS", donor.getAddress());
		donorMap.put("ACTIVE", donor.getActive());
				
		try {
		new SQLUtil().getSqlInstance().insert("insertDonorInfo", donorMap);
		}
		catch (SQLException e) {
			insertFlag=false;
			e.printStackTrace();
		}
		catch(Exception ex)
		{
			insertFlag=false;
			ex.printStackTrace();
		}
		
		
		return insertFlag?((ArrayList<Donor>) getAllDonors()):null;	
	}
	
	
	public long getDonorId()
	{
		List<Long> donorIdList= new ArrayList<Long>();
		Long donorID=0L;
		try{
			donorIdList=(ArrayList<Long>)new SQLUtil().getSqlInstance().queryForList("getDONORID");
			for(Long donorId: (ArrayList<Long>)donorIdList)
			{
				donorID=donorId;
			}
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		
		return donorID.longValue();
	}
}
