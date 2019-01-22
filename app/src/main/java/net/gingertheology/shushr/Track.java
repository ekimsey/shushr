package net.gingertheology.shushr;

import java.io.File;

public class Track {

    private File trackFile;
    private String trackName;

    public Track(File trackFile, String trackName) {
        this.trackFile = trackFile;
        this.trackName = trackName;
    }

    public File getTrackFile() {
        return this.trackFile;
    }

    public String getTrackName() {
        return this.trackName;
    }
}
