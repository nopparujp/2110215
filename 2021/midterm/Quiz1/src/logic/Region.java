package logic;

import java.util.ArrayList;

public class Region {
	private String name;
	private ArrayList<Player> playerList;
	private ArrayList<Quest> questList;

	public Region(String name) {
		setName(name);
		playerList = new ArrayList<>();
		questList = new ArrayList<>();
	}

	public void setName(String name) {
		if (name.isBlank()) {
			this.name = "Nowhere";

		} else {
			this.name = name;
		}
	}

	public int getPlayerCount() {
		return playerList.size();
	}

	public double getRegionRank() {
		if (playerList.size() == 0) {
			return 0;
		}
		double sum = 0;
		for (var player : playerList) {
			sum += player.getRank();
		}
		double average = sum / playerList.size();
		return Math.round(average * 100) / 100.0;
	}

	public ArrayList<Quest> getAvailableQuests(Player viewer) {
		ArrayList<Quest> R = new ArrayList<>();
		for (var quest : questList) {
			if (quest.getStatus() == Status.AVAILABLE && !quest.getAuthor().getName().equals(viewer.getName())) {
				R.add(quest);
			}
		}
		return R;
	}

	public void addPlayerToRegion(Player p) {
		playerList.add(p);
	}

	public void addQuestToRegion(Quest q) {
		questList.add(q);

	}

	public String getName() {
		return name;
	}

	public ArrayList<Player> getPlayerList() {
		return playerList;
	}

	public void setPlayerList(ArrayList<Player> playerList) {
		this.playerList = playerList;
	}

	public ArrayList<Quest> getQuestList() {
		return questList;
	}

	public void setQuestList(ArrayList<Quest> questList) {
		this.questList = questList;
	}

}
