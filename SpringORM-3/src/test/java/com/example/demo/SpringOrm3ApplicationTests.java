package com.example.demo;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.layer2.Department;
import com.example.demo.layer2.Employee;
import com.example.demo.layer3.DepartmentRepositoryImpl;
import com.example.demo.layer3.EmployeeRepositoryImpl;


@SpringBootTest
class SpringOrm3ApplicationTests {
	@Autowired
	DepartmentRepositoryImpl deptRepo;

	@Test
	void insertDeptTest() {
		Department dept=new Department();
		dept.setDepartmentNumber(45);
		dept.setDepartmentName("Rohit");
		dept.setDepartmentLocation("Opener");
		
		deptRepo.insertDepartment(dept);
	}
	
	@Test
	void selectDeptTest() {
		Department dept;
		dept=deptRepo.selectDepartment(45);
		System.out.println("Dept No        :"+dept.getDepartmentNumber());
		System.out.println("Dept Name      :"+dept.getDepartmentName());
		System.out.println("Dept location  :"+dept.getDepartmentLocation());
		
		
	}
	
	@Test
	void selectAllDeptTest() {
		List<Department> deptList;
		deptList=deptRepo.selectDepartments();
		for(Department dept : deptList) {
			System.out.println("Dept No        :"+dept.getDepartmentNumber());
			System.out.println("Dept Name      :"+dept.getDepartmentName());
			System.out.println("Dept location  :"+dept.getDepartmentLocation());
		}
	}
	
	@Test
	void updateDeptTest() {
		Department dept=new Department();
		dept.setDepartmentNumber(11);
		dept.setDepartmentName("Sachin");
		dept.setDepartmentLocation("Batsman");
		
		deptRepo.updateDepartment(dept);
	}
	
	@Test
	void deleteDeptTest() {
	
		deptRepo.deleteDepartment(109);
	}
	
	 /////////////////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////Test cases for Employee////////////////////////////////////////////
   /////////////////////////////////////////////////////////////////////////////////////////////////////
	
	@Autowired
	EmployeeRepositoryImpl empRepo;
	
	@Test
	void insertEmpTest() {
		LocalDate ld=LocalDate.of(1977, 11, 1);
		Employee emp=new Employee();
		
		emp.setEmployeeNumber(7777);
		emp.setEmployeeName("Mathews");
		emp.setEmployeeJob("OfficeBoy");
		emp.setMgr(7654);
		emp.setHireDate(ld);
		emp.setSalary(500);
		emp.setCommission(50);
//		emp.setDeptno(10);
	
		empRepo.insertEmployee(emp);
	}
	
	@Test
	void selectEmpTest() {
		Employee emp;
		emp=empRepo.selectEmployee(7839);
		System.out.println("Employee Number    :"+emp.getEmployeeNumber());
		System.out.println("Employee Name      :"+emp.getEmployeeName());
		System.out.println("Employee job       :"+emp.getEmployeeJob());
		System.out.println("Employee mgr       :"+emp.getMgr());
		System.out.println("Employee hireDate  :"+emp.getHireDate());
		System.out.println("Employee Salary    :"+emp.getSalary());
		System.out.println("Employee comm      :"+emp.getCommission());
	//	System.out.println("Employee dept no   :"+emp.getDeptno());
    }
	
	@Test
	void selectAllEmpTest() {
		List<Employee> empList;
		empList=empRepo.selectEmployees();
		for(Employee emp : empList) {
			System.out.println("Employee Number    :"+emp.getEmployeeNumber());
			System.out.println("Employee Name      :"+emp.getEmployeeName());
			System.out.println("Employee job       :"+emp.getEmployeeJob());
			System.out.println("Employee mgr       :"+emp.getMgr());
			System.out.println("Employee hireDate  :"+emp.getHireDate());
			System.out.println("Employee Salary    :"+emp.getSalary());
			System.out.println("Employee comm      :"+emp.getCommission());
	//		System.out.println("Employee dept no   :"+emp.getDeptno());
		}
	}
	
	@Test
	void updateEmpTest() {
		Employee emp=new Employee();
		emp.setEmployeeNumber(0);
		emp.setEmployeeName(null);
		emp.setEmployeeJob(null);
		emp.setMgr(0);
		emp.setHireDate(null);
		emp.setSalary(0);
		emp.setCommission(0);
//		emp.setDeptno(0);
		
		empRepo.updateEmployee(emp);
	}
	
	@Test
	void deleteEmpTest() {
	
		empRepo.deleteEmployee(null);
	}
	

}
