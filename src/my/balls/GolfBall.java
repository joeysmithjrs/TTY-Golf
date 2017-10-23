package my.balls;

import my.courses.GolfGreen;
import my.courses.GolfHole;
import my.courses.Hazard;

public class GolfBall {
	
	private int distanceFromTee;
	private int distanceToPin;
	@SuppressWarnings("unused")
	private boolean onGreen;
	private boolean pastGreen;
	
	@SuppressWarnings("unused")
	private boolean inBounds;
	private boolean inHazard;
	
	public GolfBall(int distanceToPin) {
		this.distanceFromTee = 0;
		this.distanceToPin = distanceToPin;
		this.onGreen = false;
		this.inBounds = true;
		this.inHazard = false;
	}
	
	public void ballHit(int distance) {
		this.distanceFromTee += distance;
		this.distanceToPin -= distance;
	}

	public int getDistanceFromTee() {
		return distanceFromTee;
	}

	public void setDistanceFromTee(int distanceFromTee) {
		this.distanceFromTee = distanceFromTee;
	}

	public int getDistanceToPin() {
		return distanceToPin;
	}

	public void setDistanceToPin(int distanceToPin) {
		this.distanceToPin = distanceToPin;
	}
	
	public boolean isOnGreen(GolfGreen golfGreen) {
		if (distanceToPin < (golfGreen.getGreenLength()/2)/3) {
			return true;
		} else {
			return false;
		}
	}

	public void setOnGreen(boolean onGreen) {
		this.onGreen = onGreen;
	}

	public boolean isPastGreen(GolfHole golfHole) {
		if (distanceFromTee > (golfHole.getDistance() + (golfHole.getGolfGreen().getGreenLength()/2)/3)){
			return true;
		} else {
			return false;
		}
	}

	public void setPastGreen(boolean pastGreen) {
		this.pastGreen = pastGreen;
	}

	public boolean isInBounds(GolfHole golfHole) {
		if (!pastGreen) {
			return true;
		} 
		return false;
	}
	
	public boolean isInHazard(GolfHole golfHole) {
		if (golfHole.getHazardList().size() < 1) {
			return false;
		} else {
			for(int i = 0; i < golfHole.getHazardList().size(); i++) {
				if ((distanceFromTee >= golfHole.getHazardList().get(i).getStartDist()) && (distanceFromTee <= golfHole.getHazardList().get(i).getEndDist())) {
					this.inHazard = true;
					return inHazard;
				} else {
					this.inHazard = false;
				}
			}
		return inHazard;
		}
	}
	
	public Hazard getCurrentHazard(GolfHole golfHole) {
		
		if(inHazard) {
			for(int i = 0; i < golfHole.getHazardList().size(); i++) {
				if ((distanceFromTee >= golfHole.getHazardList().get(golfHole.getHazardList().size() - 1 - i).getStartDist())){
					return golfHole.getHazardList().get((golfHole.getHazardList().size() - 1) - i);
				} else {
					continue;
				}
			}	
		}
	return null;
	}
	
	public void setInHazard(boolean inHazard) {
		this.inHazard = inHazard;
	}

	public void setInBounds(boolean inBounds) {
		this.inBounds = inBounds;
	}
	

}
