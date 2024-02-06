package rvt.temp;

public class Main {
    public static void main(String[] args) throws Exception {
        // Part 1
        System.out.println("Part 1:");
        A a = new A();
        B b = new B();
        C c = new C();

        a.a();
        b.b();
        c.c();

        // Part 2
        System.out.println("Part 2:");

        c.a();
        c.b();
        c.c();
    }
}
