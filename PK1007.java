package PK;

import java.util.ArrayList;
import java.util.Collections;

public class PK1007 {//
	public static void main(String[] asgr) {
		ArrayList<Medal> medals = new ArrayList<>();
		medals.add(new Medal("American", 9, 8, 9));
		medals.add(new Medal("Australia", 4, 1, 1));
		medals.add(new Medal("China", 8, 3, 6));
		medals.add(new Medal("Russia", 3, 6, 3));
		medals.add(new Medal("Japan", 3, 1, 10));
		medals.add(new Medal("France", 2, 3, 1));
		Collections.sort(medals);
		for (Medal medal : medals) {
			System.out.println(medal);
			
		}
	}
}

class Medal implements Comparable<Medal> {
	private String state;
	private int gold, sliver, brozen;

	public Medal(String state, int gold, int sliver, int brozen) {
		this.state = state;
		this.gold = gold;
		this.sliver = sliver;
		this.brozen = brozen;
	}

	public String toString() {
		return String.format("%s[gold:%d,sliver:%d,brozen:%d]", state, gold, sliver, brozen);
	}

	private int score() {
		return gold * 100 + sliver * 10 + brozen * 1;
	}

	public int compareTo(Medal m) {
		return score() == m.score() ? state.compareTo(m.state) : m.score() - score();

	}
}
