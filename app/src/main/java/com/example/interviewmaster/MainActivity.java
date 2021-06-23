package com.example.interviewmaster;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.interviewmaster.activity.QuestionsActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    public static String nam;
    private Button mButton;
    EditText nameDisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameDisplay=(EditText) findViewById(R.id.name);
        mButton = findViewById(R.id.next);
        mButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view)
    {
        nam= (nameDisplay.getText().toString());
        switch (view.getId()) {
            case R.id.next:
                Intent one= new Intent(getApplicationContext(), QuestionsActivity.class);
                startActivity(one);
        }
    }

}