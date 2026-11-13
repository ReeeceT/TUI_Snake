package dev.reeke.tuiSnake.GameState.states;

import dev.reeke.tuiSnake.GameState.GameState;

public class GameOver implements GameState  {
    private static GameOver gameState = new GameOver();





    public static GameOver getState() {
        return gameState;
    }

    private GameOver() {
        initState();
    };
}
