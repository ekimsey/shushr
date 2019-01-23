package net.gingertheology.shushr;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Spinner;

import net.gingertheology.shushr.Track;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    boolean isPlaying = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create MediaPlayer
        this.mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.shush_female);
        this.mediaPlayer.setLooping(true);
    }

    public void playAudio(View view) {
        final ImageButton playButton = (ImageButton) findViewById(R.id.playButton);

        if(this.mediaPlayer.isPlaying()) {
            //Log.d("Main", "Already playing! Pausing media.");
            playButton.setImageResource(android.R.drawable.ic_media_play);
            mediaPlayer.pause();
        } else {
            //Log.d("Main", "Not playing! Starting media.");
            playButton.setImageResource(android.R.drawable.ic_media_pause);
            mediaPlayer.start();
        }

        return;
    }

}
