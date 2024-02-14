package rvt.exercises;

public class CD implements Packable {
    private String artist;
    private String name;
    private int pubYear;
    private double weight = 0.1;

    public CD(String artist, String name, int pubYear) {
        this.artist = artist;
        this.name = name;
        this.pubYear = pubYear;
    }

    public String getArtist() {
        return this.artist;
    }

    public String getName() {
        return this.name;
    }

    public int getPubYear() {
        return this.pubYear;
    }

    public String toString() {
        return this.artist + ": " + this.name + " (" + pubYear + ")";
    }

    public double weight() {
        return this.weight;
    }
}
