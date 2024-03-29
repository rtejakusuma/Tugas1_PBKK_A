package com.teja.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.teja.model.*;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("HeroesConfig.xml");
		Heroes hero1 = context.getBean("h1", Heroes.class);
		System.out.println(hero1);
		
		Heroes hero2 = context.getBean("h2", Heroes.class);
		System.out.println(hero2);
		
		context.close();
	}

}
