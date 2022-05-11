package com.daniel.ethan.cs160design07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ResolvedPosts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resolved_posts);
    }

    public void toMedicineChecklist(View view) {
        Intent intent = new Intent(this, MedicineSupplies.class);
        startActivity(intent);
    }

    public void petInfo(View view) {
        Intent intent = new Intent(this, AnimalInfo.class);
        startActivity(intent);
    }
}