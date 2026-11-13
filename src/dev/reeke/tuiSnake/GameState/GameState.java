package dev.reeke.tuiSnake.GameState;

import dev.reeke.tuiSnake.TUIScreen;
import dev.reeke.tuiSnake.Constants;

public interface GameState {
    TUIScreen screen = new TUIScreen(Constants.SCREEN_HEIGHT, Constants.SCREEN_WIDTH);

    public void initState();
    public void drawState();

}
