package com.example.outfitpickerapp;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Dresspage extends AppCompatActivity {

    TextView heartIcon;
    TextView casualWear, partyWear, weddingWear, universityWear;
    TextView exploreOutfits;
    TextView home, favourite, profile;

    EditText searchOutfit;

    boolean isFavourite = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dresspage);

        // Find IDs

        heartIcon = findViewById(R.id.heartIcon);

        casualWear = findViewById(R.id.casualWear);
        partyWear = findViewById(R.id.partyWear);
        weddingWear = findViewById(R.id.weddingWear);
        universityWear = findViewById(R.id.universityWear);

        exploreOutfits = findViewById(R.id.exploreOutfits);

        home = findViewById(R.id.home);
        favourite = findViewById(R.id.favourite);
        profile = findViewById(R.id.profile);

        searchOutfit = findViewById(R.id.searchOutfit);


        // Heart Favourite Button

        heartIcon.setOnClickListener(v -> {

            if (isFavourite) {

                heartIcon.setText("♡");
                isFavourite = false;

                Toast.makeText(this,
                        "Removed from Favourite",
                        Toast.LENGTH_SHORT).show();

            } else {

                heartIcon.setText("♥");
                isFavourite = true;

                Toast.makeText(this,
                        "Added to Favourite",
                        Toast.LENGTH_SHORT).show();
            }

        });


        // Casual Wear

        casualWear.setOnClickListener(v -> {

            Toast.makeText(this,
                    "Casual Wear Selected",
                    Toast.LENGTH_SHORT).show();

        });


        // Party Wear

        partyWear.setOnClickListener(v -> {

            Toast.makeText(this,
                    "Party Wear Selected",
                    Toast.LENGTH_SHORT).show();

        });


        // Wedding Wear

        weddingWear.setOnClickListener(v -> {

            Toast.makeText(this,
                    "Wedding Wear Selected",
                    Toast.LENGTH_SHORT).show();

        });


        // University Wear

        universityWear.setOnClickListener(v -> {

            Toast.makeText(this,
                    "University Wear Selected",
                    Toast.LENGTH_SHORT).show();

        });


        // Explore Outfits Button

        exploreOutfits.setOnClickListener(v -> {

            Toast.makeText(this,
                    "Explore Your Outfits",
                    Toast.LENGTH_SHORT).show();

        });


        // Bottom Navigation

        home.setOnClickListener(v -> {

            Toast.makeText(this,
                    "Home Page",
                    Toast.LENGTH_SHORT).show();

        });


        favourite.setOnClickListener(v -> {

            Toast.makeText(this,
                    "Favourite Page",
                    Toast.LENGTH_SHORT).show();

        });


        profile.setOnClickListener(v -> {

            Toast.makeText(this,
                    "Profile Page",
                    Toast.LENGTH_SHORT).show();

        });

    }
}