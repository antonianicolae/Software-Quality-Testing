package ro.ase.csie.cts.g1094.dp.strategy;

public class NoCampaign implements BonusStrategyInterface{

	@Override
	public void getBonusPoints(int points, Player player) {
		player.experiencePoints += points;
		
	}
	
}
