package umn.ac.id;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button Halaman1,Halaman2,Halaman3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Halaman1 = findViewById(R.id.button1);
        Halaman2 = findViewById(R.id.button2);
        Halaman3 = findViewById(R.id.button3);

        Halaman1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchActivityIntent = new Intent(MainActivity.this, AsyncTask.class);
                startActivity(switchActivityIntent);
            }
        });
        Halaman2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchActivityIntent = new Intent(MainActivity.this, ALoader.class);
                startActivity(switchActivityIntent);
            }
        });
        Halaman3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchActivityIntent = new Intent(MainActivity.this, SS.class);
                startActivity(switchActivityIntent);
            }
        });
    }

}