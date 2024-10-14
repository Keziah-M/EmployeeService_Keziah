package com.tnsif.EmployeeService;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity

public class Employee {
	@Id
	@Column(name="eid")
	private int eid;
	@Column(name="ename")
	
	private String ename;
	@Column(name="mobileno")
	private long mobileno;
	@Column(name="eaddress")
	private String eaddress;
	@Column(name="esalary")
	private double esalary;
	@Column(name="designation")
	private String designation;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public long getMobileno() {
		return mobileno;
	}
	public void setMobileno(long mobileno) {
		this.mobileno = mobileno;
	}
	public String getEaddress() {
		return eaddress;
	}
	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}
	public double getEsalary() {
		return esalary;
	}
	public void setEsalary(double esalary) {
		this.esalary = esalary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Employee(int eid, String ename, int mobileno, String eaddress, double esalary, String designation) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.mobileno = mobileno;
		this.eaddress = eaddress;
		this.esalary = esalary;
		this.designation = designation;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", mobileno=" + mobileno + ", eaddress=" + eaddress
				+ ", esalary=" + esalary + ", designation=" + designation + "]";
	}
	
	
}

	

	
		


