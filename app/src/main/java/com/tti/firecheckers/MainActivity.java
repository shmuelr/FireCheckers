package com.tti.firecheckers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.tti.firecheckers.models.Board;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "com.tti.firecheckers" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Board board = new Board();
        board.setUpGame();
        Log.d(TAG,board.toString());
    }
}
