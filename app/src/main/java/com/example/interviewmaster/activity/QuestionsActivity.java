package com.example.interviewmaster.activity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.interviewmaster.R;
import com.example.interviewmaster.Score;
import com.example.interviewmaster.ques2;
import com.example.interviewmaster.util.QuestionProvider;
import com.example.interviewmaster.vo.QuestionVO;

import java.util.List;

public class QuestionsActivity extends AppCompatActivity implements View.OnClickListener{
    private RadioGroup radioGroup;
    public static int score;
    private Button mButton;
    private List<QuestionVO> questions;
    TextView qt;
    private RadioButton r1;
    private RadioButton r2;
    private RadioButton r3;
    private QuestionVO currentQuestion;
    private int currentIndex=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        mButton = findViewById(R.id.next1);
        mButton.setOnClickListener(this);
        questions = QuestionProvider.getQuestions();
        currentQuestion = questions.get(currentIndex);
        qt = findViewById(R.id.oneques);
        r1 = findViewById(R.id.aa);
        r2 = findViewById(R.id.ab);
        r3 = findViewById(R.id.ac);
        populateValues(currentQuestion);
    }

    private void populateValues(QuestionVO q) {
        qt.setText(q.getQtext());
        r1.setChecked(false);
        r2.setChecked(false);
        r3.setChecked(false);
        r1.setText(q.getOptions().get(0).getOptionText());
        r2.setText(q.getOptions().get(1).getOptionText());
        r3.setText(q.getOptions().get(2).getOptionText());
    }


    @Override
    public void onClick(View view)
    {
        RadioGroup rg = (RadioGroup) findViewById(R.id.radio_group1);

        final String value = ((RadioButton) findViewById(rg.getCheckedRadioButtonId())).getText().toString();
        if (value.equals(currentQuestion.getAnswer())) {
            score = score + 1;
        }
        currentIndex=currentIndex+1;
        if(currentIndex==questions.size()) {
            Intent one= new Intent(getApplicationContext(), Score.class);
            startActivity(one);
        } else {
            currentQuestion=questions.get(currentIndex);
            populateValues(currentQuestion);
        }
    }
}