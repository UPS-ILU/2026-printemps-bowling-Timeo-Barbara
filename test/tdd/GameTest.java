package tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class GameTest {
	
	Game game;
	
	@BeforeEach
	void init() {
		game = new Game();
	}
	
	@Test
	void test_aucune_quille() {
		for (int i = 0; i < 20; i++) {
			game.roll(0);
		assertEquals(0, game.score());
		}
	}
	
	@Test
	void test_roll_1() {
		for (int i = 0; i < 20; i++) {
			game.roll(1);
		}
		System.out.println(game.score());
		assertEquals(20, game.score());
	}

}
