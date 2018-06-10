package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void threePointScore(View view) {
        score = score + 3;
        displayForTeamA(score);
    }

    public void twoPointScore(View view) {
        score = score + 2;
        displayForTeamA(score);
    }

    public void freeThrowScore(View view) {
        score = score + 1;
        displayForTeamA(score);
    }

    /**
     * Displays the given score for Team A.
     */
    private void displayForTeamA (int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }



}
