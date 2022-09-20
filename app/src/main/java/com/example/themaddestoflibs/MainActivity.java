package com.example.themaddestoflibs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String MOVEY_ARRAY = "StringArray";
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void sendMessage(View view)
    {
        EditText[] textArray = {
                findViewById(R.id.person1),
                findViewById(R.id.location),
                findViewById(R.id.person2),
                findViewById(R.id.nown1),
                findViewById(R.id.animal),
                findViewById(R.id.vehicle1),
                findViewById(R.id.noun2),
                findViewById(R.id.feeling1),
                findViewById(R.id.nown3),
                findViewById(R.id.vehicle),
                findViewById(R.id.swears),
                findViewById(R.id.feeling2)
        };

        String[] stringArray = {
                "person1", // 0
                "location",
                "person2",
                "noun1",
                "animal",
                "vehicle", // 5
                "noun2",
                "feeling1",
                "noun3",
                "vehicle",
                "swears", // 10
                "feeling2"
        };
        Intent intent = new Intent(this, thething.class);

        for (int i = 0; i < textArray.length; i++)
        {
            stringArray[i] = textArray[i].getText().toString();

        }
        intent.putExtra(MOVEY_ARRAY, stringArray);
        startActivity(intent);
    }
}