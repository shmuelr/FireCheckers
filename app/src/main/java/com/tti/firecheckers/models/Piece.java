package com.tti.firecheckers.models;

/**
 * Created by user on 12/6/15.
 */
public class Piece {
    private Color color;
    enum Color {
        BLACK,RED;


    }

    public Piece(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
