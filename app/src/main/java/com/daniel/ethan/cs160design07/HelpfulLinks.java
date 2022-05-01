package com.daniel.ethan.cs160design07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class HelpfulLinks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpful_links);
    }

    public void prevActivity(View view) {
        this.finish();
        super.onBackPressed();
    }

    
}