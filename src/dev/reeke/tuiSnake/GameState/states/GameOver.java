package dev.reeke.tuiSnake.GameState.states;

import dev.reeke.tuiSnake.GameState.GameState;

public class GameOver implements GameState  {
    private static GameOver gameState = new GameOver();

    @Override
    public GameOver getState() {
        return gameState;
    }

    private GameOver() {};
}
