package com.example.hammanna;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private final ArrayList<ListClub> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        ListView listView;
        ClubAdapter adapter;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for(int i=1; i<=10; i++) {
            list.add(new ListClub(R.drawable.club, "club" + i));
        }
        listView = findViewById(R.id.listClub);
        adapter = new ClubAdapter(list);
        listView.setAdapter(adapter);
    }
}