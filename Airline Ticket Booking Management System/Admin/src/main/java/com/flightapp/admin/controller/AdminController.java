package com.flightapp.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightapp.admin.entity.Admin;
import com.flightapp.admin.service.AdminServiceImpl;
import com.flightapp.admin.service.IAdminService;

@RestController
//@RequestMapping("/api/v1.0/flight/admin")


public class AdminController {
	
	@Autowired 
	private AdminServiceImpl adminService;
	
	@PostMapping("/admin")
	public String getAdmin(@RequestBody Admin admin)
	{
		adminService.saveAdmin(admin);
		return "admin"; 
	}
	

}
