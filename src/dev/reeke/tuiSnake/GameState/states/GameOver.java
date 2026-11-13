package dev.reeke.tuiSnake.GameState.states;

import dev.reeke.tuiSnake.GameState.GameState;
import dev.reeke.tuiSnake.TUIScreen;

public class GameOver implements GameState  {
    private static GameOver gameState = new GameOver();

    @Override
    public void initState() {

    }

    @Override 
    public void drawState() {

    }



    public static GameOver getInstance() {
        return gameState;
    }

    private GameOver() {
        initState();
    };
}
