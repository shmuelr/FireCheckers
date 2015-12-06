package com.tti.firecheckers;

import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.tti.firecheckers.models.Board;
import com.tti.firecheckers.models.Piece;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "com.tti.firecheckers" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Board board = new Board();
        board.setUpGame();
        Log.d(TAG, board.toString());
        Point p1 = new Point(2,2);
        Piece piece = board.getPiece(p1);
        Log.d(TAG, "piece " + piece);
        Point p2 = new Point(3,3);
        board.move(p1, p2);
        Log.d(TAG,board.toString());
    }
}
