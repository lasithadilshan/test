package uk.co.surreytech.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ViewService {
	
	@Autowired
	SubService service;
	
	
	public void viewMessage() {
		service.viewMessage();
		service.employeeDetails();
	}
	

	
}
