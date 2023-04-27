package com.example.ppisimplelistview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailedActivity extends AppCompatActivity {

    ImageView dimage;
    TextView dname,ddate;
    Button btn;

    int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailed);

        dimage = findViewById(R.id.dimage);
        dname = findViewById(R.id.dname);
        ddate = findViewById(R.id.ddate);

        btn = findViewById(R.id.button);
        Intent intent = getIntent();
        String ddname = intent.getStringExtra("name");
        String dddate = intent.getStringExtra("date");
        int ddimage = intent.getIntExtra("image",R.drawable.cnkb);
        String ddlink = intent.getStringExtra("link");

        dname.setText(ddname);
        ddate.setText(dddate);
        dimage.setImageResource(ddimage);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Uri uri = Uri.parse(ddlink); // missing 'http://' will cause crashed
                    Intent intent1 = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(intent1);

            }
        });

    }
}