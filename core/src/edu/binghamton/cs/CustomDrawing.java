package edu.binghamton.cs; //Justin

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;

public class CustomDrawing extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	ShapeRenderer circleRenderer;
	float x, y;
	float dx, dy;
	float w, h;

	@Override
	public void create () {
		batch = new SpriteBatch();
		circleRenderer = new ShapeRenderer();
		img = new Texture("badlogic.jpg");
	}

	@Override
	public void render () {
		x = 552;
		y = 300;
		//sprite.setPosition(x,y);
		circleRenderer.begin(ShapeRenderer.ShapeType.Filled);
		circleRenderer.circle(x, y, 50);
		circleRenderer.end();

	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}

	@Override
	public void resize(int width, int height){
		w = width;
		h = height;
	}
}
