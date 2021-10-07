package umn.ac.id;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.LinkedList;

public class library extends AppCompatActivity {
    RecyclerView rvDaftarVideo;
    DaftarAudioAdapter mAdapter;
    LinkedList<SumberVideo> daftarVideo = new LinkedList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);
        rvDaftarVideo = (RecyclerView) findViewById(R.id.recyclerView);
        mAdapter = new DaftarAudioAdapter(this, daftarVideo);
        rvDaftarVideo.setAdapter(mAdapter);
        rvDaftarVideo.setLayoutManager(new LinearLayoutManager(this));
        Intent intent = getIntent();
        getSupportActionBar().setTitle(intent.getStringExtra("PesanDariMain"));
        isiDaftarAudio();
        showToast(intent.getStringExtra("PesanDariMain"));
    }
    public void isiDaftarAudio(){
        daftarVideo.add(new SumberVideo("Dun Dun",
                "SFX",
                 Integer.toString(R.raw.dun_dun_dun)));
        daftarVideo.add(new SumberVideo("Help me",
                "SFX",
                Integer.toString(R.raw.help_me)));
        daftarVideo.add(new SumberVideo("Illuminati",
                "SFX",
                Integer.toString(R.raw.illuminati)));
        daftarVideo.add(new SumberVideo("Kenan Why",
                "SFX",
                Integer.toString(R.raw.kenan_why)));
        daftarVideo.add(new SumberVideo("Roblox Death",
                "SFX",
                Integer.toString(R.raw.roblox_death)));
        daftarVideo.add(new SumberVideo("Why are",
                "SFX",
                Integer.toString(R.raw.why_are)));
    }
    public void showToast(String username){
        Context context = getApplicationContext();
        CharSequence text = "Selamat datang, " + username;
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_library,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id==R.id.home){
            Intent intent = new Intent(library.this, MainActivity.class);
            startActivity(intent);
        }else{
            Intent intent = new Intent(library.this, profile.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
}