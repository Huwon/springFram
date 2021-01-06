package com.setup.test2.Repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.setup.test2.Model.EmpVO;
import com.setup.test2.Model.GradeVO;
import com.setup.test2.Model.TeamVO;



@Repository
public class RegisterDao {

	@Autowired
	SqlSession sqlSession;
	
	public List<TeamVO> grpGetTeam(){
		return sqlSession.selectList("register.grpGetTeam");
	}
	
	public List<GradeVO> grpGetGrade(){
		return sqlSession.selectList("register.grpGetGrade");
	}
	
	public void setEmpRegister(EmpVO evo) {
		sqlSession.insert("register.setEmpRegister", evo);
	}
	
	
	
}
