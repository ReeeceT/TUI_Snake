package dev.reeke.tuiSnake.gameState.states;

import dev.reeke.tuiSnake.gameState.GameState;
import dev.reeke.tuiSnake.screen.TUIScreen;

public class GameOver implements GameState  {
    private static GameOver gameOver = new GameOver();

    @Override
    public void initState() {

    }

    @Override 
    public void drawState() {

    }



    public static GameOver getInstance() {
        return gameOver;
    }

    private GameOver() {
        initState();
    };
}
