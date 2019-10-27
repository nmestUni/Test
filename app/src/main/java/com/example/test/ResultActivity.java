package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView result;
    private TextView resultDescription;
    private Button redo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Bundle extras = getIntent().getExtras();
        int score = extras != null ? extras.getInt("score") : 0;

        result = (TextView)findViewById(R.id.result);
        resultDescription = (TextView)findViewById(R.id.resultDescription);
        redo = (Button) findViewById(R.id.redo);

        result.setText(score+"");

        if (score >= 7) {
            resultDescription.setText("You have passed the quiz");
        } else {
            resultDescription.setText("You were not able to pass the quiz");
            redo.setVisibility(View.VISIBLE);
        }

        redo.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
    }
}
