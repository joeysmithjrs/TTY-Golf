package my.courses;
import java.util.ArrayList;

public class GolfHole {
	
	private int distance;
	private int amtHazards;
	private ArrayList<Hazard> hazardList = new ArrayList<Hazard>();
	private int greenLength;
	private int par;
	private int totalDistance;
	private GolfGreen golfGreen;

	public GolfHole(int distance, int greenLength, int par) {
		this.distance = distance; // yards
		this.par = par;
		this.setGolfGreen(new GolfGreen(greenLength, distance));
		this.setTotalDistance(distance + (greenLength / 2));
	}
	
	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public int getAmtHazards() {
		return amtHazards;
	}

	public ArrayList<Hazard> getHazardList() {
		return hazardList;
	}

	public void setHazardList(ArrayList<Hazard> hazardList) {
		this.hazardList = hazardList;
	}
	
	public void addHazard(String hazardType, int startDist, int endDist) {
		Hazard newHazard = new Hazard(hazardType, startDist, endDist);
		hazardList.add(newHazard);
		amtHazards += 1;
	}

	public int getGreenLength() {
		return greenLength;
	}

	public void setGreenLength(int greenLength) {
		this.greenLength = greenLength;
	}

	public int getPar() {
		return par;
	}

	public void setPar(int par) {
		this.par = par;
	}

	public int getTotalDistance() {
		return totalDistance;
	}

	public void setTotalDistance(int totalDistance) {
		this.totalDistance = totalDistance;
	}

	public GolfGreen getGolfGreen() {
		return golfGreen;
	}

	public void setGolfGreen(GolfGreen golfGreen) {
		this.golfGreen = golfGreen;
	}
}
