package com.daniel.ethan.cs160design07;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.Arrays;

public class Search_Animal extends AppCompatActivity {
    String[] animals = { "Goldfish", "Golden Koi", "Golden Retriever", "German Shepard", "Turtle", "Maine Coon", "Husky", "Cockatoo", "Macaw", "Beagle", "Hamster", "Rat", "Chameleon", "Budgie"};
    ListView listView;
    ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_animal);
        Arrays.sort(animals);
        listView = findViewById(R.id.allAnimals);
        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, animals);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(((String)adapterView.getItemAtPosition(i)).equals("Goldfish")){
                    finish();
                    toInfo(null);
                }

            }
        });


        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle("Explore");
            actionBar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.primary)));

        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.nav_menu,menu);
        MenuItem menuItem = menu.findItem(R.id.search_bar);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setQueryHint("Search For Animal Here");
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                System.out.println(s);
                arrayAdapter.getFilter().filter(s);
                System.out.println(arrayAdapter.getCount());
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }

    public void toInfo(View view) {
        Intent intent = new Intent(this, AnimalInfo.class);
        startActivity(intent);
    }

}