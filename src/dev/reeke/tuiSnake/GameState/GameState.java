package dev.reeke.tuiSnake.gameState;

import dev.reeke.tuiSnake.Constants;
import dev.reeke.tuiSnake.screen.TUIScreen;

public interface GameState {
    TUIScreen screen = TUIScreen.getInstance();

    public void initState();
    public void drawState();

}
