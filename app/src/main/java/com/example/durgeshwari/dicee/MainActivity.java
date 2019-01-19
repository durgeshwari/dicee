package com.example.durgeshwari.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button rollBack;
        rollBack=(Button)findViewById(R.id.rollbutton);
        final ImageView leftdice;
        leftdice=(ImageView)findViewById(R.id.leftdice);
        final ImageView rightdice;
        rightdice=(ImageView)findViewById(R.id.rightdice);
        final int[] diceArray={
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6};
        rollBack.setOnClickListener(new OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.d("dicee","button clicked");
                Random randomNumberGenerator= new Random();
                int number=randomNumberGenerator.nextInt(6);
                Log.d("dicee", "the random number generated is: "+number);
                leftdice.setImageResource(diceArray[number]);
                Random randomNumberGenerator2=new Random();
                int number2=randomNumberGenerator2.nextInt(6);
                rightdice.setImageResource(diceArray[number2]);
            }
        });
    }
}
