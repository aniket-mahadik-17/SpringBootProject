package com.example.demo.layer2;

import java.time.LocalDate;

import java.time.chrono.ChronoLocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMP")
public class Employee {
	@Id
	@Column(name="EMPNO")
	private int employeeNumber;
	@Column(name="ENAME")
	private String employeeName;
	@Column(name="JOB")
	private String employeeJob;
	@Column(name="MGR")
	private int mgr;
	@Column(name="HIREDATE")
	private LocalDate hireDate;
	@Column(name="SAL")
	private int salary;
	@Column(name="COMM")
	private Integer commission;
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeJob() {
		return employeeJob;
	}
	public void setEmployeeJob(String employeeJob) {
		this.employeeJob = employeeJob;
	}
	public int getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public LocalDate getHireDate() {
		return hireDate;
	}
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Integer getCommission() {
		return commission;
	}
	public void setCommission(Integer commission) {
		this.commission = commission;
	}
	
//	@Column(name="DEPTNO")
//	private int deptno;
//	
	
//	public int getDeptno() {
//		return deptno;
//	}
//	public void setDeptno(int deptno) {
//		this.deptno = deptno;
//	}
	
	
	
}
