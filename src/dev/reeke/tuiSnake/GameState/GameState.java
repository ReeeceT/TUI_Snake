package dev.reeke.tuiSnake.GameState;

public interface GameState {
    public final int SCREEN_HEIGHT = 8;
    public final int SCREEN_WIDTH = 8;

    /**
     * 
     * @return - The reference to this state
     */
    public GameState getState();


}
