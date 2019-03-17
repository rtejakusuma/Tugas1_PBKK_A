package com.teja.model;

public class DescriptionSkill {
	String descSkill;
	String typeSkill;
	String effectSkill;
	
	public DescriptionSkill(String descSkill, String typeSkill, String effectSkill) {
		super();
		this.descSkill = descSkill;
		this.typeSkill = typeSkill;
		this.effectSkill = effectSkill;
	}
	
	public DescriptionSkill() {
		super();
	}
	
	public String getDescSkill() {
		return descSkill;
	}
	
	public void setDescSkill(String descSkill) {
		this.descSkill = descSkill;
	}
	
	public String getTypeSkill() {
		return typeSkill;
	}
	
	public void setTypeSkill(String typeSkill) {
		this.typeSkill = typeSkill;
	}
	
	public String getEffectSkill() {
		return effectSkill;
	}
	
	public void setEffectSkill(String effectSkill) {
		this.effectSkill = effectSkill;
	}

	@Override
	public String toString() {
		return "DescriptionSkill [descSkill=" + descSkill + ", typeSkill=" + typeSkill + ", effectSkill=" + effectSkill
				+ "]";
	}
	
	
}
