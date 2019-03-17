package com.teja.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.teja.model.*;


@Configuration
@PropertySource("classpath:heroes.properties")
public class Config {
	
	@Bean
	public SkillHero BurrowedTime() {
		return new BurrowedTime();
	}
	
		
	@Bean
	public Heroes Abaddon(SkillHero power, @Value("${h1.healthHero}")int healthHero, 
			@Value("${h1.manaHero}")int manaHero) {
		Abaddon abaddon1 = new Abaddon(BurrowedTime(), healthHero, manaHero);
		return abaddon1;
	}

	
	
}
