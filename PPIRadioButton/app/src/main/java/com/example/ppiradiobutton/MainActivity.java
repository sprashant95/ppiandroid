package com.example.ppiradiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    RadioButton yes, no, maybe;
    FloatingActionButton fab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        maybe = findViewById(R.id.maybe);
        fab = findViewById(R.id.floatingActionButton);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (yes.isChecked()){
                    Toast.makeText(MainActivity.this, "You selected YES", Toast.LENGTH_SHORT).show();
                }
                else if (no.isChecked()){
                    Toast.makeText(MainActivity.this, "You Selected NO", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "You Selected DO NOT DISCLOSE", Toast.LENGTH_SHORT).show();
                }
                
            }
        });
    }
}