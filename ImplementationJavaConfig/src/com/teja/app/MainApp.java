package com.teja.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.teja.model.Abaddon;
import com.teja.model.Heroes;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create Container
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("Config.class");
		
		//Get Bean
		Heroes hero1 = context.getBean("Abaddon", Heroes.class);
		Abaddon aba = (Abaddon)hero1;
		
		//Use bean
		System.out.println("Hero : " + aba.namaHero() + " Skill : " + aba.getPower().getSkill());
		
		
		context.close();
	
	}

}
