package com.example.demo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("prod")
public class EmployeeDaoJdbcImpl implements EmployeeDao {

	@Override
	public void addEmployee() {
		System.out.println("Stored using jdbc!!!");
	}

}
