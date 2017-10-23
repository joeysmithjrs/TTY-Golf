package my.game;

import java.util.ArrayList;

import my.courses.GolfCourse;
import my.players.CPU;
import my.players.SinglePlayer;

public class Game {
	
	private ArrayList<int[][]> scoreCards;
	private ArrayList<SinglePlayer> playerList;
	private ArrayList<CPU> cpuList;
	private SinglePlayer singlePlayer;
	private GolfCourse golfCourse;
	private int amtCPU;
	private int amtPlayers;
	
	public Game (SinglePlayer singlePlayer,  GolfCourse golfCourse) {
		this.setSinglePlayer(singlePlayer);
		this.setAmtCPU(0);
		this.setAmtPlayers(1);
		this.setGolfCourse(golfCourse);
	}
	
	public Game (SinglePlayer singlePlayer, int amtCPU, GolfCourse golfCourse) {
		this.setSinglePlayer(singlePlayer);
		this.setAmtCPU(amtCPU);
		this.setAmtPlayers(amtCPU + 1);
		this.setGolfCourse(golfCourse);
	}
	
	public Game (int amtPlayers, GolfCourse golfCours) {
		this.setAmtPlayers(amtPlayers);
		this.setGolfCourse(golfCourse);
	}

	public ArrayList<int[][]> getScoreCards() {
		return scoreCards;
	}

	public void setScoreCards(ArrayList<int[][]> scoreCards) {
		this.scoreCards = scoreCards;
	}

	public ArrayList<SinglePlayer> getPlayerList() {
		return playerList;
	}

	public void setPlayerList(ArrayList<SinglePlayer> playerList) {
		this.playerList = playerList;
	}

	public ArrayList<CPU> getCpuList() {
		return cpuList;
	}

	public void setCpuList(ArrayList<CPU> cpuList) {
		this.cpuList = cpuList;
	}

	public SinglePlayer getSinglePlayer() {
		return singlePlayer;
	}

	public void setSinglePlayer(SinglePlayer singlePlayer) {
		this.singlePlayer = singlePlayer;
	}

	public int getAmtCPU() {
		return amtCPU;
	}

	public void setAmtCPU(int amtCPU) {
		this.amtCPU = amtCPU;
	}

	public int getAmtPlayers() {
		return amtPlayers;
	}

	public void setAmtPlayers(int amtPlayers) {
		this.amtPlayers = amtPlayers;
	}
	
	public GolfCourse getGolfCourse() {
		return golfCourse;
	}

	public void setGolfCourse(GolfCourse golfCourse) {
		this.golfCourse = golfCourse;
	}

}
