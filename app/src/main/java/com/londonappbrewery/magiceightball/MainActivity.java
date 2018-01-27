package com.londonappbrewery.magiceightball;
// David King  Jan 27, 2018
//Eight Ball Challenge

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView ballDisplay = (ImageView) findViewById(R.id.image_eightBall );

        final int[] ballArray = {
                R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,
                R.drawable.ball4,
                R.drawable.ball5
        };

        // create a button object and link it to our button on the screen
        Button myButton;
        myButton = (Button) findViewById(R.id.askButton);

        // create a LISTNER object to watch the button for actions
        // then tell it what to do if it ges pressed
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // When it is clicked do these things...
                // create a new random number generator object
                // named randomNumberGenerator
                Random randomNumberGenerator = new Random();

                // create an int variable to store a random number in
                // then call the number generator for a new number
                // and put it in the variable for use
                // the array has indexes from 0-4 so bound is 5
             int   number = randomNumberGenerator.nextInt(5);

                // change to image to the one pointed to in the ballArray
                // by the number variable
                ballDisplay.setImageResource(ballArray[number]);
            }
        });
    }




}
