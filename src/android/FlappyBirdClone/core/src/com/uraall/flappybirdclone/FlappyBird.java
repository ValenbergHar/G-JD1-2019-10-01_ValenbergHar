package com.uraall.flappybirdclone;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Random;

import javax.xml.soap.Text;

public class FlappyBird extends ApplicationAdapter {
    SpriteBatch batch;
    Texture background;
    Texture[] bird;
    Texture bird_wings_up;
    int birdStateFlag = 0;
    float flyheight;
    double fallingSpeed = 0.0;
    int gameStateFlag = 0;
    Texture topTube;
    Texture bottomTube;
    int spaceBetweenTubes = 500;
    float tubeShift;
    Random random;

    @Override
    public void create() {
        batch = new SpriteBatch();
        background = new Texture("background.png");
        bird_wings_up = new Texture("bird_wings_up.png");
        bird = new Texture[2];
        bird[0] = new Texture("bird_wings_up.png");
        bird[1] = new Texture("bird_wings_down.png");
        flyheight = Gdx.graphics.getHeight() / 2 - bird[0].getHeight() / 2;
        topTube = new Texture("top_tube.png");
        bottomTube = new Texture("bottom_tube.png");
        random = new Random();


    }

    @Override
    public void render() {
        batch.begin();
        batch.draw(background, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());

        batch.draw(topTube, Gdx.graphics.getWidth() / 2 - topTube.getWidth() / 2, Gdx.graphics.getHeight() / 2 + spaceBetweenTubes / 2);
        batch.draw(bottomTube, Gdx.graphics.getWidth() / 2 - bottomTube.getWidth() / 2, Gdx.graphics.getHeight() / 2 - spaceBetweenTubes / 2 - bottomTube.getHeight());


        if (Gdx.input.justTouched()) {
            Gdx.app.log("Tap", "блядзь!");
            gameStateFlag = 1;
        }
        if (gameStateFlag == 1) {




            if (Gdx.input.justTouched()) {
                fallingSpeed = -25;
               tubeShift=random.nextFloat()
            }
            if (flyheight > 0 || fallingSpeed < 0) {
                fallingSpeed++;
                flyheight -= fallingSpeed;
            }


        } else {
            if (Gdx.input.justTouched()) {
                Gdx.app.log("Tap", "блядзь!");
                gameStateFlag = 1;
            }
        }

        if (birdStateFlag == 0) {
            birdStateFlag = 1;
        } else {
            birdStateFlag = 0;
        }


        batch.draw(bird[birdStateFlag], Gdx.graphics.getWidth() / 2 - bird[birdStateFlag].getWidth() / 2, flyheight);
        batch.end();
    }

    @Override
    public void dispose() {

    }
}
