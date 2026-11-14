package dev.reeke.tuiSnake.gameState.states;

import dev.reeke.tuiSnake.gameState.GameState;
import dev.reeke.tuiSnake.screen.TUIScreen;

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
