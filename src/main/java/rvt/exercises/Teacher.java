package rvt.exercises;

public class Teacher extends Person {
    private int salary;

    public Teacher(String name, String address, int salary) {
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public String toString() {
        return name + "\n " + address + "\n" + " salary " + this.salary + " euro/month";
    }
}
