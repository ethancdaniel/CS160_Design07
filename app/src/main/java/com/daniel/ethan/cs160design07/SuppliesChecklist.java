package com.daniel.ethan.cs160design07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import java.util.ArrayList;

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
    public void onWaterTank (View view){
        int newPrice;
        CheckBox checkBox = (CheckBox)findViewById(R.id.WaterTank);
        TextView tv1 = (TextView)findViewById(R.id.price);
        int price = Integer.parseInt(tv1.getText().toString());
        if(checkBox.isChecked()){
             newPrice = price + 25;
        }else{
            newPrice = price - 25;
        }

        String newString = "" + newPrice;
        tv1.setText(newString);
    }
    public void onWaterFilter (View view){
        int newPrice;
        CheckBox checkBox = (CheckBox)findViewById(R.id.WaterFilter);
        TextView tv1 = (TextView)findViewById(R.id.price);
        int price = Integer.parseInt(tv1.getText().toString());
        if(checkBox.isChecked()){
            newPrice = price + 20;
        }else{
            newPrice = price - 20;
        }

        String newString = "" + newPrice;
        tv1.setText(newString);
    }
    public void onFood (View view){
        int newPrice;
        CheckBox checkBox = (CheckBox)findViewById(R.id.Food);
        TextView tv1 = (TextView)findViewById(R.id.price);
        int price = Integer.parseInt(tv1.getText().toString());
        if(checkBox.isChecked()){
            newPrice = price + 5;
        }else{
            newPrice = price - 5;
        }

        String newString = "" + newPrice;
        tv1.setText(newString);
    }
    public void onNet (View view){
        int newPrice;
        CheckBox checkBox = (CheckBox)findViewById(R.id.Net);
        TextView tv1 = (TextView)findViewById(R.id.price);
        int price = Integer.parseInt(tv1.getText().toString());
        if(checkBox.isChecked()){
            newPrice = price + 3;
        }else{
            newPrice = price - 3;
        }

        String newString = "" + newPrice;
        tv1.setText(newString);
    }
    public void onAquariumHeater (View view){
        int newPrice;
        CheckBox checkBox = (CheckBox)findViewById(R.id.AquariumHeater);
        TextView tv1 = (TextView)findViewById(R.id.price);
        int price = Integer.parseInt(tv1.getText().toString());
        if(checkBox.isChecked()){
            newPrice = price + 12;
        }else{
            newPrice = price - 12;
        }

        String newString = "" + newPrice;
        tv1.setText(newString);
    }
    public void onGravel(View view){
        int newPrice;
        CheckBox checkBox = (CheckBox)findViewById(R.id.Gravel);
        TextView tv1 = (TextView)findViewById(R.id.price);
        int price = Integer.parseInt(tv1.getText().toString());
        if(checkBox.isChecked()){
            newPrice = price + 3;
        }else{
            newPrice = price - 3;
        }

        String newString = "" + newPrice;
        tv1.setText(newString);
    }
    public void onWaterConditioner(View view){
        int newPrice;
        CheckBox checkBox = (CheckBox)findViewById(R.id.WaterConditioner);
        TextView tv1 = (TextView)findViewById(R.id.price);
        int price = Integer.parseInt(tv1.getText().toString());
        if(checkBox.isChecked()){
            newPrice = price + 5;
        }else{
            newPrice = price - 5;
        }

        String newString = "" + newPrice;
        tv1.setText(newString);
    }
    public void onLighting (View view){
        int newPrice;
        CheckBox checkBox = (CheckBox)findViewById(R.id.Lighting);
        TextView tv1 = (TextView)findViewById(R.id.price);
        int price = Integer.parseInt(tv1.getText().toString());
        if(checkBox.isChecked()){
            newPrice = price + 20;
        }else{
            newPrice = price - 20;
        }

        String newString = "" + newPrice;
        tv1.setText(newString);
    }
    public void onBuy (View view){
        ArrayList<CheckBox> checkBoxes = new ArrayList<>();
        CheckBox checkBox1 = (CheckBox)findViewById(R.id.WaterTank);
        CheckBox checkBox2 = (CheckBox)findViewById(R.id.WaterFilter);
        CheckBox checkBox3 = (CheckBox)findViewById(R.id.Lighting);
        CheckBox checkBox4 = (CheckBox)findViewById(R.id.Gravel);
        CheckBox checkBox5 = (CheckBox)findViewById(R.id.WaterConditioner);
        CheckBox checkBox6 = (CheckBox)findViewById(R.id.AquariumHeater);
        CheckBox checkBox7 = (CheckBox)findViewById(R.id.Net);
        CheckBox checkBox8 = (CheckBox)findViewById(R.id.Food);
        checkBoxes.add(checkBox1);
        checkBoxes.add(checkBox2);
        checkBoxes.add(checkBox3);
        checkBoxes.add(checkBox4);
        checkBoxes.add(checkBox5);
        checkBoxes.add(checkBox6);
        checkBoxes.add(checkBox7);
        checkBoxes.add(checkBox8);


        TextView tv1 = (TextView)findViewById(R.id.price);
        tv1.setText("" + 0);
        for(CheckBox tempCheckBox: checkBoxes){
            tempCheckBox.setChecked(false);
        }
    }
}