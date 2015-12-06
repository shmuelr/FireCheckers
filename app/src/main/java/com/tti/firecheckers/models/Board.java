package com.tti.firecheckers.models;

import android.util.Log;
import android.view.View;

/**
 * Created by user on 12/6/15.
 */
public class Board {
    private Color color;
    private Piece[][] boardArray = new Piece[8][8];

    enum Color {
        BLACK, WHITE;

    }
      public Board(){

      }
    public Board(Color color, Piece[][] boardArray) {
        this.color = color;
        this.boardArray = boardArray;
    }

    public Piece[][] getBoardArray() {
        return boardArray;
    }

    public void setBoardArray(Piece[][] boardArray) {
        this.boardArray = boardArray;
    }

    /*
    *   0 1 0 1 0 1 0 1
    *   1 0 1 0 1 o 1 o
    *   0 1 0 1 0 1 0 1
    *   1 0 1 0 1 o 1 o
    *   0 1 0 1 0 1 0 1
    *   1 0 1 0 1 o 1 o
    *   0 2 0 1 0 1 0 1
    *   2 0 2 0 2 o 2 o
    *
    *
    * */
    public void setUpGame() {
        int i, j;
        for (i = 0; i < boardArray.length; i++) {
            for (j = 0; j < boardArray.length; j++) {
                if ((i % 2 == 0&&j % 2 == 0)||(i % 2 != 0&&j % 2 != 0) ){
                    if (i < 3) {
                        Piece blackPiece = new Piece(Piece.Color.BLACK);
                        boardArray[i][j]=blackPiece;
                    } else if (i > 4) {
                        Piece redPeice = new Piece(Piece.Color.RED);
                        boardArray[i][j]=redPeice;
                    } else {
                        break;
                    }

                }
            }
        }

    }

    @Override
    public String toString() {
        int i,j;
        StringBuilder builder = new StringBuilder();

        for(i=0;i<boardArray.length;i++){
            for(j=0;j<boardArray.length;j++){

                if(boardArray[i][j] ==null){
                    builder.append(".");
                }
                else if (boardArray[i][j].getColor().equals(Piece.Color.BLACK)) {
                    builder.append("b");

                } else if (boardArray[i][j].getColor().equals(Piece.Color.RED)) {
                    builder.append("r");
                }

            }
            builder.append("\n");
        }

        return builder.toString();
    }
}
