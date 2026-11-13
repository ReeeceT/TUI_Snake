package dev.reeke.tuiSnake;

import dev.reeke.tuiSnake.GameState.states.GameScreen;
import dev.reeke.tuiSnake.GameState.GameState;

public class GameMaster {
    private final int UPDATE_SPEED;
    private GameState currentState;

    /**
     * This class is designed to handle game states, user input, and updating each frame.
     * 
     * @param SCREEN_HEIGHT - The height of the TUI game window
     * @param SCREEN_WIDTH - The width of the TUI game window
     * @param UPDATE_SPEED - The amount of updates sent within one second.
     */
    public GameMaster(final int SCREEN_HEIGHT, final int SCREEN_WIDTH, final int UPDATE_SPEED) {
        new GameScreen(SCREEN_WIDTH, SCREEN_HEIGHT);
        this.UPDATE_SPEED = UPDATE_SPEED;

        currentState = 
    }

    /**
     * Next frame from the current state
     */
    private void update() {

    }


}
