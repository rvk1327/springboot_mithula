package edu.spcls.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import edu.spcls.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,String>{	
	
	public List<Product> findByPrice(double price);
	
	@Query("select p from Product p where p.price < :p")
	public List<Product> getProducts(@Param("p") Double price);
}

// JpaRepository <Model, Model_Primarykey_Datatype>
