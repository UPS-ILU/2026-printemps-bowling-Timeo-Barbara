package tdd;

public class Game {
	
	int score = 0;
	int dernierLancer = 0;
	int numLancer = 1;
	boolean spare = false;

	void roll(int nbQuilles) {
		score += nbQuilles;
		if (spare) {
			score += nbQuilles;
			spare = false;
		}
		if ((numLancer % 2 == 0) && (nbQuilles + dernierLancer>=10)) {
			spare = true;
		}
		dernierLancer=nbQuilles;
		numLancer++;
	}
	
	int score() {
		return score;
	}
}
