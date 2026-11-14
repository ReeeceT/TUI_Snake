package dev.reeke.tuiSnake.screen;

import dev.reeke.tuiSnake.Constants;
import java.lang.StringBuilder;
import java.lang.Thread;

/**
 * Wrapper class for managing the screen
 * 
 */
public class TUIScreen {
    private final int SCREEN_HEIGHT;
    private final int MAX_HEIGHT_INDEX;

    private final int SCREEN_WIDTH;
    private final int MAX_WIDTH_INDEX;

    private final int NEW_LINE_COL;
    private boolean doInvalidColumn;

    private int H_PADDING;
    private StringBuilder sb_H;

    private final char[] screen;
    private static final TUIScreen TUIScreen = new TUIScreen(Constants.SCREEN_HEIGHT, Constants.SCREEN_WIDTH);
    
    private TUIScreen(final int SCREEN_HEIGHT, final int SCREEN_WIDTH) {
        this.SCREEN_HEIGHT = SCREEN_HEIGHT;
        this.MAX_HEIGHT_INDEX = SCREEN_HEIGHT - 1;

        this.SCREEN_WIDTH = SCREEN_WIDTH;
        this.MAX_WIDTH_INDEX = SCREEN_WIDTH - 1;

        H_PADDING = Constants.HORIZONTAL_PADDING;
        sb_H = new StringBuilder();
        sb_H.setLength(H_PADDING);
        
        NEW_LINE_COL = 1;
        doInvalidColumn = false;
        screen = new char[SCREEN_HEIGHT * (SCREEN_WIDTH + NEW_LINE_COL)];

        initScreen();
    }

    private void initScreen() {
        for (int row = 0; row <= MAX_HEIGHT_INDEX; row++) {
            for (int col = 0; col <= MAX_WIDTH_INDEX; col++) {
                if (col == MAX_WIDTH_INDEX) {
                    screen[getIndex(row, col)] = '~';
                    screen[getIndex(row, col) + NEW_LINE_COL] = '\n';
                } else {
                    screen[getIndex(row, col)] = '~';
                }
            }
        }

        doInvalidColumn = true;
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
        if (col > MAX_WIDTH_INDEX) {
            System.out.println("Invalid column   " + col);
        }
        if (row > MAX_HEIGHT_INDEX) {
            System.out.println("Invalid row      " + row);
        }
        
        screen[getIndex(row, col)] = c;
    }

    public void drawScreen() {
        doInvalidColumn = false;
        for (int i = 0; i <= H_PADDING; i++) sb_H.append(" ");

        for (int row = 0; row <= MAX_HEIGHT_INDEX; row++) {
            for (int col = 0; col <= MAX_WIDTH_INDEX + NEW_LINE_COL; col++) {
                System.out.print(sb_H.toString());
                System.out.print(screen[getIndex(row, col)]);
            }
        }

        doInvalidColumn = true;
    }

    /**
     * 
     * @param row - Select row, with 0 being the first row.
     * @param col - Select column, with 0 being the first column,
     * @return - The character at the specified row and column.
     */
    public char getCharacter(int row, int col) {
        if (col > MAX_WIDTH_INDEX) {
            System.out.println("Invalid column   " + col);
        }
        if (row > MAX_HEIGHT_INDEX) {
            System.out.println("Invalid row      " + row);
        }

        return screen[getIndex(row, col)];
    }

    /**
     * 
     * @param row - Select row, with 0 being the first row.
     * @param col - Select column, with 0 being the first column.
     * @return - The index of the screen array based on the specified row and column.
     */
    public int getIndex(int row, int col) {
        int trueWidth = SCREEN_WIDTH + NEW_LINE_COL;

        if (col > MAX_WIDTH_INDEX && doInvalidColumn) {
            System.out.println("Invalid column   " + col);
        }
        if (row > MAX_HEIGHT_INDEX) {
            System.out.println("Invalid row      " + row);
        }

        return (row * trueWidth) + col;
    }

    public int getHeight() {
        return SCREEN_HEIGHT;
    }

    public int getWidth() {
        return SCREEN_WIDTH;
    }

    /**
     * 
     * @return The length of the screen array, aka the amount of character cells.
     */
    public int cellCount() {
        return screen.length;
    }

    public static TUIScreen getInstance() {
        return TUIScreen;
    }
    
}
