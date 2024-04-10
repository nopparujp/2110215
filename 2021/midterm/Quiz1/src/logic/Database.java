package logic;

import java.util.ArrayList;
public class Database {
	private ArrayList<Player> playerList;
	private ArrayList<Region> regionList;

	public  Database() {
		playerList = new ArrayList<>();
		regionList = new ArrayList<>();
	}
	public Database(ArrayList<Player> playerList , ArrayList<Region> regionList ) {
		this.playerList = playerList;
		this.regionList = regionList;
		
	}
	public Player addPlayer(String name, Region region) throws Exception{
		boolean exist = false;
		for (var player : playerList) {
			if (player.getName().equals(name)) {
				exist = true;
				break;
			}
		}
		if (!exist) {
			Player newPlayer = new Player(name);
			playerList.add(newPlayer);
			region.addPlayerToRegion(newPlayer);
			return newPlayer;
		}
		else {
			throw new Exception();
		}
	}
	public boolean addRegion(String name) {
		boolean exist = false;
		for (var region : regionList) {
			if (region.getName() == name) {
				exist = true;
				break;
			}
		}
		if (!exist) {
			Region newRegion = new Region(name);
			regionList.add(newRegion);
			return true;
		}
		return false;
	}
	public Region getRegionByName(String name) {
		for (var region : regionList) {
			if (region.getName() == name) {
				return region;
			}
		}
		return null;
		
	}
	public void addQuest(Player author, Region region ,String name ,String description) {
		Quest newQuest = new Quest(author , region ,name ,description);
		for (var i :  regionList) {
			if (i.equals(region)) {
				i.addQuestToRegion(newQuest);
				break;
			}
		}
	}
	public ArrayList<Player> getPlayerList() {
		return playerList;
	}
	public void setPlayerList(ArrayList<Player> playerList) {
		this.playerList = playerList;
	}
	public ArrayList<Region> getRegionList() {
		return regionList;
	}
	public void setRegionList(ArrayList<Region> regionList) {
		this.regionList = regionList;
	}
}

