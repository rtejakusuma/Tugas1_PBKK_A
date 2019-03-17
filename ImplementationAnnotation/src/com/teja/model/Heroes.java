package com.teja.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("h1")
public class Heroes {
	
	@Autowired
	private UltimateSkill skill;
	private String namaHero;
	private String raceHero;
	
	public Heroes() {
		super();
	}
	
	public Heroes(UltimateSkill skill, String namaHero, String raceHero) {
		super();
		this.skill = skill;
		this.namaHero = namaHero;
		this.raceHero = raceHero;
	}
	
	public Heroes(UltimateSkill skill) {
		super();
		this.skill = skill;
	}

	public UltimateSkill getSkill() {
		return skill;
	}

	public void setSkill(UltimateSkill skill) {
		this.skill = skill;
	}

	public String getNamaHero() {
		return namaHero;
	}

	public void setNamaHero(String namaHero) {
		this.namaHero = namaHero;
	}

	public String getRaceHero() {
		return raceHero;
	}

	public void setRaceHero(String raceHero) {
		this.raceHero = raceHero;
	}

	@Override
	public String toString() {
		return "Heroes [skill=" + skill + ", namaHero=" + namaHero + ", raceHero=" + raceHero + "]";
	}
	
	
	
	
	
	
}
