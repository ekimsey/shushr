package net.gingertheology.shushr;

import android.app.Service;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;
    Service mediaService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create MediaPlayer if necessary
        if (this.mediaPlayer == null) {
            this.mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.shush_female);
            this.mediaPlayer.setLooping(true);

            // Make sure the media player will acquire a wake-lock while
            // playing. If we don't do that, the CPU might go to sleep while the
            // song is playing, causing playback to stop.
            //this.mediaPlayer.setWakeMode(mediaService.getApplicationContext(), PowerManager.PARTIAL_WAKE_LOCK);
        }
    }

    public void playAudio(View view) {
        final ImageButton playButton = findViewById(R.id.playButton);

        if (this.mediaPlayer.isPlaying()) {
            Log.d("Main", "Already playing! Pausing media.");
            playButton.setImageResource(android.R.drawable.ic_media_play);
            mediaPlayer.pause();
        } else {
            Log.d("Main", "Not playing! Starting media.");
            playButton.setImageResource(android.R.drawable.ic_media_pause);
            mediaPlayer.start();
        }
    }
}
