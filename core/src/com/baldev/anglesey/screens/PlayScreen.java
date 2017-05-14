package com.baldev.anglesey.screens;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.baldev.anglesey.AngleseyGame;
import com.baldev.anglesey.DungeonFloor;
import com.baldev.anglesey.entities.PlayableCharacter;
import com.baldev.anglesey.entities.PlayableCharacterFactory;

public class PlayScreen implements Screen {

	private AngleseyGame game;
	private OrthographicCamera gameCam;
	private Viewport gamePort;
	private PlayableCharacter playableCharacter;
	private DungeonFloor dungeonFloor;


	public PlayScreen(AngleseyGame game) {
		this.game = game;
		gameCam = new OrthographicCamera();
		gameCam.setToOrtho(false, 800, 480);
		gamePort = new FitViewport(AngleseyGame.V_WIDTH, AngleseyGame.V_HEIGHT, gameCam);
		playableCharacter = PlayableCharacterFactory.buildPlayableCharacter();
		dungeonFloor = AngleseyGame.floorAssets;
	}

	@Override
	public void show() {

	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		gameCam.update();

		drawSprites();

		if(Gdx.input.isTouched()) {
			playableCharacter.setPosX(playableCharacter.getPosX() + playableCharacter.getAcceleration());
		}
	}

	private void drawSprites() {
		SpriteBatch batch = AngleseyGame.batch;
		batch.begin();
		batch.draw(dungeonFloor.getAsset(), 0, 0);
		batch.draw(dungeonFloor.getAsset(), dungeonFloor.getAsset().getWidth(), 0);
		playableCharacter.setPosY(dungeonFloor.getAsset().getHeight());
		batch.draw(playableCharacter.getAsset(), playableCharacter.getPosX(), playableCharacter.getPosY());
		batch.end();
	}

	@Override
	public void resize(int width, int height) {
		gamePort.update(width, height);
	}

	@Override
	public void pause() {

	}

	@Override
	public void resume() {

	}

	@Override
	public void hide() {

	}

	@Override
	public void dispose() {

	}
}
