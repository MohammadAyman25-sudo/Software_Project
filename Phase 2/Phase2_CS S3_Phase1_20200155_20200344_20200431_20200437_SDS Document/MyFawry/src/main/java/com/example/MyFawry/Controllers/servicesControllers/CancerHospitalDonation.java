package com.example.MyFawry.Controllers.servicesControllers;

import com.example.MyFawry.bsl.Service.CancerHospital;

public class CancerHospitalDonation {
	private CancerHospital hospital = new CancerHospital();
	
	public void Serve() {
		this.hospital.serve();
	}
}
