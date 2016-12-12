package com.csdcc.model;

import java.sql.Timestamp;

public class Department {
	public Department(){
		
	}
	
	public Department(String name, int id, int superior, Timestamp createtime, int status) {
		super();
		this.name = name;
		this.id = id;
		this.superior = superior;
		this.createtime = createtime;
		this.status = status;
	}

	public Department(Department department){
		this.name = department.name;
		this.id = department.id;
		this.superior = department.superior;
		this.createtime = department.createtime;
		this.status = department.status;
	}

	public int getSuperior() {
		return superior;
	}

	public void setSuperior(int superior) {
		this.superior = superior;
	}

	public Timestamp getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}


	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	private String name;//组织架构名称
	private int id;//组织架构编号
	private int superior;//上级组织架构编号
	private Timestamp createtime;//创建时间
	private int status;//使用标志
	
}
