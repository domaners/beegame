package com.domaners.honeycomber.input;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.domaners.honeycomber.Main;
import com.domaners.honeycomber.views.*;

public class DeathScreenInput {

	public static void Keyboard() {
		if(Gdx.input.isKeyPressed(Input.Keys.S)) {
			Main.viewMode = new InGame();
		}
	}
	
	public static void Touch() {
		if(Gdx.input.isTouched()) {
			Main.viewMode = new InGame();
		}
	}
	
}
