package com.example.demo;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("dev")
public class EmployeeDaoMongoImpl implements EmployeeDao {

	@Override
	public void addEmployee() {
		System.out.println("Mongo store!!!");
	}

}
