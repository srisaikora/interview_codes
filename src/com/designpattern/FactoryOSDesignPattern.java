package com.designpattern;

import com.phone.Android;
import com.phone.Iphone;
import com.phone.OS;
import com.phone.Windows;

public class FactoryOSDesignPattern {

	public OS getInstance(String str) {
		if(str.equalsIgnoreCase("Open"))
			return new Android();
		else if(str.equalsIgnoreCase("Closed"))
			return new Iphone();
		else 
			return new Windows();
	}
}
