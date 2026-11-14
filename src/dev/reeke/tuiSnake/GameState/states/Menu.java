package dev.reeke.tuiSnake.gameState.states;

import dev.reeke.tuiSnake.gameState.GameState;
import dev.reeke.tuiSnake.screen.TUIScreen;

public class Menu implements GameState  {
    private static Menu gameState = new Menu();

    @Override
    public void initState() {

    }

    @Override 
    public void drawState() {
        
    }



    public static Menu getInstance() {
        return gameState;
    }

    private Menu() {
        initState();
    };
}
