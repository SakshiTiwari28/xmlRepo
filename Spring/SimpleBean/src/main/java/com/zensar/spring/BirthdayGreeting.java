package com.zensar.spring;

/*
 * Author: Sakshi Tiwari
 * Creation Dat: 27th July 2019 12.46PM IST
 * Modified Date: 27th July 2019 12.46PM IST
 * Version: 1.0
 * Copyright:Zensar. All rights reserved.
 * Description: It is specialized greeting use to greet anyone
 * 
 */

public class BirthdayGreeting implements Greeting {

	
	public BirthdayGreeting(){
		System.out.println("Birthday Greeting created");
	}
	public String sayGreet() {
		// TODO Auto-generated method stub
		return "Wish You a very Happy Birthday";
	}

}
