package com.number.guess;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class NumberGuessGameTest {
	
	private NumberGuessGame game;
	
	@Before
	public void setup()
	{
		game = new NumberGuessGame();
	}

	@Test
	public void testPlay() {
		// game.play(); See NumberGuessGameApp
	}

	@Test
	public void testGameShouldStartWhenUserInputsReady() {
		assertTrue(game.isUserReady("Ready"));
	}
	
	@Test
	public void testGameShouldExitWhenUserInputsNothing() {
		assertFalse(game.isUserReady(null));
	}

	@Test
	public void testGameShouldNotContinueWhenUserInputsEnd() {
		assertFalse(game.IsGameContinued("End"));
	}
	
	@Test
	public void testGameShouldNotContinueWhenUserInputsYes() {
		assertFalse(game.IsGameContinued("Yes"));
	}
	
	@Test
	public void testGameShouldNotContinueWhenUserInputsHigher() {
		assertTrue(game.IsGameContinued("higher"));
	}
	
	@Test
	public void testGameShouldNotContinueWhenUserInputsLower() {
		assertTrue(game.IsGameContinued("lower"));
	}

}
