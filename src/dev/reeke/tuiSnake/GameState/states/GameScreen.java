package dev.reeke.tuiSnake.GameState.states;

import dev.reeke.tuiSnake.GameState.GameState;

public class GameScreen implements GameState {
    private static GameScreen gameState = new GameScreen();

    @Override 
    public void initState() {
        for (int i = 0; i < screen.length(); i++) {

        }
    }

    @Override 
    public void drawState() {
        
    }

    public GameScreen getState() {
        return gameState;
    }

    private GameScreen() {
        initState();
    };
}
