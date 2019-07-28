package com.zensar.spring.performers;

/*
 * Author: Sakshi Tiwari
 * Creation Dat: 27th July 2019 12.46PM IST
 * Modified Date: 27th July 2019 12.46PM IST
 * Version: 1.0
 * Copyright:Zensar. All rights reserved.
 * Description: It represents a Juggling performer for Zensar Idol
 * Juggler gets bean bags using constructor injection
 * 
 */

public class Juggler implements Performer {
	
	private int beanBags;
	

	public Juggler() {
		System.out.println("N-arg constructor of Juggler");
	}
	
	public Juggler(int beanBags) {
		super();
		this.beanBags = beanBags;
		System.out.println("Param Contructor of Juggler");
	}
   
	

	




	public void perform() {
		// TODO Auto-generated method stub
    System.out.println("Juggler juggling " + beanBags);
	}

}
