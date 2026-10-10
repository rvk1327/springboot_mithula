package edu.spcls.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.spcls.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product,String>{	
	
}

// JpaRepository <Model, Model_Primarykey_Datatype>
