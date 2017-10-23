package my.clubs;

public class Putter{
	
	private String clubType;
	
	public Putter() {
		this.setClubType("putter");
	}
	
	public int getAverageDistance(int power) { // feet
		
		switch(power) {
			case 1:
				return 1; 
			case 2:
				return 2;
			case 3:
				return 4;
			case 4:
				return 8;
			case 5:
				return 12;
			case 6:
				return 16;
			case 7:
				return 20;
			case 8:
				return 25;
			case 9:
				return 30;
			case 10:
				return 40;
		}
		
		return 0;
	}
	
	public int getStandardDeviation(int power) { // feet
		
		switch(power) {
			case 1:
				return 1;
			case 2:
				return 1;
			case 3:
				return 2;
			case 4:
				return 2;
			case 5:
				return 3;
			case 6:
				return 3;
			case 7:
				return 4;
			case 8:
				return 4;
			case 9:
				return 5;
			case 10:
				return 5;
		}
		
		return 0;
	}

	public String getClubType() {
		return clubType;
	}

	public void setClubType(String clubType) {
		this.clubType = clubType;
	}
	
}