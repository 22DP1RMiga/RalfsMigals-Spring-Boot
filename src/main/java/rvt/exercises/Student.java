package rvt.exercises;

public class Student extends Person {
    private int Credits;

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void study() {
        this.Credits++;
    }

    public int credits() {
        return this.Credits;
    }

    public String toString() {
        return name + "\n " + address + "\n" + " Study credits " + this.Credits;
    }
}
