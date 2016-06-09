package com.bosnjakovic.ivan.screens;

import com.badlogic.gdx.Gdx;
import com.bosnjakovic.ivan.cbhelpers.InputHandler;
import com.bosnjakovic.ivan.gameworld.Renderer;
import com.bosnjakovic.ivan.gameworld.World;

/**
 * Created by Ivan Bosnjakovic on 30.3.2016..
 */


public class Screen implements com.badlogic.gdx.Screen {

    private World world;
    private Renderer renderer;
    private float runTime = 0;


    public Screen() {
        float screenWidth = Gdx.graphics.getWidth();
        float screenHeight = Gdx.graphics.getHeight();
        float gameWidth = 136;
        float gameHeight = screenHeight / (screenWidth / gameWidth);

        int midPointY = (int) (gameHeight / 2);

        world = new World(midPointY);
        renderer = new Renderer(world, (int) gameHeight, midPointY);

        Gdx.input.setInputProcessor(new InputHandler(world));
    }

    @Override
    public void render(float delta) {
        runTime += delta;
        world.update(delta);
        renderer.render(runTime);
    }

    @Override
    public void resize(int width, int height) {
        Gdx.app.log("GameScreen", "resizing");
    }

    @Override
    public void show() {
        Gdx.app.log("GameScreen", "show called");

    }

    @Override
    public void hide() {
        Gdx.app.log("GameScreen", "hide called");

    }

    @Override
    public void pause() {
        Gdx.app.log("GameScreen", "pause called");

    }

    @Override
    public void resume() {
        Gdx.app.log("GameScreen", "resume called");

    }

    @Override
    public void dispose() {


    }
}
