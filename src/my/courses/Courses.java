package my.courses;

public class Courses { // Green distances made up 
	
	// add hazards
	
	public GolfCourse getStMarksGolfClub() { // Joe's high school course
		
		GolfHole hole1 = new GolfHole(432, 45, 4);
		hole1.addHazard("bunker", 230, 240);
		GolfHole hole2 = new GolfHole(141, 40, 3);
		hole2.addHazard("water", 30, 115);
		GolfHole hole3 = new GolfHole(554, 60, 5);
		hole3.addHazard("ob", 340, 40);
		GolfHole hole4 = new GolfHole(478, 40, 4);
		GolfHole hole5 = new GolfHole(416, 35, 4);
		GolfHole hole6 = new GolfHole(303, 45, 4);
		GolfHole hole7 = new GolfHole(185, 25, 3);
		GolfHole hole8 = new GolfHole(331, 50, 4);
		GolfHole hole9 = new GolfHole(423, 35, 4);
		
		GolfCourse smgc = new GolfCourse(hole1, hole2, hole3, hole4, hole5, hole6, hole7, hole8, hole9);
		
		return smgc;
	}
	
	public GolfCourse getStAndrews() { 
		
		GolfHole hole1 = new GolfHole(376, 25, 4);
		GolfHole hole2 = new GolfHole(453, 40, 4);
		GolfHole hole3 = new GolfHole(397, 3, 4);
		GolfHole hole4 = new GolfHole(480, 30, 4);
		GolfHole hole5 = new GolfHole(568, 70, 5);
		GolfHole hole6 = new GolfHole(412, 40, 4);
		GolfHole hole7 = new GolfHole(371, 26, 4);
		GolfHole hole8 = new GolfHole(175, 30, 3);
		GolfHole hole9 = new GolfHole(352, 30, 4);
		GolfHole hole10 = new GolfHole(386, 40, 4);
		GolfHole hole11 = new GolfHole(174, 45, 3);
		GolfHole hole12 = new GolfHole(348, 30, 4);
		GolfHole hole13 = new GolfHole(465, 50, 4);
		GolfHole hole14 = new GolfHole(618, 80, 5);
		GolfHole hole15 = new GolfHole(455, 35, 4);
		GolfHole hole16 = new GolfHole(423, 35, 4);
		GolfHole hole17 = new GolfHole(495, 65, 4);
		GolfHole hole18 = new GolfHole(357, 30, 4);

		GolfCourse stagc = new GolfCourse(hole1, hole2, hole3, hole4, hole5, hole6, hole7, hole8, hole9, hole10, hole11, hole12, hole13, hole14, hole15, hole16, hole17, hole18);
		
		return stagc;
	}
	
	public GolfCourse getGennesseValley() { 
		
		GolfHole hole1 = new GolfHole(530, 35, 5);
		GolfHole hole2 = new GolfHole(305, 40, 4);
		GolfHole hole3 = new GolfHole(331, 20, 4);
		GolfHole hole4 = new GolfHole(201, 15, 3);
		GolfHole hole5 = new GolfHole(500, 25, 5);
		GolfHole hole6 = new GolfHole(226, 15, 3);
		GolfHole hole7 = new GolfHole(409, 25, 4);
		GolfHole hole8 = new GolfHole(410, 30, 4);
		GolfHole hole9 = new GolfHole(229, 35, 3);
		GolfHole hole10 = new GolfHole(433, 40, 4);
		GolfHole hole11 = new GolfHole(363, 25, 4);
		GolfHole hole12 = new GolfHole(174, 30, 3);
		GolfHole hole13 = new GolfHole(545, 50, 5);
		GolfHole hole14 = new GolfHole(419, 60, 4);
		GolfHole hole15 = new GolfHole(512, 35, 5);
		GolfHole hole16 = new GolfHole(410, 35, 4);
		GolfHole hole17 = new GolfHole(320, 45, 4);
		GolfHole hole18 = new GolfHole(170, 30, 3);

		GolfCourse gvpnc = new GolfCourse(hole1, hole2, hole3, hole4, hole5, hole6, hole7, hole8, hole9, hole10, hole11, hole12, hole13, hole14, hole15, hole16, hole17, hole18);
		
		return gvpnc;
		
	}


}
