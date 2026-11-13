package dev.reeke.tuiSnake.GameState.states;

import dev.reeke.tuiSnake.GameState.GameState;
import dev.reeke.tuiSnake.TUIScreen;

public class GameScreen implements GameState {
    private static GameScreen gameState = new GameScreen();

    @Override 
    public void initState() {
        for (int i = 0; i < screen.getWidth(); i++) {
            for (int j = 0; j < screen.getHeight(); j++) {
                screen.drawCharacter(j, i, 'O');
            }
        }
    }

    @Override 
    public void drawState() {
        for (int i = 0; i < screen.getWidth(); i++) {
            for (int j = 0; j < screen.getHeight(); j++) {
                System.out.print(screen.getCharacter(j, i));
            }

            System.out.print("\n");
        }
    }

    public static GameScreen getState() {
        return gameState;
    }

    private GameScreen() {
        initState();
    };
}
