package dev.reeke.tuiSnake.GameState.states;

import dev.reeke.tuiSnake.GameState.GameState;
import dev.reeke.tuiSnake.TUIScreen;

public class GameScreen implements GameState {
    private static GameScreen gameState = new GameScreen();

    @Override 
    public void initState() {
        for (int row = 0; row < screen.getHeight(); row++) {
            for (int col = 0; col < screen.getWidth(); col++) {
                screen.drawCharacter(row, col, 'O');
            }
        }
    }

    @Override 
    public void drawState() {
        for (int row = 0; row < screen.getHeight(); row++) {
            for (int col = 0; col < screen.getWidth(); col++) {
                System.out.print(screen.getCharacter(row, col));
            }
        }
    }

    public static GameScreen getInstance() {
        return gameState;
    }

    private GameScreen() {
        initState();
    };
}
