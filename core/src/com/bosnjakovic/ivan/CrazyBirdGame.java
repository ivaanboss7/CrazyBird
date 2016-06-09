package com.bosnjakovic.ivan;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.bosnjakovic.ivan.cbhelpers.AssetLoader;
import com.bosnjakovic.ivan.screens.Screen;

public class CrazyBirdGame extends Game {
	@Override
	public void create() {
		Gdx.app.log("App created", "Created");
		AssetLoader.load();
		setScreen(new Screen());
	}

	@Override
	public void dispose() {
		super.dispose();
		AssetLoader.dispose();
	}
}