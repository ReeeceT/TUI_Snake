package dev.reeke.tuiSnake;

import dev.reeke.tuiSnake.GameState.GameState;
import dev.reeke.tuiSnake.GameState.states.GameOver;
import dev.reeke.tuiSnake.GameState.states.GameScreen;
import dev.reeke.tuiSnake.GameState.states.MenuScreen;
import dev.reeke.tuiSnake.GameState.states.SettingsScreen;

import java.lang.Thread;

public class GameMaster {
    private final int UPDATE_SPEED;
    private GameState currentState;
    private boolean running = false;

    /**
     * This class is designed to handle game states, user input, and updating each frame.
     * 
     * @param UPDATE_SPEED - The amount of updates sent within one second.
     */
    public GameMaster() {
        this.UPDATE_SPEED = Constants.UPDATE_SPEED;
        running = true;

        TUIScreen.getInstance(); // Have to do this to make the constructor run, this is because static constructors are "lazy-loaded", and only run if the class gets referenced
        
        while (running) {
            // nextFrame(); // Just once
            end();
        }
    }

    /**
     * Next frame from the current state
     */
    private void nextFrame() {
        try {
            Thread.sleep(1000 / UPDATE_SPEED);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        GameScreen.getInstance().drawState();
        end();
    }

    private void end() {
        running = false;
    }


}
