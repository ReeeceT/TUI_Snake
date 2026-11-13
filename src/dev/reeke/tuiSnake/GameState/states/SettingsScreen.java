package dev.reeke.tuiSnake.GameState.states;

import dev.reeke.tuiSnake.GameState.GameState;

public class SettingsScreen implements GameState  {
    private static SettingsScreen gameState = new SettingsScreen();

    @Override
    public SettingsScreen getState() {
        return gameState;
    }

    private SettingsScreen() {};
}
