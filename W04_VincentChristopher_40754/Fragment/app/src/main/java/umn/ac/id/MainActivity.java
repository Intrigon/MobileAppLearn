package umn.ac.id;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button Halaman1;
    private Button Halaman2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Halaman1 = findViewById(R.id.main_button_change_1);
        Halaman2 = findViewById(R.id.main_button_change_2);

        Halaman2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent switchActivityIntent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(switchActivityIntent);
            }
        });
//        Halaman2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent switchActivityIntent = new Intent(MainActivity.this, ThirdActivity.class);
//                startActivity(switchActivityIntent);
//            }
//        });
    }
}