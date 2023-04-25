package com.example.ppiimagebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void androidClicked(View view) {
        Intent intent = new Intent(MainActivity.this,AndroidActivity.class);
        startActivity(intent);
    }

    public void angularjsClicked(View view) {
    }
}