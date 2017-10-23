package my.courses;

public class GolfGreen {
	
	private int greenLength;
	private int holeLocation;
	
	public GolfGreen(int greenLength, int holeLocation) {
		this.greenLength = greenLength;
		this.holeLocation = holeLocation;
	}

	public int getGreenLength() {
		return greenLength;
	}

	public void setGreenLength(int greenLength) {
		this.greenLength = greenLength;
	}

	public int getHoleLocation() {
		return holeLocation;
	}

	public void setHoleLocation(int holeLocation) {
		this.holeLocation = holeLocation;
	}

}
