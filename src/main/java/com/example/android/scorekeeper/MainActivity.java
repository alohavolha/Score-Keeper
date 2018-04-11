package com.example.android.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int scoreLeftTeam = 0;
    int scoreRightTeam = 0;

    //  This method is called when Left Team scores a goal

    public void submitScoreLeft (View v) {
        scoreLeftTeam = scoreLeftTeam + 1;
        displayForLeftTeam(scoreLeftTeam);
    }

    // This method is called when Right Team scores a goal
    public void submitScoreRight (View v) {
        scoreRightTeam = scoreRightTeam + 1;
        displayForRightTeam(scoreRightTeam);
    }

    //This method is called when Left Team loses a score

    public void subtractScoreLeft (View v) {
        scoreLeftTeam = scoreLeftTeam - 1;
        displayForLeftTeam(scoreLeftTeam);
    }

    //This method is called when Right Team loses a score

    public void subtractScoreRight (View v) {
        scoreRightTeam = scoreRightTeam - 1;
        displayForRightTeam(scoreRightTeam);
    }

    //This method is called when Reset button is hit
    public void resetButton (View v) {
        displayForLeftTeam(scoreLeftTeam = 0);
        displayForRightTeam(scoreRightTeam = 0);
    }

    /**
     * Displays the given score for Left Team.
     */
    public void displayForLeftTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreLeftTeam);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Right Team.
     */
    public void displayForRightTeam(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreRightTeam);
        scoreView.setText(String.valueOf(score));
    }


}
