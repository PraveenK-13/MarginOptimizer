package com.psl.MarginOptimizer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.psl.MarginOptimizer.dto.ResponseDTO;
import com.psl.MarginOptimizer.entity.BUClass;
import com.psl.MarginOptimizer.services.BUService;

@RestController
public class BUController 
{
	@Autowired
	private BUService bu_service;
	
	@GetMapping(value="/getBUS")
	public ResponseDTO getBUs(@RequestHeader("email_id") String email)
	{
		if(bu_service.isAuthenticated(email))
		{
			return bu_service.getBUs(email);
		}
		else
		{
			ResponseDTO response=new ResponseDTO();
			response.setStatus("Invalid user!");
			return response;
		}
	}
}
