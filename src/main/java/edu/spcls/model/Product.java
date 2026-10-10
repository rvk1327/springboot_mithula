package edu.spcls.model;

import jakarta.persistence.*;

@Entity
public class Product {

	@Id
	@Column(name="pid", length = 30)
	private String product_id;
	
	@Column(name="pname", length = 100)
	private String product_name;
	
	@Column(name="qty", length = 3)
	private int qty;
	
	@Column(name="price")
	private double price;
	
	
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
