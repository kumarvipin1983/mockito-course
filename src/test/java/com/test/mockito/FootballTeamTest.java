package com.test.mockito;

import static org.junit.Assert.*;

import org.junit.Test;

public class FootballTeamTest {

	private static final int THREE_GAMES_WON = 3;
	
	@Test
	public void testConstructorShouldSetGamesWon() {
		FootballTeam team = new FootballTeam(THREE_GAMES_WON);
		assertEquals(THREE_GAMES_WON, team.getGamesWon());
	}
}
