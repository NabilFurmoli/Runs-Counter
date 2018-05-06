package com.example.android.cricketrunscounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int runs_A=0;
    int runs_B=0;
    int players_left_A=10;
    int players_left_B=10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void oneRun_A(View v){
        runs_A= runs_A+1;
        displayScoreTeamA(runs_A);
    }
    public void fourRun_A(View v){
        runs_A= runs_A+4;
        displayScoreTeamA(runs_A);
    }
    public void sixRun_A(View v){
        runs_A= runs_A+6;
        displayScoreTeamA(runs_A);
    }
    public void playerOut_A(View v){
        players_left_A--;
        displayPlayerLeftTeamA(players_left_A);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayScoreTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.text_A2_view);
        scoreView.setText(String.valueOf(score));
    }
    public void displayPlayerLeftTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.text_A_player_left2_view);
        scoreView.setText(String.valueOf(score));
    }

    public void oneRun_B(View v){
        runs_B= runs_B+1;
        displayScoreTeamB(runs_B);
    }
    public void fourRun_B(View v){
        runs_B= runs_B+4;
        displayScoreTeamB(runs_B);
    }
    public void sixRun_B(View v){
        runs_B= runs_B+6;
        displayScoreTeamB(runs_B);
    }
    public void playerOut_B(View v){
        players_left_B--;
        displayPlayerLeftTeamB(players_left_B);
    }

    public void _reset( View v){
        runs_A=0;
        runs_B=0;
        players_left_A=10;
        players_left_B=10;
        displayScoreTeamA(runs_A);
        displayScoreTeamB(runs_B);
        displayPlayerLeftTeamA(players_left_A);
        displayPlayerLeftTeamB(players_left_B);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayScoreTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.text_B2_view);
        scoreView.setText(String.valueOf(score));
    }
    public void displayPlayerLeftTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.text_B_player_left2_view);
        scoreView.setText(String.valueOf(score));
    }

}


