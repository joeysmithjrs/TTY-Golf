package my.clubs;

public class GolfClub {
	
	private int clubType;
	private int averageDistance;
	private int standardDev;

	
	public GolfClub(int clubType, int averageYardage, int standardDev) {
		this.clubType = clubType;
		this.averageDistance = averageYardage;
		this.standardDev = standardDev;
	}
	
	public GolfClub() {
	}
	
	public int getClubType() {
		return clubType;
	}
	
	public void setClubType(int clubType) {
		this.clubType = clubType;
	}
	
	public int getAverageDistance() { // yards
		return averageDistance;
	}
	
	public void setAverageDistance(int averageYardage) {
		this.averageDistance = averageYardage;
	}
	
	public int getStandardDev() {
		return standardDev;
	}
	
	public void setStandardDev(int standardDev) {
		this.standardDev = standardDev;
	}
	
}
