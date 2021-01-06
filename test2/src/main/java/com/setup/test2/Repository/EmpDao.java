package com.setup.test2.Repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.setup.test2.Model.GradeVO;
import com.setup.test2.Model.TeamVO;



public class EmpDao {
	

	@Autowired
	SqlSession sql;
	
	
	public List<TeamVO> grpGetTeam() {
		return sql.selectList("register.grpGetTeam");
	}
	
	public List<GradeVO> grpGetGrade() {
		return sql.selectList("register.grpGetGrade");
	}

}
