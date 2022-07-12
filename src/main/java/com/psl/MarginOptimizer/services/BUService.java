package com.psl.MarginOptimizer.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.psl.MarginOptimizer.dto.ResponseDTO;
import com.psl.MarginOptimizer.entity.BUClass;
import com.psl.MarginOptimizer.repository.BURepo;
import com.psl.MarginOptimizer.security.JWTClass;

@Service
public class BUService 
{
	// to get all BUs
	
	@Autowired
	public BURepo repoobj;
	
	@Autowired
	public JWTClass jwt;
	
	@Value ("${admin.email.list}")
	private String email_list; 
	
	public ResponseDTO getBUs(String email)
	{
		ResponseDTO response=new ResponseDTO();
		response.setList(repoobj.findAll());
		response.setJwttoken(jwt.generateToken(email));
		response.setStatus("OK");
		return response;	
	}
	
	public boolean isAuthenticated(String email)
	{
		String authlist[]=email_list.split(",");
		
		for(String email_id:authlist)
		{
			if(email_id.equals(email))
			{
				return true;
			}
		}
		
		return false;
	}
}
