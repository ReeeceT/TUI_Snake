package dev.reeke.tuiSnake.gameState.states;

import dev.reeke.tuiSnake.gameState.GameState;

public class Game implements GameState {
    private static Game game = new Game();
    private final int SCREEN_HEIGHT = GameState.screen.getHeight();
    private final int SCREEN_WIDTH = GameState.screen.getWidth();

    @Override 
    public void initState() {
        for (int row = 0; row < SCREEN_HEIGHT; row++) {
            for (int col = 0; col < SCREEN_WIDTH; col++) {
                GameState.screen.drawCharacter(row, col, 'O');
            }
        }
    }

    @Override 
    public void drawState() {
        GameState.screen.drawScreen();
    }

    public static Game getInstance() {
        return game;
    }

    private Game() {
        initState();
    };
}
