package dev.reeke.tuiSnake.GameState.states;

import dev.reeke.tuiSnake.GameState.GameState;
import dev.reeke.tuiSnake.TUIScreen;

public class MenuScreen implements GameState  {
    private static MenuScreen gameState = new MenuScreen();

    @Override
    public void initState() {

    }

    @Override 
    public void drawState() {
        
    }



    public static MenuScreen getState() {
        return gameState;
    }

    private MenuScreen() {
        initState();
    };
}
