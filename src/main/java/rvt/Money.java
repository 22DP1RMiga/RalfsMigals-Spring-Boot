package rvt;

public class Money {
    // Main part
    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "€";
    }

    // Part 1: Plus

    public Money plus(Money addition) {
        int newEuros = this.euros + addition.euros;
        int newCents = this.cents + addition.cents;

        if (newCents >= 100) {
            newCents -= 100;
            newEuros++;
        }
        return new Money(newEuros, newCents);
    }


    // Part 2: Less

    public boolean lessThan(Money compared) {

        boolean value = true;

        if (this.euros > compared.euros) {
            value = false;
        } else if (this.euros == compared.euros) {
            if (this.cents > compared.cents) {
                value = false;
            } else {
                value = true;
            }
        } else {
            value = true;
        }

        return value;
    }

    // Part 3: Minus

    public Money minus(Money decreaser) {

        int NewEuros = this.euros - decreaser.euros;
        int NewCents = this.cents - decreaser.cents;

        if (NewCents <= 0) {
            NewEuros--;
            NewCents = 100 + NewCents;
        }

        if (this.euros - decreaser.euros <= 0) {
            return new Money(0, 0);
        } else {
            return new Money(NewEuros, NewCents);
        }
    }

    public static void main(String[] args) throws Exception {

        // Part 1
        System.out.println("Part 1: Plus\n");

        Money macins1 = new Money(10,0);
        Money macins2 = new Money(5,0);

        Money macins3 = macins1.plus(macins2);

        System.out.println(macins1);  // 10.00e
        System.out.println(macins2);  // 5.00e
        System.out.println(macins3);  // 15.00e

        macins1 = macins1.plus(macins3);          // NB: a new Money object is created, and is placed "at the end of the strand connected to a"
        //  the old 10 euros at the end of the strand disappears and the Java garbage collector takes care of it

        System.out.println(macins1);  // 25.00e
        System.out.println(macins2);  // 5.00e
        System.out.println(macins3);  // 15.00e

        // Part 2

        System.out.println(".....................................................");
        System.out.println("Part 2: Less\n");

        Money macins4 = new Money(10, 0);
        Money macins5 = new Money(3, 0);
        Money macins6 = new Money(5, 0);

        System.out.println(macins4.lessThan(macins5));  // false
        System.out.println(macins5.lessThan(macins6));  // true

        // Part 3

        System.out.println(".....................................................");
        System.out.println("Part 3: Minus\n");

        Money macins7 = new Money(10, 0);
        Money macins8 = new Money(3, 50);

        Money macins9 = macins7.minus(macins8);

        System.out.println(macins7);  // 10.00e
        System.out.println(macins8);  // 3.50e
        System.out.println(macins9);  // 6.50e

        macins9 = macins9.minus(macins7);       // NB: a new Money object is created, and is placed "at the end of the strand connected to c"
        //  the old 6.5 euros at the end of the strand disappears and the Java garbage collector takes care of it

        System.out.println(macins7);  // 10.00e
        System.out.println(macins8);  // 3.50e
        System.out.println(macins9);  // 0.00e
    }
}