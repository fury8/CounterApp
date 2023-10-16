package com.example.counterapp;

import static com.example.counterapp.R.id.textViewid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int faten = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView mytxtview = findViewById(R.id.textViewid);
        Button mybtn = findViewById(R.id.buttonid);


        mybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mytxtview.setText(""+IncreseCounter());

                Toast.makeText(MainActivity.this,
                        "You Added One !",
                        Toast.LENGTH_SHORT).show();
            }
        });

    }

    public int IncreseCounter(){
        return ++faten;
    }

}