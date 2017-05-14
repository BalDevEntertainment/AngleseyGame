package com.baldev.anglesey.entities;


import com.badlogic.gdx.graphics.Texture;
import com.baldev.anglesey.WarriorAssets;

public class DefaultPlayableCharacter implements PlayableCharacter {

	private final WarriorAssets warriorAssets;
	private float x;
	private float y;

	public DefaultPlayableCharacter(WarriorAssets warriorAssets) {
		this.warriorAssets = warriorAssets;
	}

	@Override
	public Texture getAsset() {
		return warriorAssets.idleTexture;
	}

	@Override
	public void setPosX(float x) {
		this.x = x;
	}

	@Override
	public void setPosY(float y) {
		this.y = y;
	}

	@Override
	public float getPosX() {
		return x;
	}

	@Override
	public float getPosY() {
		return y;
	}

	@Override
	public float getAcceleration() {
		return 10;
	}
}
