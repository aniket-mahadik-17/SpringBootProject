package com.example.demo.layer5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.layer2.Department;
import com.example.demo.layer3.DepartmentRepositoryImpl;

@RestController
@RequestMapping("/dept")
public class DeptController {
	@Autowired DepartmentRepositoryImpl deptRepo;
	
	@GetMapping("/get/{DNO}")
	public Department getDept (@PathVariable ("DNO") int x) {
		Department dept;
		
		dept=deptRepo.selectDepartment(x);
		return dept;
	}
	
	@GetMapping("/getAll")
	public List <Department> getDepts(){
		List <Department> deptList;
		deptList=deptRepo.selectDepartments();
		return deptList;
	}
	@PostMapping("/add")
	public void addDept(@RequestBody Department deptObj) {
		
		deptRepo.insertDepartment(deptObj);
	}
	
	@PutMapping("/update")
	public void updateDept(@RequestBody Department deptObj) {
		
		deptRepo.updateDepartment(deptObj);
	}
	@DeleteMapping("/delete/{DNO}")
	public void deleteDept(@RequestBody  int deptObj) {
		
		deptRepo.deleteDepartment(deptObj);
	}
	
	

}
