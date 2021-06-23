package com.example.interviewmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.interviewmaster.activity.QuestionsActivity;

public class ques2 extends AppCompatActivity implements View.OnClickListener{
    private RadioGroup radioGroup;
    private Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques2);
        mButton = findViewById(R.id.next2);
        mButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        RadioGroup rg = (RadioGroup) findViewById(R.id.radio_group2);

        final String value = ((RadioButton) findViewById(rg.getCheckedRadioButtonId())).getText().toString();
        if (value.equals("29")) {
            QuestionsActivity.score = QuestionsActivity.score + 1;
            //System.out.println(Questions.score);
        }
        switch (view.getId()) {
            case R.id.next2:
                Intent one= new Intent(getApplicationContext(),Score.class);
                startActivity(one);
        }
    }
}