package com.itheima.po;

public class IdCard {
	private Integer id;
	private String code;
	@Override
	public String toString() {
		return "IdCard [id=" + id + ", code=" + code + "]";
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	
}
