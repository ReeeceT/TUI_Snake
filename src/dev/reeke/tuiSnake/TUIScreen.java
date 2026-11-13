package dev.reeke.tuiSnake;

import dev.reeke.tuiSnake.Constants;

/**
 * Wrapper class for managing the screen
 * 
 */
public class TUIScreen {
    private final int SCREEN_HEIGHT;
    private final int SCREEN_WIDTH;
    private final int TRUE_SCREEN_WIDTH;

    private static final TUIScreen TUIScreen = new TUIScreen(Constants.SCREEN_HEIGHT, Constants.SCREEN_WIDTH);
    private final char[] screen;
    

    private TUIScreen(final int SCREEN_HEIGHT, final int SCREEN_WIDTH) {
        this.SCREEN_HEIGHT = SCREEN_HEIGHT;
        this.SCREEN_WIDTH = SCREEN_WIDTH;
        TRUE_SCREEN_WIDTH = SCREEN_WIDTH + 1; // for '\n' at the end of each row

        screen = new char[SCREEN_HEIGHT * TRUE_SCREEN_WIDTH];
        initScreen();
    }

    public int cellCount() {
        return screen.length;
    }

    /**
     * 
     * X and Y are zero-indexed, meaning that the top-left pixel will be located at (0, 0) rather than (1, 1)
     * 
     * @param row - The x coordinate of the pixel to draw to. 
     * @param col - The y coordinate of the pixel to draw to.
     * @param c - The character to draw to that position.
     */
    public void drawCharacter(int row, int col, char c) {
        if (row >= SCREEN_HEIGHT) {
            System.out.println("Invalid row: " + row);
            return;
        }
        if (col >= SCREEN_WIDTH) {
            System.out.println("Invalid column: " + col);
            return;
        }

        screen[(row * SCREEN_WIDTH) + col] = c;
    }

    public char getCharacter(int row, int col) {
        return screen[(row * SCREEN_WIDTH) + col];
    }

    public int getHeight() {
        return SCREEN_HEIGHT;
    }

    public int getWidth() {
        return SCREEN_WIDTH;
    }

    public static TUIScreen getInstance() {
        return TUIScreen;
    }

    private void initScreen() {
        System.out.println("init screen");

        for (int row = 0; row < SCREEN_HEIGHT; row++) {
            
            for (int col = 0; col < TRUE_SCREEN_WIDTH; col++) {
                
                if (col == TRUE_SCREEN_WIDTH) {
                    screen[(row * TRUE_SCREEN_WIDTH) + col] = 't';
                    System.out.println("gur");
                }
            }
        }

        System.out.println(String.valueOf(screen));
    }
}
