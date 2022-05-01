package com.daniel.ethan.cs160design07;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
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

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle(R.string.view_post);
            actionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.primary)));
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
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

    // this event will enable the back
    // function to the button on press
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
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