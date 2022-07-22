package com.springboot.customers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomersController {
	
	@Autowired
	private CustomerService service;
	
	@GetMapping("/Customers")
	public List<CustomerEntity> getCustomers(){
		return service.getAllCustomers();
	}

	@PostMapping("/Customers")
	public CustomerEntity saveCustomers(@RequestBody CustomerEntity Customers) {
		return service.addCustomer(Customers);
	}}

