package dev.reeke.tuiSnake.GameState.states;

import dev.reeke.tuiSnake.GameState.GameState;

public class GameScreen implements GameState {
    private static GameScreen gameState = new GameScreen();
    private char[] screen; // 1D array representing the primary game screen.

    @Override
    public GameScreen getState() {
        return gameState;
    }

    private GameScreen() {};
}
