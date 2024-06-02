package com.fullstack.dao;

import java.util.Optional;

import com.fullstack.model.Farmer;



public interface FarmerDao {
	
	public void addFarmer(Farmer farmer);

	public Optional<Farmer> findbyemail(String email);

	public Farmer farmerLogin(String email, String password);

	
		
	
}
