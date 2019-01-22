package net.gingertheology.shushr;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.Spinner;

import net.gingertheology.shushr.Track;

public class MainActivity extends AppCompatActivity {
    Track[] trackList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create UI inputs
        final ImageButton playButton = (ImageButton) findViewById(R.id.playButton);
        final Spinner trackSelect = (Spinner) findViewById(R.id.trackSelect);

        // Create MediaPlayer
        MediaPlayer femaleShush = MediaPlayer.create(MainActivity.this, R.raw.shush_female);
        femaleShush.start();
    }

    private void playAudio() {
        return;
    }

    private void populateSpinner() {
        return;
    }
}
