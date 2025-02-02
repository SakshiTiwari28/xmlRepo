package com.zensar.spring.performers;

import com.zensar.spring.poems.Poem;

/*
 * Author: Sakshi Tiwari
 * Creation Date: 27th July 2019 12.46PM IST
 * Modified Date: 27th July 2019 12.46PM IST
 * Version: 1.0
 * Copyright:Zensar. All rights reserved.
 * Description: It represents a Poetic Juggling performer for Zensar Idol
 * Juggler gets bean bags using constructor injection
 * 
 */

public class PoeticJuggler extends Juggler {
	//Dependency object reference
	private Poem poem;
	
	public PoeticJuggler(){
		System.out.println("No-Arg Constructor of PoeticJuggler");
	}

	public PoeticJuggler(int beanBags, Poem poem) {
		super(beanBags);
		this.poem = poem;
		System.out.println("Param Constructor of Poetic Juggler");
	}

	@Override
	public void perform() {
		// TODO Auto-generated method stub
		super.perform();
		System.out.println("Jugggling while reciting Poem...");
		poem.recite();
	}
	
	
	

}
