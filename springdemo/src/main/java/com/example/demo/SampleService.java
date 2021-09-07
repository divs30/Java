package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleService {
	@Autowired
	private EmployeeDao empDao;
	
	public void insert() {
		empDao.addEmployee();
	}
}
