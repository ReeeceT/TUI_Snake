package dev.reeke.tuiSnake.gameState.states;

import dev.reeke.tuiSnake.gameState.GameState;

public class Game implements GameState {
    private static Game game = new Game();

    @Override 
    public void initState() {
        for (int row = 0; row < GameState.screen.getHeight(); row++) {
            for (int col = 0; col < GameState.screen.getWidth(); col++) {
                GameState.screen.drawCharacter(row, col, 'O');
            }
        }
    }

    @Override 
    public void drawState() {
        for (int row = 0; row < GameState.screen.getHeight(); row++) {
            for (int col = 0; col < GameState.screen.getWidth(); col++) {
                System.out.print(GameState.screen.getCharacter(row, col));
            }
        }
    }

    public static Game getInstance() {
        return game;
    }

    private Game() {
        initState();
    };
}
