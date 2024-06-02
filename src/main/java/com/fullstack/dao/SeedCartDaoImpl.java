package com.fullstack.dao;

import java.util.List;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fullstack.model.SeedCart;
import com.fullstack.model.SellerProduct;

import jakarta.persistence.EntityManager;

@Repository
public class SeedCartDaoImpl implements SeedCartDao{
	
	@Autowired
	private EntityManager entity;
	

	@Override
	public SeedCart findCartById(Long cartId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateCart(SeedCart cart) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteOrder(Long cartId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SeedCart> listAllCart() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertCart(SeedCart cart) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean validateCart(SeedCart cart) {
		try {
			SellerProduct sellerProduct = cart.getSellerProduct();
			long productId = sellerProduct.getProductId();
			Query<SeedCart> query = (Query<SeedCart>) entity.createQuery("FROM SeedCart as ct  WHERE ct.sellerProduct.productId=:id");
			query.setParameter("id", productId);
			SeedCart cart1 = query.getSingleResult();
			
			return true;
			}catch (Exception e) {
				return false;
			}

}
}
