package com.setup.test2.Model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EmpVO {

	private int emp_id;
	private String empTeamCode; //저장
	private String empTeamName; //볼때
	
	private String empGradeCode;
	private String empGradeName;
	
	private String emp_num;
	private String emp_name;
	private String emp_pwd;
	private Date emp_date;
	private int emp_auth;
	private String emp_confirm;
	
	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmpTeamCode() {
		return empTeamCode;
	}

	public void setEmpTeamCode(String empTeamCode) {
		this.empTeamCode = empTeamCode;
	}

	public String getEmpTeamName() {
		return empTeamName;
	}

	public void setEmpTeamName(String empTeamName) {
		this.empTeamName = empTeamName;
	}

	public String getEmpGradeCode() {
		return empGradeCode;
	}

	public void setEmpGradeCode(String empGradeCode) {
		this.empGradeCode = empGradeCode;
	}

	public String getEmpGradeName() {
		return empGradeName;
	}

	public void setEmpGradeName(String empGradeName) {
		this.empGradeName = empGradeName;
	}

	public String getEmp_num() {
		return emp_num;
	}

	public void setEmp_num(String emp_num) {
		this.emp_num = emp_num;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getEmp_pwd() {
		return emp_pwd;
	}

	public void setEmp_pwd(String emp_pwd) {
		this.emp_pwd = emp_pwd;
	}

	public Date getEmp_date() {
		return emp_date;
	}

	public void setEmp_date(Date emp_date) {
		this.emp_date = emp_date;
	}

	public int getEmp_auth() {
		return emp_auth;
	}

	public void setEmp_auth(int emp_auth) {
		this.emp_auth = emp_auth;
	}

	public String getEmp_confirm() {
		return emp_confirm;
	}

	public void setEmp_confirm(String emp_confirm) {
		this.emp_confirm = emp_confirm;
	}

	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

	
	
}
