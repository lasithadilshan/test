package uk.co.surreytech.test.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubService {
	
	@Autowired
	SubService service;
	
	@Autowired
	Employee employee;
	
	public void viewMessage() {
		System.out.println("Hello World!");
	}
	
	public void employeeDetails(){
		
		employee.setNIC("960654188V");
		System.out.println(" NIC        :- "+employee.getNIC());
		
		employee.setName(" Name       :- "+"Lasitha Dilshan Thilakarathna");
		System.out.println(employee.getName());
		
		employee.setAge(24);
		System.out.println(" Age        :- "+employee.getAge());
		
		employee.setEmail("dilshantilakaratne29@gmail.com");
		System.out.println(" Email      :- "+employee.getEmail());
		
		employee.setContact_number(773130036);
		System.out.println(" Contact No :- "+employee.getContact_number());
		
		employee.setSalary(100000);
		System.out.println(" Salary     :- Rs."+employee.getSalary());
	}
	
}
