package com.setup.test2.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.setup.test2.Model.GradeVO;
import com.setup.test2.Model.TeamVO;
import com.setup.test2.Repository.RegisterDao;

@Service
public class RegisterSrv {

	@Autowired
	RegisterDao registerDao;
	
	public List<TeamVO> grpGetTeam(){
		return registerDao.grpGetTeam();
	}
	
	public List<GradeVO> grpGetGrade(){
		return registerDao.grpGetGrade();
	}
	
	
	
}
