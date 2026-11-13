package dev.reeke.tuiSnake.GameState.states;

import dev.reeke.tuiSnake.GameState.GameState;

public class MenuScreen implements GameState  {
    private static MenuScreen gameState = new MenuScreen();

    @Override
    public MenuScreen getState() {
        return gameState;
    }

    private MenuScreen() {};
}
