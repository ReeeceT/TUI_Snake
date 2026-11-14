package dev.reeke.tuiSnake.GameState.states;

import dev.reeke.tuiSnake.GameState.GameState;
import dev.reeke.tuiSnake.TUIScreen;

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
