package dev.reeke.tuiSnake;

/**
 * Wrapper class for managing the screen
 * 
 */
public class TUIScreen {
    private final int SCREEN_HEIGHT;
    private final int SCREEN_WIDTH;

    private final char[] screen;

    public TUIScreen(final int SCREEN_HEIGHT, final int SCREEN_WIDTH) {
        this.SCREEN_HEIGHT = SCREEN_HEIGHT;
        this.SCREEN_WIDTH = SCREEN_WIDTH;

        screen = new char[SCREEN_HEIGHT * SCREEN_WIDTH];
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
}
