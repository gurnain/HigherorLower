package com.example.gurnain.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random r = new Random();
    int rand;
    int userGuess = 0;

    public void higherLower(View v) {
        EditText editText = (EditText) findViewById(R.id.editText);
        if (editText.getText().toString().isEmpty()) {
            Toast.makeText(this, "Please enter a number", Toast.LENGTH_LONG).show();
        } else {
            userGuess = Integer.parseInt(editText.getText().toString());
            if (userGuess == rand){
                rand = r.nextInt(20) + 1;
                Toast.makeText(this, "You Got it! Try again", Toast.LENGTH_LONG).show();
            }
            else if (userGuess > rand) {
                Toast.makeText(this, "Lower!", Toast.LENGTH_LONG).show();
            }
            else {
                Toast.makeText(this, "Higher!", Toast.LENGTH_LONG).show();
            }
        }
    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rand = r.nextInt(20)+1;

        /*Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                higherLower(rand);
            }
        });*/
    }
}
