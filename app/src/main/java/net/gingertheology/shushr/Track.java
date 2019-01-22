package net.gingertheology.shushr;

public class Track {

    private int trackFile;
    private String trackName;

    public Track(int trackFile, String trackName) {
        this.trackFile = trackFile;
        this.trackName = trackName;
    }

    public int getTrackFile() {
        return this.trackFile;
    }

    public String getTrackName() {
        return this.trackName;
    }
}
