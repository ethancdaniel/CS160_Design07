package com.daniel.ethan.cs160design07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SuppliesChecklist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supplies_checklist);
    }

    public void toInfo(View view) {
        Intent intent = new Intent(this, AnimalInfo.class);
        startActivity(intent);
    }

    public void toHome(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void toFoodInfo(View view) {
        Intent intent = new Intent(this, HelpfulLinks.class);
        startActivity(intent);
    }

    public void animalInfo(View view) {
        Intent intent = new Intent(this, AnimalInfo.class);
        startActivity(intent);
    }
}