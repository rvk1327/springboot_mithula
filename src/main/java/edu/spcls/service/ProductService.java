package edu.spcls.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.spcls.model.Product;
import edu.spcls.repository.ProductRepo;

@Service
public class ProductService {

	@Autowired
	ProductRepo repo;
	
	
	public Product storeProduct(Product p) {		
		return repo.save(p);
	}
	
	public List<Product> getProducts() {
		return repo.findAll();
	}
	
	public Product updateProduct(Product p) {
		
		Product p1 = repo.findById(p.getProduct_id()).get();
		p1.setProduct_name(p.getProduct_name());
		p1.setQty(p.getQty());
		p1.setPrice(p.getPrice());
		return repo.save(p1);
	}
}
