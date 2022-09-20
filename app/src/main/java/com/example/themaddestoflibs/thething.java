package com.example.themaddestoflibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class thething extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thething);
        Intent intent = getIntent();
        String[] textString = intent.getStringArrayExtra(MainActivity.MOVEY_ARRAY);

        TextView textView = findViewById(R.id.person1a);
        textView.setText(textString[0]);

        textView = findViewById(R.id.location1a);
        textView.setText(textString[1]);

        textView = findViewById(R.id.person2a);
        textView.setText(textString[2]);

        textView = findViewById(R.id.noun1a);
        textView.setText(textString[3]);

        textView = findViewById(R.id.animal1a);
        textView.setText(textString[4] + "!");

        textView = findViewById(R.id.vehicle1a);
        textView.setText(textString[5] + "s");

        textView = findViewById(R.id.noun2a);
        textView.setText(textString[6] + "s");

        textView = findViewById(R.id.feeling1a);
        textView.setText(textString[7]);

        textView = findViewById(R.id.animal1b);
        textView.setText(textString[4]);

        textView = findViewById(R.id.noun3a);
        textView.setText(textString[8] + ",");

        textView = findViewById(R.id.vehicle2a);
        textView.setText(textString[9]);

        textView = findViewById(R.id.swears1a);
        textView.setText("\"" + textString[10] + "!\"");

        textView = findViewById(R.id.person2b);
        textView.setText(textString[2]);

        textView = findViewById(R.id.location1b);
        textView.setText(textString[1]);

        textView = findViewById(R.id.feeling2a);
        textView.setText(textString[11] + ".");

        textView = findViewById(R.id.person1b);
        textView.setText(textString[0]);
    }
}