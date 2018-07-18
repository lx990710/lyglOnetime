package com.jk.model;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable {


	private static final long serialVersionUID = 1L;

	private Integer userid;

	private String name;
	
	private Integer sex;
	
	private List<User> minglist;

	public List<User> getMinglist() {
		return minglist;
	}

	public void setMinglist(List<User> minglist) {
		this.minglist = minglist;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}
	
}
