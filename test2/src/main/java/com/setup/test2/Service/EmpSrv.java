package com.setup.test2.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.setup.test2.Model.GradeVO;
import com.setup.test2.Model.TeamVO;
import com.setup.test2.Repository.EmpDao;



@Service
public class EmpSrv {

	@Autowired
	EmpDao eDao;
	
	
	public List<TeamVO> grpGetTeam() {
		return eDao.grpGetTeam();
	}
	
	public List<GradeVO> grpGetGrade() {
		return eDao.grpGetGrade();
	}
	
	
}
