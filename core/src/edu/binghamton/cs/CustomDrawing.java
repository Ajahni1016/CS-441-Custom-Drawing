package edu.binghamton.cs; //Justin

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;
import 	java.lang.Math;

public class CustomDrawing extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	ShapeRenderer circleRenderer;
	double x, y=50;
	float dx, dy;
	float w, h;
	float ticks=0;
	int dir_x = 0; //0 = forwards, 1 = backwards
	int dir_y = 0; //0 = forwards, 1 = backwards

	@Override
	public void create () {
		batch = new SpriteBatch();
		circleRenderer = new ShapeRenderer();
	}

	@Override
	public void render () {
		ticks++;
		Gdx.gl.glClearColor( 0, 0, 0, 1 );
		Gdx.gl.glClear( GL20.GL_COLOR_BUFFER_BIT);
		if(x >=w ){
			dir_x = 1;
		}
		else if(x<=0){
			dir_x = 0;
		}
		if(y >=h ){
			dir_y = 1;
		}
		else if(y<=0){
			dir_y = 0;
		}

		if(dir_x == 0){
			x+=20;
		}
		else{
			x-=20;
		}

		if(dir_y == 0){
			y+=20;
		}
		else{
			y-=20;
		}
		//sprite.setPosition(x,y);
		circleRenderer.begin(ShapeRenderer.ShapeType.Filled);
		circleRenderer.circle((float)x, (float)y, 50);
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
