package my.courses;

public class Hazard {

	private String hazardType;
	private int startDist;
	private int endDist;
	private double distanceDetriment;
	private int strokeDetriment;
	
	public Hazard(String hazardType, int startDist, int endDist) {
		this.hazardType = hazardType;
		this.startDist = startDist;
		this.endDist = endDist;
		setDetriments(hazardType);
	}

	public void setDetriments(String hazardType) {
		
		switch(hazardType.toLowerCase()) {		
			case "bunker":
				this.strokeDetriment = 0;
				this.distanceDetriment = 0.9;
			case "water":
				this.strokeDetriment = 1;
				this.distanceDetriment = 1;
			case "ob":
				this.strokeDetriment = 1;
				this.distanceDetriment = 0;
			case "forest":
				this.strokeDetriment = 0;
				this.distanceDetriment = 0.8;
		}
	}
	
	public int getStartDist() {
		return startDist;
	}

	public void setStartDist(int startDist) {
		this.startDist = startDist;
	}

	public int getEndDist() {
		return endDist;
	}

	public void setEndDist(int endDist) {
		this.endDist = endDist;
	}

	public String getHazardType() {
		return hazardType;
	}

	public void setHazardType(String hazardType) {
		this.hazardType = hazardType;
	}

	public double getDistanceDetriment() {
		return distanceDetriment;
	}

	public void setDistanceDetriment(double distanceDetriment) {
		this.distanceDetriment = distanceDetriment;
	}

	public int getStrokeDetriment() {
		return strokeDetriment;
	}

	public void setStrokeDetriment(int strokeDetriment) {
		this.strokeDetriment = strokeDetriment;
	}

}
