package umn.ac.id;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.VideoView;

public class DetilAudioActivity extends AppCompatActivity {

    private TextView etJudul;
    private TextView etKeterangan;
    private String etUri;
    private Button play;
    private MediaPlayer music;
    private String uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detil_audio);
        etJudul = (TextView) findViewById(R.id.etJudul);
        etKeterangan = (TextView) findViewById(R.id.etKeterangan);
        play = (Button) findViewById(R.id.play);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        SumberVideo sv = (SumberVideo) bundle.getSerializable("DetilVideo");
        etJudul.setText(sv.getJudul());
        etKeterangan.setText(sv.getKeterangan());
        uri = sv.getVideoURI();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(sv.getJudul());
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    public void play(View v){
        if(music==null){
            music = MediaPlayer.create(this,Integer.parseInt(uri));
        }
        music.start();
    }
    @Override
    protected void onPause(){
        if(music != null){
            music.stop();
            music.reset();
        }
        super.onPause();
    }
}