package com.builder.grill;

public class GrillBuilder {
	
    private String brand;
	
	private String type;
	
	private Integer price;

	public GrillBuilder setBrand(String brand) {
		this.brand = brand;
		return this;
	}

	public GrillBuilder setType(String type) {
		this.type = type;
		return this;
	}

	public GrillBuilder setPrice(Integer price) {
		this.price = price;
		return this;
	}

	public GrillMachineProp build() {
		return new GrillMachineProp(brand, type, price);
	}
	

}
