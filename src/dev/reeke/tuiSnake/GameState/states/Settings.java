package dev.reeke.tuiSnake.gameState.states;

import dev.reeke.tuiSnake.gameState.GameState;
import dev.reeke.tuiSnake.screen.TUIScreen;

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
