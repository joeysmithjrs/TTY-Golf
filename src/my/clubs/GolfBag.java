package my.clubs;

import java.util.ArrayList;

public class GolfBag {
	
	private Putter putter;
	private GolfClub driver, twoIron, threeIron, fourIron, fiveIron,
					sixIron, sevenIron, eightIron, nineIron, pitchingWedge;
	private ArrayList<GolfClub> clubList = new ArrayList<GolfClub>(); 
	
	public GolfBag() {
		this.setPutter(new Putter());
		this.driver = new GolfClub(1,230,30);
		clubList.add(driver);
		this.twoIron = new GolfClub(2, 215, 20);
		clubList.add(twoIron);
		this.threeIron = new GolfClub(3, 180, 20);
		clubList.add(threeIron);
		this.fourIron = new GolfClub(4, 170, 17);
		clubList.add(fourIron);
		this.fiveIron = new GolfClub(5, 155, 15);
		clubList.add(fiveIron);
		this.sixIron = new GolfClub(6, 145, 15);
		clubList.add(sixIron);
		this.sevenIron = new GolfClub(7, 135, 15);
		clubList.add(sevenIron);
		this.eightIron = new GolfClub(8, 125, 15);
		clubList.add(eightIron);
		this.nineIron = new GolfClub(9, 110, 10);
		clubList.add(nineIron);
		this.pitchingWedge = new GolfClub(10, 50, 10);
		clubList.add(pitchingWedge);
	}
	
	public void getBagInfo(){
		String clubStr;
		for (int i = 0; i < clubList.size() ; i++) {
			GolfClub club = clubList.get(i);
			clubStr = "Club " + club.getClubType() + " | Average Yardage: " + club.getAverageDistance() + " | Stardard Deviation: " + club.getStandardDev();
			System.out.println(clubStr);
		}
	}
	
	public double[] getClubInfo(int num) {
		
		double arr[] = new double[3];
		GolfClub choice = clubList.get(num);
		double clubType = choice.getClubType();
		arr[0] = clubType;
		double avgYard = choice.getAverageDistance();
		arr[1] = avgYard;
		double standardDev = choice.getStandardDev();
		arr[2] = standardDev;
		
		return arr;
	}

	public Putter getPutter() {
		return putter;
	}

	public void setPutter(Putter putter) {
		this.putter = putter;
	}

}
