package com.model;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name ="mobile")
public class Mobile implements Serializable {

	@Id
	@GenericGenerator(name ="ref",strategy = "increment")
	@GeneratedValue(generator = "ref")
	private int mobileid;
	private String mobilecompany;
	private String mobile_name;
	private double mobileprice;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="app")
	private Collection<App> apto;
	
	
	public Collection<App> getApto() {
		return apto;
	}

	public void setApto(Collection<App> apto) {
		this.apto = apto;
	}

	public Mobile() {
		// TODO Auto-generated constructor stub
	}

	public int getMobileid() {
		return mobileid;
	}

	public void setMobileid(int mobileid) {
		this.mobileid = mobileid;
	}

	public String getMobilecompany() {
		return mobilecompany;
	}

	public void setMobilecompany(String mobilecompany) {
		this.mobilecompany = mobilecompany;
	}

	public String getMobile_name() {
		return mobile_name;
	}

	public void setMobile_name(String mobile_name) {
		this.mobile_name = mobile_name;
	}

	public double getMobileprice() {
		return mobileprice;
	}

	public void setMobileprice(double mobileprice) {
		this.mobileprice = mobileprice;
	}

	
}
