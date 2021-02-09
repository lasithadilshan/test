package uk.co.surreytech.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import uk.co.surreytech.test.service.Employee;
import uk.co.surreytech.test.service.ViewService;

@SpringBootApplication
public class TestSpringBootApplication implements CommandLineRunner{
	
	@Autowired
	Employee employee;
	
	@Autowired
	private ViewService viewService;

	public static void main(String[] args) {
		SpringApplication.run(TestSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		viewService.viewMessage();
		employee.getAge();
		employee.setAge(24);
	}

}
