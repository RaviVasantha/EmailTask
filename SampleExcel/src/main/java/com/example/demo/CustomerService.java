package com.example.demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
@Autowired
private CustomerRepo crp;

String line="";

public void saveCustomerData() {
	try {
		BufferedReader br=new BufferedReader(new FileReader("src/main/resources/loandata.csv"));
		while((line=br.readLine())!=null) {
			String[] data=line.split(",");
			Customer c=new Customer();
			c.setACNO(Long.parseLong(data[0]));
			c.setREMARK1(data[1]);
			c.setFLAG(data[2]);
			c.setCIFNO(Long.parseLong(data[3]));
			c.setNAME(data[4]);
			c.setLIMITAMT(Integer.parseInt(data[5]));
			c.setOUTAMT(Double.parseDouble(data[6]));
			c.setSANDT(data[7]);
			c.setMOB2(Long.parseLong(data[8]));
			c.setAddress(data[9]);
			crp.save(c);
		}
	}
	catch(IOException ie) {
		ie.printStackTrace();
	}
}
public Iterable<Customer> getAllCustomers() {
    return crp.findAll();
}


}
