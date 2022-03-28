package com.flightapp.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightapp.admin.entity.Admin;
import com.flightapp.admin.repository.AdminRepository;



@Service
public class AdminServiceImpl implements IAdminService {
	@Autowired
	AdminRepository Arepo;
	
	@Override
	public void saveAdmin(Admin admin) {
		// TODO Auto-generated method stub
		Arepo.save(admin);
	
		
	}
}
