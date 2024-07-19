package com.demo.spring.Module_13_spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Monitor {
	@Value("10")
	private int size;
	@Value("1024")
	private int pixels;

	public Monitor() {
		System.out.println("monitor object created");
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void setPixels(int pixels) {
		this.pixels = pixels;
	}
	
	public void displayMonitor() {
		System.out.println("size= "+size+ " pixels= "+pixels);
	}

}
