package com.hackingbuzz.audio2;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button play,pause;
    MediaPlayer musicPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        play = (Button)findViewById(R.id.play);
        pause = (Button) findViewById(R.id.pause);

        play.setOnClickListener(this);
        pause.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        if(v.getId() == R.id.play) {
            // when this button clicked ,,,mediaplayer is getting creted again n againg ..so u gonna hear so as many new audio files (same song) as many times button getting clicked..
             musicPlayer = MediaPlayer.create(this, R.raw.enkore); // its creating the song...to fix the ( start from beginging problem
            // media file just create 1 time..so put that in create() method..see next project for fix...if you didn;t get it Audio3

            musicPlayer.start(); // after pausing the song..it will  restart from the begining it will not start from where we life the playback..
                                        // because every time we press play button we creating media file again n again..it shoudnot happen...it will again start from begning when we press the play button

        }
        else if(v.getId() == R.id.pause) {

            musicPlayer.pause();
        }
    }
}
