package com.fullstack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fullstack.dao.SeedCartDaoImpl;
import com.fullstack.model.Cart;
import com.fullstack.model.SeedCart;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class SeedCartServiceImpl implements SeedCartService{
	
	@Autowired
	SeedCartDaoImpl dao;

	@Override
	public boolean validateCart(SeedCart details) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateCrops(SeedCart details) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCart(Long cartId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public SeedCart findCartById(Long cartId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SeedCart> findAllCart() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertCart(SeedCart cart) {
		dao.insertCart(cart);
		
	}
	
	

}
