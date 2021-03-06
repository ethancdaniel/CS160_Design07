package com.daniel.ethan.cs160design07;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle(R.string.home_action_title);
            actionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.primary)));

        }

        BottomNavigationView navBar = (BottomNavigationView) findViewById(R.id.home_bottom_nav);
        navBar.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if(item.getItemId() == R.id.navigation_post){
                   addPost(null);
                    return false;
                }
                if (item.getItemId() == R.id.navigation_explore) {
                    finish();
                    toSearch(null);
                }
                return false;
            }

        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.search:
                finish();
                toSearch(null);

        }
        return super.onOptionsItemSelected(item);
    }

    public void toSingularPost(View view) {
        Intent intent = new Intent(this, Singular_Post.class);
        startActivity(intent);
    }

    public void addPost(View view) {
        Intent intent = new Intent(this, CreatePost.class);
        startActivity(intent);
    }

    public void toSearch(View view) {
        Intent intent = new Intent(this, Search_Animal.class);
        startActivity(intent);
    }


}
