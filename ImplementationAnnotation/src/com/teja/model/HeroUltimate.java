package com.teja.model;

import org.springframework.stereotype.Component;

@Component
public class HeroUltimate implements UltimateSkill {

	@Override
	public String namaUlti() {
		// TODO Auto-generated method stub
		return "Laguna Blade";
	}

	@Override
	public int dmgUlti() {
		// TODO Auto-generated method stub
		return 900;
	}

	@Override
	public int cdUlti() {
		// TODO Auto-generated method stub
		return 60;
	}

}
