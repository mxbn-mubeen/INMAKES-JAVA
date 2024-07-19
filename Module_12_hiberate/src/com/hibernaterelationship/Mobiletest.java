package com.hibernaterelationship;

import java.util.ArrayList;
import java.util.Collection;

import com.model.App;
import com.model.Mobile;

public class Mobiletest {

	public static void main(String[] args) {
		
		Mobile m=new Mobile();
		m.setMobile_name("samsung galaxy s22");
		m.setMobilecompany("samsung");
		m.setMobileprice(25000.78);
		
		App app1=new App();
		app1.setAppname("inames");
		app1.setAppsize("1GB");
		app1.setApprating(4.4);
		
		App app2=new App();
		app2.setAppname("GMail");
		app2.setAppsize("256");
		app2.setApprating(4.9);
		
		Collection<App> c11=new ArrayList<App>();
		c11.add(app1);
		c11.add(app2);
		
		m.setApto(c11);
		MobileDAO mobiledao=new MobileDAO();
		mobiledao.save(m);

	}

}
