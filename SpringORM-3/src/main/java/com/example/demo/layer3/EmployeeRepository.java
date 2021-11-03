package com.example.demo.layer3;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.example.demo.layer2.Employee;


@Repository
public interface EmployeeRepository {
	
	void insertEmployee(Employee eobj); //C

	Employee selectEmployee(int empno); //R
	List<Employee> selectEmployees(); //RA

	void updateEmployee(Employee eobj); //U
	void deleteEmployee(Employee emp); //D

}
