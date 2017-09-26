package com.waves.service.serviceImpl;

import com.waves.mapper.TStaffMapper;
import com.waves.model.TStaff;
import com.waves.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServiceImpl implements StaffService {

	@Autowired
	private TStaffMapper tStaffMapper;

	public List<TStaff>selectAllStaff(){
		return tStaffMapper.selectByExample(null);
	}
}
