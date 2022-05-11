package com.daniel.ethan.cs160design07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AnimalInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal_info);
    }

    public void toHome(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void toChecklist(View view) {
        Intent intent = new Intent(this, SuppliesChecklist.class);
        startActivity(intent);
    }

    public void toResolvedPosts(View view) {
        Intent intent = new Intent(this, ResolvedPosts.class);
        startActivity(intent);
    }

    public void toSearch(View view) {
        Intent intent = new Intent(this, Search_Animal.class);
        startActivity(intent);
    }
}