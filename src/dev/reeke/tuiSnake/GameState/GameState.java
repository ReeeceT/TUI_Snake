package dev.reeke.tuiSnake.GameState;

import dev.reeke.tuiSnake.TUIScreen;

public interface GameState {
    final int SCREEN_HEIGHT = 16;
    final int SCREEN_WIDTH = 16;

    TUIScreen screen = new TUIScreen(SCREEN_HEIGHT * SCREEN_WIDTH);

    public void initState();
    public void drawState();

}
