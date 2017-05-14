package com.baldev.anglesey.scenes;


import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.physics.box2d.World;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.baldev.anglesey.AngleseyGame;

public class Hud {

	public Stage stage;
	private Viewport viewport;

	private int score;
	private int level;

	Label scoreLabel;
	Label levelLabel;

	public Hud(SpriteBatch spriteBatch) {
		viewport = new FitViewport(AngleseyGame.V_WIDTH, AngleseyGame.V_HEIGHT, new OrthographicCamera());
		stage = new Stage(viewport, spriteBatch);

		Table table = new Table();
		table.top();
		table.setFillParent(true);

		scoreLabel = new Label(String.format("%06d", score), new Label.LabelStyle(new BitmapFont(), Color.WHITE));
		levelLabel = new Label(String.format("%02d", level), new Label.LabelStyle(new BitmapFont(), Color.WHITE));

		table.add(scoreLabel).expandX().padTop(10);
		table.add(levelLabel).expandX().padTop(10);

		stage.addActor(table);

	}
}
