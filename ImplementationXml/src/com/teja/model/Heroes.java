package com.teja.model;

public class Heroes {
	String namaHero;
	String raceHero;
	int healthHero;
	int manaHero;
	HeroSkill skill;
	
	public Heroes() {
		super();
	}
	
	public Heroes(String namaHero, String raceHero, int healthHero, int manaHero, HeroSkill skill) {
		super();
		this.namaHero = namaHero;
		this.raceHero = raceHero;
		this.healthHero = healthHero;
		this.manaHero = manaHero;
		this.skill = new HeroSkill();
	}

	//inject from config
	public Heroes(HeroSkill skill) {
		super();
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

	public int getHealthHero() {
		return healthHero;
	}

	public void setHealthHero(int healthHero) {
		this.healthHero = healthHero;
	}

	public int getManaHero() {
		return manaHero;
	}

	public void setManaHero(int manaHero) {
		this.manaHero = manaHero;
	}

	public HeroSkill getSkill() {
		return skill;
	}

	public void setSkill(HeroSkill skill) {
		this.skill = skill;
	}

	@Override
	public String toString() {
		return "Heroes [namaHero=" + namaHero + ", raceHero=" + raceHero + ", healthHero=" + healthHero + ", manaHero="
				+ manaHero + ", skill=" + skill + "]";
	}

	
	
	
}
