package com.example.accessingdatamongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccessingDataMongodbApplication implements CommandLineRunner {

	@Autowired
	private CustomerRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(AccessingDataMongodbApplication.class, args);
	}

	@Override
	public void run(String... args) {
		repository.deleteAll();

		//客户存进去
		repository.save(new Customer("Alice", "Smith"));
		repository.save(new Customer("Bob", "Smith"));
		repository.save(new Customer("61937416cd5d1a54901f62e6", "Bob", "Smith"));
		repository.save(new Customer("61937416cd5d1a54901f62e6", "Bobs", "Smith"));

		//获取全部的客户
		System.out.println("Customer found with findAll(): ");
		System.out.println("-------------------------------");
		for (Customer customer : repository.findAll()) {
			System.out.println(customer);
        }

		System.out.println();

		//获取单独一个客户
		System.out.println("Customer found with findByFirstName('Alice'):");
		System.out.println("---------------------------------------------");
		System.out.println(repository.findByFirstName("Alice"));

		System.out.println("Customer found with findByLastName('Smith'):");
		System.out.println("---------------------------------------------");
		for (Customer customer : repository.findByLastName("Smith")) {
			System.out.println(customer);
        }

		System.out.println("删除一个用户根据姓名 deleteCustomerByFirstNameAndLastName():");
		System.out.println("----------------------------------------------------------");
		repository.deleteCustomerByFirstNameAndLastName("Alice", "Smith");
	}

}
