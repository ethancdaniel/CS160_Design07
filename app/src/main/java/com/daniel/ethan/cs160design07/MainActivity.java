package com.daniel.ethan.cs160design07;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

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

    }

    public void toSingularPost(View view) {
        Intent intent = new Intent(this, Singular_Post.class);
        startActivity(intent);
    }
}
