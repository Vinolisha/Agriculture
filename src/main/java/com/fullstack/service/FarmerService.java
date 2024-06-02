package com.fullstack.service;

import java.util.Optional;

import com.fullstack.model.Farmer;




public interface FarmerService {
	
	public boolean addFarmer(Farmer farmer);

	public Optional<Farmer> findbyemail(String email);

	public Optional<Farmer> farmerLogin(String email, String password);

	

}
