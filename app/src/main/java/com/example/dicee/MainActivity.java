package com.example.dicee;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button rollButton;
        rollButton=(Button)findViewById(R.id.rollButton);
        final ImageView leftDice=(ImageView) findViewById(R.id.ld);
        final ImageView rightDice=(ImageView) findViewById(R.id.rd);
        final int[] dicearray={
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };
        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee","The Button has been pressed");
                Random newRandNum= new Random();
                int m1=newRandNum.nextInt(6);
                Log.d("Dicee","Random Number Generated is "+m1);
                leftDice.setImageResource(dicearray[m1]);
                int m2=newRandNum.nextInt(6);
                Log.d("Dicee","Random Number Generated is "+m2);
                rightDice.setImageResource(dicearray[m2]);
            }
        });

    }
}
