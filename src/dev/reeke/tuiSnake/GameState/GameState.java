package dev.reeke.tuiSnake.GameState;

import dev.reeke.tuiSnake.TUIScreen;
import dev.reeke.tuiSnake.Constants;

public interface GameState {
    TUIScreen screen = TUIScreen.getInstance();

    public void initState();
    public void drawState();

}
