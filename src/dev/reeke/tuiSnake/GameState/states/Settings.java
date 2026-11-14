package dev.reeke.tuiSnake.GameState.states;

import dev.reeke.tuiSnake.GameState.GameState;
import dev.reeke.tuiSnake.TUIScreen;

public class Settings implements GameState  {
    private static Settings gameState = new Settings();

    @Override
    public void initState() {

    }

    @Override 
    public void drawState() {
        
    }





    public static GameState getInstance() {
        return gameState;
    }

    private Settings() {
        initState();
    };
}
