package com.teja.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.teja.model.Heroes;

public class MyApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create Container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		//Get Beans
		Heroes hero = context.getBean("h1", Heroes.class);
		hero.setNamaHero("Abaddon");
		hero.setRaceHero("Knight");
		
		System.out.println("Nama Hero : " + hero.getNamaHero());
		System.out.println("Race Hero : " + hero.getRaceHero());
		System.out.println("Nama Skill : " + hero.getSkill().namaUlti() + " Damage : " + hero.getSkill().dmgUlti() + " Cooldown : " + hero.getSkill().cdUlti());
		
		context.close();
	}

}
