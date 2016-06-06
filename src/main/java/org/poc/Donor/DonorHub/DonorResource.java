package org.poc.Donor.DonorHub;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.poc.Donor.DonorHub.Model.Donor;
import org.poc.Donor.DonorHub.Service.DonorService;

@Path("/donor")
public class DonorResource {

	@GET
	@Path("{donorId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Donor getRegistrationDetails(@PathParam("donorId") String donorId) {
		Donor donor = new DonorService().getRegistrationDetails(donorId);
		System.out.println("test -->" + donor.getDonorName());

		return donor;

	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Donor> getAllDonors() {
		return new DonorService().getAllDonors();
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Donor> addDonor(Donor donor) {
		return new DonorService().insertNewDonor(donor);
	}

}
