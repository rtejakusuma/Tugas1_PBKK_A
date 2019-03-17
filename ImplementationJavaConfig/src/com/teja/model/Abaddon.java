package com.teja.model;

public class Abaddon implements Heroes {

	private SkillHero power;
	private int healthPoint;
	private int manaPoint;
	
	
	public Abaddon() {
		super();
	}


	public Abaddon(SkillHero power, int healthPoint, int manaPoint) {
		super();
		this.power = power;
		this.healthPoint = healthPoint;
		this.manaPoint = manaPoint;
	}


	public SkillHero getPower() {
		return power;
	}


	public void setSkill(SkillHero power) {
		this.power = power;
	}


	public int getHealthPoint() {
		return healthPoint;
	}


	public void setHealthPoint(int healthPoint) {
		this.healthPoint = healthPoint;
	}


	public int getManaPoint() {
		return manaPoint;
	}


	public void setManaPoint(int manaPoint) {
		this.manaPoint = manaPoint;
	}


	@Override
	public String namaHero() {
		return "Abaddon";
	}

}
