package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class CustomerController {
	 @Autowired
	    private CustomerService cs;

	    @RequestMapping(path = "feedCustomerData")
	    public ResponseEntity<String> setDataInDB() {
	        try {
	            cs.saveCustomerData();
	            return ResponseEntity.ok("Customer data saved successfully.");
	        } catch (Exception e) {
	            e.printStackTrace();
	            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error occurred while saving customer data.");
	        }
	    }
	       @GetMapping(value="/customers")
		public Iterable<Customer> getAllCustomers() {
	        return cs.getAllCustomers();
	    }
}
