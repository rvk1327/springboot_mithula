package edu.spcls.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	public String employeeInfo(@RequestParam("empid") String eid, 
											  @RequestParam("emp_name") String ename, 
											  @RequestParam(name = "salary", required=false , defaultValue = "0.0")  Double emp_salary) 
	{
		
		
		return "Info :  " + eid + " , " + ename + " ,  " + emp_salary;
	}
	
	
	@GetMapping("/api/v1/productid")
	public Product getProductById(@RequestParam String pid) {
		return service.getById(pid);
	}
	
	
	//Path variables
	@GetMapping("/student/{rno}/{stname}/{rank}")
	public String getStudentInfo(
				@PathVariable String rno,
				@PathVariable String stname,
				@PathVariable int rank
			) {
		
		return "Info : " + rno + " ,  " + stname + " , " + rank;
	}
	
	@GetMapping("/product")
	public List<Product> getProductsByPrice(@RequestParam Double price) {
		return service.getProductByPrice(price);
	}
	

	@GetMapping("/productprice")
	public List<Product> getLessPrices(@RequestParam Double price) {
		return service.getLessPriceProducts(price);
	}
}
