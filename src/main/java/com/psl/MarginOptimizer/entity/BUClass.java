package com.psl.MarginOptimizer.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name="tab_bu")
public class BUClass 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bu_id;
	private String bu_code; 
	private String bu_name;
	public int getBu_id() {
		return bu_id;
	}
	public void setBu_id(int bu_id) {
		this.bu_id = bu_id;
	}
	public String getBu_code() {
		return bu_code;
	}
	public void setBu_code(String bu_code) {
		this.bu_code = bu_code;
	}
	public String getBu_name() {
		return bu_name;
	}
	public void setBu_name(String bu_name) {
		this.bu_name = bu_name;
	}
	
	
}
