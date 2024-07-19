package com.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name ="app")
public class App implements Serializable {

	@Id
	@GenericGenerator(name ="ref",strategy = "increment")
	@GeneratedValue(generator = "ref")
	private int appid;
	private String appname;
	private double apprating;
	private String appsize;
	
	public App() {
		// TODO Auto-generated constructor stub
	}
	public int getAppid() {
		return appid;
	}
	public void setAppid(int appid) {
		this.appid = appid;
	}
	public String getAppname() {
		return appname;
	}
	public void setAppname(String appname) {
		this.appname = appname;
	}
	public double getApprating() {
		return apprating;
	}
	public void setApprating(double apprating) {
		this.apprating = apprating;
	}
	public String getAppsize() {
		return appsize;
	}
	public void setAppsize(String appsize) {
		this.appsize = appsize;
	}

	
}
