package com.uraall.flappybirdclone;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import java.util.Random;


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

    Random random;
    int tubeSpeed =2;
    int tubesNumber=5;
    float tubeX[]=new float[tubesNumber];
    float tubeShift[]=new float[tubesNumber];
    float distanceBetweenTubes;

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

        distanceBetweenTubes=Gdx.graphics.getWidth()/2;
        for (int i = 0; i < tubesNumber ; i++) {
            tubeX[i]=Gdx.graphics.getWidth() / 2 - topTube.getWidth() / 2 +i*distanceBetweenTubes;
            tubeShift[i]=(random.nextFloat() -0.5f) * (Gdx.graphics.getHeight() - spaceBetweenTubes - 700);
        }

    }

    @Override
    public void render() {
        batch.begin();
        batch.draw(background, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());


        if (Gdx.input.justTouched()) {
            Gdx.app.log("Tap", "блядзь!");
            gameStateFlag = 1;
        }
        if (gameStateFlag == 1) {

            if (Gdx.input.justTouched()) {
                fallingSpeed = -25;
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
        for (int i = 0; i < tubesNumber ; i++) {
            if (tubeX[i]<-topTube.getWidth()){
                tubeX[i]=tubesNumber*distanceBetweenTubes;
            }else{
                tubeX[i]-=tubeSpeed;
            }
            tubeX[i] -= tubeSpeed;
            batch.draw(topTube, tubeX[i], Gdx.graphics.getHeight() / 2 + spaceBetweenTubes / 2 + tubeShift[i]);
            batch.draw(bottomTube, tubeX[i], Gdx.graphics.getHeight() / 2 - spaceBetweenTubes / 2 - bottomTube.getHeight() + tubeShift[i]);
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
