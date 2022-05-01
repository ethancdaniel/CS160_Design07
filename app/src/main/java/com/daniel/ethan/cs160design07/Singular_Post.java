package com.daniel.ethan.cs160design07;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class Singular_Post extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singular_post);

        BottomNavigationView navBar = (BottomNavigationView) findViewById(R.id.home_bottom_nav);
        navBar.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId() == R.id.navigation_post){
                    addPost(null);
                    return false;
                }
                if(item.getItemId() == R.id.navigation_home){
                    toHome(null);
                    return false;
                }
                return false;
            }

        });

    }

    public void toHome(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void addPost(View view) {
        Intent intent = new Intent(this, CreatePost.class);
        startActivity(intent);
    }


}