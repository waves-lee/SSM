package com.waves.controller;

import com.waves.model.TStaff;
import com.waves.service.StaffService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/")
public class StaffController {
	private Logger logger = Logger.getLogger(StaffController.class);

	@Autowired
	private StaffService staffService;

	@RequestMapping("/listall")
	public String getStaffList(){
		ModelAndView mav = new ModelAndView();
		List<TStaff>allStaffs = staffService.selectAllStaff();
		for(TStaff s:allStaffs){
			System.out.println(s.getName());
		}
		return "page";
	}

}
