package dev.reeke.tuiSnake;

import dev.reeke.tuiSnake.GameState.states.GameScreen;
import dev.reeke.tuiSnake.GameState.GameState;

public class GameMaster {
    private final int UPDATE_SPEED;
    private GameState currentState;

    /**
     * This class is designed to handle game states, user input, and updating each frame.
     * 
     * @param UPDATE_SPEED - The amount of updates sent within one second.
     */
    public GameMaster(int UPDATE_SPEED) {
        this.UPDATE_SPEED = UPDATE_SPEED;
    }

    /**
     * Next frame from the current state
     */
    private void update() {

    }


}
