package com.example.interviewmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import com.example.interviewmaster.activity.QuestionsActivity;

public class Score extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        TextView nameDisp = (TextView)findViewById(R.id.nameDisp);
        nameDisp.setText(""+MainActivity.nam+", your score is:");
        TextView myAwesomeTextView = (TextView)findViewById(R.id.myAwesomeTextView);
        myAwesomeTextView.setText(""+(QuestionsActivity.score));

    }
}