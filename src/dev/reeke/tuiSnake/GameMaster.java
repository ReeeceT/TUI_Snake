package dev.reeke.tuiSnake;

import dev.reeke.tuiSnake.states.GameScreen;

public class GameMaster {
    private final int UPDATE_SPEED;

    /**
     * 
     * @param SCREEN_HEIGHT - The height of the TUI game window
     * @param SCREEN_WIDTH - The width of the TUI game window
     * @param UPDATE_SPEED - The amount of updates sent within one second.
     */
    public GameMaster(final int SCREEN_HEIGHT, final int SCREEN_WIDTH, final int UPDATE_SPEED) {
        new GameScreen(SCREEN_WIDTH, SCREEN_HEIGHT);
        this.UPDATE_SPEED = UPDATE_SPEED;
    }


}
