package rvt.exercises;

public class Book implements Packable {
    private String author;
    private String name;
    private double weight;

    public Book(String author, String name, double weight) {
        this.author = author;
        this.name = name;
        this.weight = weight;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getName() {
        return this.name;
    }

    public double getWeight() {
        return this.weight;
    }

    public String toString() {
        return this.author + ": " + this.name;
    }

    public double weight() {
        return this.weight;
    }
}
