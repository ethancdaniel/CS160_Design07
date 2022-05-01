package com.daniel.ethan.cs160design07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class CreateAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
    }

    public void toCreateAccount(View view) {
        CheckBox checkbox1 = (CheckBox)findViewById(R.id.checkBox);
        if (!checkbox1.isChecked()) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        } else {
            Intent intent = new Intent(this, VerifyAccount.class);
            startActivity(intent);
        }
    }
}