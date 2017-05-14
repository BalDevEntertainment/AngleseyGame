package com.baldev.anglesey;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.baldev.anglesey.screens.PlayScreen;

public class AngleseyGame extends Game {
	public static final int V_WIDTH = 400;
	public static final int V_HEIGHT = 208;

	public static WarriorAssets warriorAssets;
	public static DungeonFloor floorAssets;

	public static SpriteBatch batch;

	@Override
	public void create () {
		initializeAssets();
		batch = new SpriteBatch();
		setScreen(new PlayScreen(this));
	}

	@Override
	public void render() {
		super.render();
	}

	private void initializeAssets() {
		warriorAssets = WarriorAssets.initialize();
		floorAssets = DungeonFloor.initialize();
	}
}
