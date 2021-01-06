package com.setup.test2.Ctr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.setup.test2.Model.GradeVO;
import com.setup.test2.Model.TeamVO;
import com.setup.test2.Service.RegisterSrv;

@Controller
public class RegisterCtr {
	
	@Autowired
	RegisterSrv registerSrv;
	
	
	
	@RequestMapping(value="grp_get_team", method = RequestMethod.POST)
	@ResponseBody
	public List<TeamVO> grpGetTeam(){
		registerSrv.grpGetTeam();
		List<TeamVO> list = registerSrv.grpGetTeam();
		return list;
	}
	
	
	
	
	@RequestMapping(value = "/grp_get_grade", method = RequestMethod.POST)
	@ResponseBody
	public List<GradeVO> grpGetGrade() {
		registerSrv.grpGetGrade();
		List<GradeVO> list = registerSrv.grpGetGrade();
		return list;
	}

}
