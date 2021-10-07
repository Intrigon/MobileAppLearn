package umn.ac.id;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity {
    private Button next;
    private EditText username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        next = findViewById(R.id.next);
        username = findViewById(R.id.username);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentDua = new Intent(login.this, library.class);
                String username1 = username.getText().toString();
                if(username1.isEmpty()){
                    username.setError("Harap isi!!!");
                }else {
                    intentDua.putExtra("PesanDariMain", username1);
                    startActivity(intentDua);
                }
            }
        });
    }
}