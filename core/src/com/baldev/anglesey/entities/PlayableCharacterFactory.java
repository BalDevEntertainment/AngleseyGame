package com.baldev.anglesey.entities;


import com.baldev.anglesey.AngleseyGame;

public class PlayableCharacterFactory {

	public static PlayableCharacter buildPlayableCharacter() {
		return new DefaultPlayableCharacter(AngleseyGame.warriorAssets);
	}
}
