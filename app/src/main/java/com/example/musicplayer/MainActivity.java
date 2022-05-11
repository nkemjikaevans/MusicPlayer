package com.example.musicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Find the View that shows the Rock category
        TextView Rock = findViewById(R.id.Rock);

        // Set a click listener on that View
        Rock.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the Rock View is clicked on.
            @Override
            public void onClick(View view) {
                //a new Intent to open the @link RockActivity
                Intent RockIntent = new Intent(MainActivity.this, RockActivity.class);
                startActivity(RockIntent);
            }
        });


        // Find the View that shows the hiphop category
        TextView HipHop = findViewById(R.id.HipHop);

        // Set a click listener on that View
        HipHop.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the hiphop View is clicked on.
            @Override
            public void onClick(View view) {
                //a new Intent to open the @link HipHopActivity
                Intent HipHopIntent = new Intent(MainActivity.this, HipHopActivity.class);
                startActivity(HipHopIntent);
            }
        });


        // Find the View that shows the blues category
        TextView blues = findViewById(R.id.Blues);

        // Set a click listener on that View
        blues.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the blues View is clicked on.
            @Override
            public void onClick(View view) {
                //a new Intent to open the @link BluesActivity
                Intent bluesIntent = new Intent(MainActivity.this, BluesActivity.class);
                startActivity(bluesIntent);
            }

        });
    }

}
