package com.example.animation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.animation.cardslider.cardSlider;

public class MainActivity extends AppCompatActivity {
    Button textWriter, shimmer_layout, space_TabLayout, Foldingcell, cardslider, circlemenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textWriter = findViewById(R.id.textWriter);
        shimmer_layout = findViewById(R.id.shimmer_layout);
        space_TabLayout = findViewById(R.id.space_TabLayout);
        Foldingcell = findViewById(R.id.Foldingcell);
        cardslider = findViewById(R.id.cardslider);
        circlemenu = findViewById(R.id.circlemenu);
        textWriter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, textWriter.class));
            }
        });
        shimmer_layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ShimmerLayout.class));
            }
        });
        space_TabLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, com.example.animation.spacetablayoutdemo.spaceTabLayout.class));
            }
        });
        Foldingcell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, com.example.animation.FoldingCell.Foldingcell.class));
            }
        });
        cardslider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, cardSlider.class));
            }
        });
        circlemenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, com.example.animation.circlemenu.circlemenu.class));
            }
        });
    }
}