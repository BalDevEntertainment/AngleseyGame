package com.baldev.anglesey;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class DungeonFloor {

	private final Texture texture;

	public Texture getAsset() {
		return texture;
	}

	private DungeonFloor() {
		texture = new Texture(Gdx.files.internal("dungeon_floor.png"));
	}

	public static DungeonFloor initialize() {
		return new DungeonFloor();
	}
}
