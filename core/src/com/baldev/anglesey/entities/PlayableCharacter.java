package com.baldev.anglesey.entities;

import com.badlogic.gdx.graphics.Texture;

public interface PlayableCharacter {

	Texture getAsset();

	void setPosX(float x);
	void setPosY(float y);

	float getPosX();
	float getPosY();

	float getAcceleration();
}
