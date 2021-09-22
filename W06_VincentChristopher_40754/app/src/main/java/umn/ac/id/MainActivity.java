package umn.ac.id;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button Halaman1;
    private Button Halaman2;
    private Button Halaman3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Halaman1 = findViewById(R.id.Animasi);
        Halaman2 = findViewById(R.id.Drawable);
        Halaman3 = findViewById(R.id.Fisika);

        Halaman1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchActivityIntent = new Intent(MainActivity.this, MainActivity4.class);
                startActivity(switchActivityIntent);
            }
        });
        Halaman2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchActivityIntent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(switchActivityIntent);
            }
        });
        Halaman3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchActivityIntent = new Intent(MainActivity.this, MainActivity3.class);
                startActivity(switchActivityIntent);
            }
        });
    }
}