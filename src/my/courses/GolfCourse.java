package my.courses;

import java.util.ArrayList;

public class GolfCourse {
	
	@SuppressWarnings("unused")
	private GolfHole golfHole1, golfHole2, golfHole3, golfHole4, golfHole5, golfHole6,
					golfHole7, golfHole8, golfHole9, golfHole10, golfHole11, golfHole12,
					golfHole13, golfHole14, golfHole15, golfHole16, golfHole17, golfHole18;

	private ArrayList<GolfHole> holeList = new ArrayList<GolfHole>();
	private int par;

	public GolfCourse(GolfHole golfHole1, GolfHole golfHole2, GolfHole golfHole3, GolfHole golfHole4,
			GolfHole golfHole5, GolfHole golfHole6, GolfHole golfHole7, GolfHole golfHole8, GolfHole golfHole9,
			GolfHole golfHole10, GolfHole golfHole11, GolfHole golfHole12, GolfHole golfHole13, GolfHole golfHole14,
			GolfHole golfHole15, GolfHole golfHole16, GolfHole golfHole17, GolfHole golfHole18) {
		
		this.golfHole1 = golfHole1;
		holeList.add(golfHole1);
		this.golfHole2 = golfHole2;
		holeList.add(golfHole2);
		this.golfHole3 = golfHole3;
		holeList.add(golfHole3);
		this.golfHole4 = golfHole4;
		holeList.add(golfHole4);
		this.golfHole5 = golfHole5;
		holeList.add(golfHole5);
		this.golfHole6 = golfHole6;
		holeList.add(golfHole6);
		this.golfHole7 = golfHole7;
		holeList.add(golfHole7);
		this.golfHole8 = golfHole8;
		holeList.add(golfHole8);
		this.golfHole9 = golfHole9;
		holeList.add(golfHole9);
		this.golfHole10 = golfHole10;
		holeList.add(golfHole10);
		this.golfHole11 = golfHole11;
		holeList.add(golfHole11);
		this.golfHole12 = golfHole12;
		holeList.add(golfHole12);
		this.golfHole13 = golfHole13;
		holeList.add(golfHole13);
		this.golfHole14 = golfHole14;
		holeList.add(golfHole14);
		this.golfHole15 = golfHole15;
		holeList.add(golfHole15);
		this.golfHole16 = golfHole16;
		holeList.add(golfHole16);
		this.golfHole17 = golfHole17;
		holeList.add(golfHole17);
		this.golfHole18 = golfHole18;
		holeList.add(golfHole18);
		this.setPar(findPar());
	}

	public GolfCourse(GolfHole golfHole1, GolfHole golfHole2, GolfHole golfHole3, GolfHole golfHole4,
			GolfHole golfHole5, GolfHole golfHole6, GolfHole golfHole7, GolfHole golfHole8, GolfHole golfHole9) {
		
		this.golfHole1 = golfHole1;
		holeList.add(golfHole1);
		this.golfHole2 = golfHole2;
		holeList.add(golfHole2);
		this.golfHole3 = golfHole3;
		holeList.add(golfHole3);
		this.golfHole4 = golfHole4;
		holeList.add(golfHole4);
		this.golfHole5 = golfHole5;
		holeList.add(golfHole5);
		this.golfHole6 = golfHole6;
		holeList.add(golfHole6);
		this.golfHole7 = golfHole7;
		holeList.add(golfHole7);
		this.golfHole8 = golfHole8;
		holeList.add(golfHole8);
		this.golfHole9 = golfHole9;
		holeList.add(golfHole9);
		
	}

	private int findPar() {
		
		for(int i=0; i<holeList.size()-1; i++) {
			GolfHole temp = holeList.get(i);
			par += temp.getPar();
		}
		return par;
	}
	
	public int getPar() {
		return this.par;
	}
	
	private void setPar(int par) {
		this.par = par;
	}

	public GolfHole getGolfHole(int num) {
		return holeList.get(num-1);
	}

	public ArrayList<GolfHole> getHoleList() {
		return holeList;
	}
	
	public void setHoleList(ArrayList<GolfHole> holeList) {
		this.holeList = holeList;
	}
}
