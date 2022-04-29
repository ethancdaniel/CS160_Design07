package com.daniel.ethan.cs160design07;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

public class Search_Animal extends AppCompatActivity {
    String[] animals = { "Goldfish", "Golden Koi", "Golden Retriever", "German Shepard", "Turtle", "Maine Coon", "Husky", "Cockatoo", "Macaw", "Beagle", "Hamster", "Rat", "Chameleon", "Budgie"};
    ListView listView;
    ArrayAdapter<String> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_animal);
        listView = findViewById(R.id.allAnimals);
        arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, animals);
        listView.setAdapter(arrayAdapter);
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

}