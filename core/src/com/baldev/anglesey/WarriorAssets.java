package com.baldev.anglesey;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

public class WarriorAssets {

	public Texture idleTexture;

	private WarriorAssets() {
		idleTexture = new Texture(Gdx.files.internal("knight.png"));
	}

	public static WarriorAssets initialize() {
		return new WarriorAssets();
	}
}
