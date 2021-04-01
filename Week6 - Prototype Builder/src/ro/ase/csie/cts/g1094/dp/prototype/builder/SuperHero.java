package ro.ase.csie.cts.g1094.dp.prototype.builder;

public class SuperHero {

	private String name;
	private int lifePoints;
	
	private boolean isVillain;
	private boolean isWounded;
	
	private WeaponInterface leftWeapon;
	private WeaponInterface rightWeapon;
	
	private SuperPowerInterface superPower;
	private SuperPowerInterface superSuperPower;
	
	public SuperHero() {
		
	}
	
	public SuperHero(
			String name, 
			int lifePoints, 
			boolean isVillain, 
			boolean isWounded, 
			WeaponInterface leftWeapon,
			WeaponInterface rightWeapon, 
			SuperPowerInterface superPower, 
			SuperPowerInterface superSuperPower) {

		this.name = name;
		this.lifePoints = lifePoints;
		this.isVillain = isVillain;
		this.isWounded = isWounded;
		this.leftWeapon = leftWeapon;
		this.rightWeapon = rightWeapon;
		this.superPower = superPower;
		this.superSuperPower = superSuperPower;
	}
	
	
}
