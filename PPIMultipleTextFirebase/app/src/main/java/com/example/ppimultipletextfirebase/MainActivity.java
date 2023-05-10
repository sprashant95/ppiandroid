package com.example.ppimultipletextfirebase;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    EditText id,name,city;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        id = findViewById(R.id.id);
        name = findViewById(R.id.name);
        city = findViewById(R.id.city);

        btn = findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pid = id.getText().toString();
                String pname = name.getText().toString();
                String pcity = city.getText().toString();

                DBHolder dbHolder = new DBHolder(pname,pcity);

                FirebaseDatabase db = FirebaseDatabase.getInstance();
                DatabaseReference dr = db.getReference("/students");

                dr.child(pid).setValue(dbHolder);

                id.setText("");
                name.setText("");
                city.setText("");
                Toast.makeText(MainActivity.this, "Data Inserted", Toast.LENGTH_SHORT).show();

            }
        });
    }
}