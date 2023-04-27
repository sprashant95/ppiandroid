package com.example.ppisimplelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String[] name = {"Mission Majnu","Rana Naidu","Pathan","Rocket Boys 2",
            "Shehzada","Gaslight","Chor Nikal Ke Bhaga",
            "Mission Majnu","Rana Naidu","Pathan","Rocket Boys 2",
            "Shehzada","Gaslight","Chor Nikal Ke Bhaga",
            "Mission Majnu","Rana Naidu","Pathan","Rocket Boys 2",
            "Shehzada","Gaslight","Chor Nikal Ke Bhaga"};

    String[] dates = {"Dec 2021","Jan 2021","Feb 2022","March 2022",
            "Dec 2021","Jan 2021","Feb 2022",
            "Dec 2021","Jan 2021","Feb 2022","March 2022",
            "Dec 2021","Jan 2021","Feb 2022",
            "Dec 2021","Jan 2021","Feb 2022","March 2022",
            "Dec 2021","Jan 2021","Feb 2022"};

    int[] images = {R.drawable.mm,R.drawable.rn,R.drawable.p,R.drawable.rb,
    R.drawable.s,R.drawable.gl,R.drawable.cnkb,
            R.drawable.mm,R.drawable.rn,R.drawable.p,R.drawable.rb,
            R.drawable.s,R.drawable.gl,R.drawable.cnkb,
            R.drawable.mm,R.drawable.rn,R.drawable.p,R.drawable.rb,
            R.drawable.s,R.drawable.gl,R.drawable.cnkb};

    String[] links = {"https://www.youtube.com/watch?v=Gw77Nx4eBMc",
            "https://www.youtube.com/watch?v=pAEvzLGVu9g",
            "https://www.youtube.com/watch?v=Ymu9wVN7pWs",
            "https://www.youtube.com/watch?v=Gw77Nx4eBMc",
            "https://www.youtube.com/watch?v=pAEvzLGVu9g",
            "https://www.youtube.com/watch?v=Ymu9wVN7pWs",
            "https://www.youtube.com/watch?v=pAEvzLGVu9g"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        MyCustomAdapter customAdapter = new MyCustomAdapter(this,name,dates,images);
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this,DetailedActivity.class);

                intent.putExtra("name",name[i]);
                intent.putExtra("date",dates[i]);
                intent.putExtra("image",images[i]);
                intent.putExtra("link",links[i]);

                startActivity(intent);
            }
        });

    }
}