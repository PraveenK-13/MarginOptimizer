package com.psl.MarginOptimizer.dto;

import java.util.List;

import com.psl.MarginOptimizer.entity.BUClass;

public class ResponseDTO 
{
	private List<BUClass> list;
	private String jwttoken;
	private String status;
	
	public List<BUClass> getList() {
		return list;
	}
	public void setList(List<BUClass> list) {
		this.list = list;
	}
	public String getJwttoken() {
		return jwttoken;
	}
	public void setJwttoken(String jwttoken) {
		this.jwttoken = jwttoken;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
}
