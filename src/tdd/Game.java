package tdd;

public class Game {
	
	int score = 0;
	int dernierLancer = 0;
	int numLancer = 1;
	boolean spare = false;
	boolean strike = false;

	void roll(int nbQuilles) {
		score += nbQuilles;
		
		if (numLancer<=20) {
			if (spare) {
				score += nbQuilles;
				spare = false;
			} else if (strike) {
				score += nbQuilles;
				if (numLancer % 2 == 0) {
					strike = false;
				}
			}
			
			if ((numLancer % 2 == 1) && (nbQuilles>=10)) {
				strike = true;
				numLancer++;
			} else if ((numLancer % 2 == 0) && (nbQuilles + dernierLancer>=10)) {
				spare = true;
			}
			
			dernierLancer=nbQuilles;
			numLancer++;
		}
		
	}
	
	int score() {
		return score;
	}
}
