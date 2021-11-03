package com.example.demo.layer3;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.layer2.Employee;

@Repository
public abstract class EmployeeRepositoryImpl extends BaseRepository implements EmployeeRepository {

	
	@Transactional
	public void insertEmployee(Employee eobj) {
		super.persist(eobj); 
		System.out.println("employee inserted...");		
	}

	@Override
	public Employee selectEmployee(int empno) {
		System.out.println("EmployeeRepositoryImpl : selecting Employee by empno");
		Employee emp = super.find(Employee.class, empno);
		
		return emp;
	}

	@Override
	public List<Employee> selectEmployees() {
		
		List<Employee>  empList = new ArrayList<Employee>();

		System.out.println("EmployeeRepositoryImpl : Selecting all Employees...");
		return super.findAll("Employee");
	}

	@Transactional
	public void updateEmployee(Employee eobj) {
				
		System.out.println("EmployeeRepositoryImpl : Updating Employee...");
		super.merge(eobj);
		
	}

//	@Transactional
//	public void deleteEmployee(Employee empno) {
//		
//		System.out.println("EmployeeRepositoryImpl : Deleting Employee");
//		super.remove(Employee.class, empno);
//	}

}
