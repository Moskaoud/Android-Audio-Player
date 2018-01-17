package com.example.android.musicplayer;

import android.media.Image;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        final MediaPlayer mediaPlayer ;//= new MediaPlayer();//.create(this,R.raw.hussari1);
        mediaPlayer=MediaPlayer.create(this,R.raw.hussari1);

        Button playButton= (Button) findViewById(R.id.play_button);
        playButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
                Toast.makeText(getApplicationContext(),"Playing",Toast.LENGTH_SHORT).show();
            }
        });

        Button pauseButton = (Button) findViewById(R.id.pause_button);
        pauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.pause();
                Toast.makeText(getApplicationContext(),"Paused",Toast.LENGTH_SHORT);
            }
        });
        Button muteButton = (Button) findViewById(R.id.mute_button);
        muteButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                    mediaPlayer.setVolume(0,0);
            }
        });

    }
}
