package com.pack.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="student10009")
public class Student {
	@Id
	private int sid;
	
	@NotEmpty
	@Size(min=6,max=25)
	private String sname;
	
	@NotNull
    @Min(value=6)
    @Max(value=36)
	private int sage;
	
	@NotEmpty
	private String sgender;
	
	@NotNull
    @DateTimeFormat(pattern="yyyy-MM-dd")
	private Date sdob;
	
	@NotEmpty
	private String saddress;
	
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	public String getSgender() {
		return sgender;
	}
	public void setSgender(String sgender) {
		this.sgender = sgender;
	}
	public Date getSdob() {
		return sdob;
	}
	public void setSdob(Date sdob) {
		this.sdob = sdob;
	}
	public String getSaddress() {
		return saddress;
	}
	public void setSaddress(String saddress) {
		this.saddress = saddress;
	}
	public Student(int sid, String sname, int sage, String sgender, Date sdob, String saddress) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
		this.sgender = sgender;
		this.sdob = sdob;
		this.saddress = saddress;
	}
	public Student() {
		super();
	}
	
}
