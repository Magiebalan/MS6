package com.springboot.customers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository repository;

	public CustomerEntity addCustomer(CustomerEntity Customers) {
		return repository.save(Customers);}
	
	public List<CustomerEntity> getAllCustomers(){
		return repository.findAll();}
	}
