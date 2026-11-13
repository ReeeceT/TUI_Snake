package dev.reeke.tuiSnake.GameState.states;

import dev.reeke.tuiSnake.GameState.GameState;
import dev.reeke.tuiSnake.TUIScreen;

public class SettingsScreen implements GameState  {
    private static SettingsScreen gameState = new SettingsScreen();

    @Override
    public void initState() {

    }

    @Override 
    public void drawState() {
        
    }





    public static GameState getState() {
        return gameState;
    }

    private SettingsScreen() {
        initState();
    };
}
