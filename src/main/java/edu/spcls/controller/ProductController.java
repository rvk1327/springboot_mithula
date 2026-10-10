package edu.spcls.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.spcls.model.Product;
import edu.spcls.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService service;
	
	@PostMapping("/api/v1/product")
	public Product addProduct(@RequestBody Product p1) {		
		return service.storeProduct(p1);
	}
	
	@GetMapping("/api/v1/product")
	public List<Product> getAllProducts() {
		return service.getProducts();
	}
	
	@PutMapping("/api/v1/product")
	public Product modifyProduct(@RequestBody Product p) {
		return service.updateProduct(p);
	}
	
	
	@GetMapping("/employee")
	public String employeeInfo(@RequestParam("empid") String eid, @RequestParam("emp_name") String ename, @RequestParam(required=false) Double salary) {
		return "Info :  " + eid + " , " + ename + " ,  " + salary;
	}
	
	
	
	
	
	
}
