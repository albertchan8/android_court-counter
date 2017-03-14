package com.example.achan.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final int VALUE_OF_THREES = 3;
    public static final int VALUE_OF_TWOS = 2;
    public static final int VALUE_OF_FREETHROW = 1;
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score of Team A by 3.
     */
    public void addThreePointsTeamA(View view) {
        scoreTeamA = scoreTeamA + VALUE_OF_THREES;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score of Team A by 2.
     */
    public void addTwoPointsTeamA(View view) {
        scoreTeamA = scoreTeamA + VALUE_OF_TWOS;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score of Team A by 1.
     */
    public void addOnePointTeamA(View view) {
        scoreTeamA = scoreTeamA + VALUE_OF_FREETHROW;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score of Team B by 3.
     */
    public void addThreePointsTeamB(View view) {
        scoreTeamB = scoreTeamB + VALUE_OF_THREES;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score of Team A by 2.
     */
    public void addTwoPointsTeamB(View view) {
        scoreTeamB = scoreTeamB + VALUE_OF_TWOS;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score of Team A by 1.
     */
    public void addOnePointTeamB(View view) {
        scoreTeamB = scoreTeamB + VALUE_OF_FREETHROW;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Decrease score for Team A by 1.
     */
    public void removePointTeamA(View view) {
        if (scoreTeamA != 0) {
            scoreTeamA = scoreTeamA - 1;
            displayForTeamA(scoreTeamA);
        }
    }

    /**
     * Decrease score for Team B by 1.
     */
    public void removePointTeamB(View view) {
        if (scoreTeamB != 0) {
            scoreTeamB = scoreTeamB - 1;
            displayForTeamB(scoreTeamB);
        }
    }

    /**
     * Reset score for Team A to 0.
     */
    public void resetScoreTeamA(View view) {
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Reset scores for Team B to 0.
     */
    public void resetScoreTeamB(View view) {
        scoreTeamB = 0;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Reset scores for both teams to 0.
     */
    public void resetScoreAll(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
