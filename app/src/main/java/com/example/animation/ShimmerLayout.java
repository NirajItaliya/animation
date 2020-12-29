package com.example.animation;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.libraries.ShimmerLayout1;

public class ShimmerLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shimmer_layout);
        ShimmerLayout1 shimmerLayout = findViewById(R.id.shimmer_layout);
        shimmerLayout.startShimmerAnimation();
    }
}