package com.h2kinfosys.spring;

public class CustomerFactory {
	
	private String type;
	
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	public Customer getCustomer() {
		Customer cust = new Customer();
		cust.setCustId("100");
		cust.setCustName("Neil Armstrong");
		if(type !=null && type.equalsIgnoreCase("Regular")) {
			cust.setCustType("Regular");
		}else {
			cust.setCustType("Loyal");
		}
		return cust;
	}

}
