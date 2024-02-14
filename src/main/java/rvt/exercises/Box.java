package rvt.exercises;
import java.util.ArrayList;

public class Box {
    private int maxCapacity;    // in kilograms
    private int itemCount;
    private double finalWeight;
    private ArrayList<Packable> items;
    
    public Box(int maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.itemCount = 0;
        this.finalWeight = 0;
        this.items = new ArrayList<>();
    }

    Book bookWeight = new Book();

    public void add(Packable obj) {
        if (finalWeight < maxCapacity) {
            finalWeight += 
        }
    }



    public String toString() {
        if (finalWeight < maxCapacity) {
            return "Box: " + itemCount + " items, total weight " + finalWeight + " kg";
        } else {
            return "The box has reached its capacity, please empty your box more!";
        }
    }
}
