package my.players;
import java.util.Random;

public class SinglePlayer {
	
	private String playerName;
	private my.clubs.GolfBag golfBag;
	private my.clubs.GolfClub clubChoice;
	private int holeStrokes;
	private int roundStrokes;
	private int parValue;
	private double[][] scoreCard;

	public SinglePlayer(String playerName) {
		this.playerName = playerName;
		this.setGolfBag(new my.clubs.GolfBag());
	}
	
	public int nextBallDistance(int power) {
		Random rand = new Random();
		double meanAdj = clubChoice.getAverageDistance() * (power / 10.0);
		double deviationAdj = clubChoice.getStandardDev() * (power / 10.0);
		double distance = Math.abs(rand.nextGaussian() * deviationAdj + meanAdj);
		return (int) distance;
	}
	
	public int nextPuttDistance(int power) {
		Random rand = new Random();
		double meanAdj = golfBag.getPutter().getAverageDistance(power);
		double deviationAdj = golfBag.getPutter().getStandardDeviation(power);
		double distance = Math.abs(rand.nextGaussian() * deviationAdj + meanAdj);
		return (int) distance;
	}
	
	public my.clubs.GolfClub getClubChoice() {
		return clubChoice;
	}

	public void setClubChoice(my.clubs.GolfClub clubChoice) {
		this.clubChoice = clubChoice;
	}
	
	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getHoleStrokes() {
		return holeStrokes;
	}

	public void setHoleStrokes(int holeStrokes) {
		this.holeStrokes = holeStrokes;
	}

	public int getRoundStrokes() {
		return roundStrokes;
	}

	public void setRoundStrokes(int gameStrokes) {
		this.roundStrokes = gameStrokes;
	}

	public int getParValue() {
		return parValue;
	}

	public void setParValue(int parValue) {
		this.parValue = parValue;
	}

	public double[][] getScoreCard() {
		return scoreCard;
	}

	public void setScoreCard(double[][] scoreCard) {
		this.scoreCard = scoreCard;
	}

	public void getGolfBag() {
		golfBag.getBagInfo();
	}

	public void setGolfBag(my.clubs.GolfBag golfBag) {
		this.golfBag = golfBag;
	}
	
	public void addHoleStroke() {
		this.holeStrokes += 1;
	}
	
	public void resetHoleStrokes() {
		this.holeStrokes = 0;
	}
	
	public void addRoundStrokes(int strokes) {
		this.roundStrokes += strokes;
	}
	
	public void resetRoundStrokes(int strokes) {
		this.roundStrokes = 0;
	}

}
