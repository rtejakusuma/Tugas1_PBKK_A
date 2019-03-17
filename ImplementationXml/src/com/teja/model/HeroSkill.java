package com.teja.model;

public class HeroSkill {
	String namaSkill;
	DescriptionSkill descSkill;
	int cdSkill;
	int dmgSkill;
	int duraSkill;
	
	public HeroSkill(String namaSkill, DescriptionSkill descSkill, int cdSkill, int dmgSkill, int duraSkill) {
		super();
		this.namaSkill = namaSkill;
		this.descSkill = new DescriptionSkill();
		this.cdSkill = cdSkill;
		this.dmgSkill = dmgSkill;
		this.duraSkill = duraSkill;
	}
	
	//inject the config
	public HeroSkill(DescriptionSkill descSkill) {
		super();
		this.descSkill = descSkill;
	}

	
	public HeroSkill() {
		super();
	}
	public String getNamaSkill() {
		return namaSkill;
	}
	public void setNamaSkill(String namaSkill) {
		this.namaSkill = namaSkill;
	}
	
	public DescriptionSkill getDescSkill() {
		return descSkill;
	}
	public void setDescSkill(DescriptionSkill descSkill) {
		this.descSkill = descSkill;
	}
	public int getCdSkill() {
		return cdSkill;
	}
	public void setCdSkill(int cdSkill) {
		this.cdSkill = cdSkill;
	}
	public int getDmgSkill() {
		return dmgSkill;
	}
	public void setDmgSkill(int dmgSkill) {
		this.dmgSkill = dmgSkill;
	}
	public int getDuraSkill() {
		return duraSkill;
	}
	public void setDuraSkill(int duraSkill) {
		this.duraSkill = duraSkill;
	}
	
	@Override
	public String toString() {
		return "HeroSkill [namaSkill=" + namaSkill + ", descSkill=" + descSkill + ", cdSkill=" + cdSkill + ", dmgSkill="
				+ dmgSkill + ", duraSkill=" + duraSkill + "]";
	}
	
	
	
}
