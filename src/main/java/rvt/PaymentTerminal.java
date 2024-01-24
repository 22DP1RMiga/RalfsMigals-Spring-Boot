package rvt;

public class PaymentTerminal {
    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    // final makes the variables constant
    private final double AFFORDABLE_MEAL_PRICE = 2.50;
    private final double HEARTY_MEAL_PRICE = 4.30;

    public PaymentTerminal() {
        this.money = 1000.0;
    }

    // Part 2
    public double eatAffordably(double payment) {
        if (payment >= AFFORDABLE_MEAL_PRICE) {
            this.money += AFFORDABLE_MEAL_PRICE;
            this.affordableMeals++;
            return payment - AFFORDABLE_MEAL_PRICE;

        // testing
        } else if (payment <= AFFORDABLE_MEAL_PRICE) {
            this.money -= AFFORDABLE_MEAL_PRICE;
            return payment + AFFORDABLE_MEAL_PRICE;

        } else {
            return payment;
        }
    }

    public double eatHeartily(double payment) {
        if (payment >= HEARTY_MEAL_PRICE) {
            this.money += HEARTY_MEAL_PRICE;
            this.heartyMeals++;
            return payment - HEARTY_MEAL_PRICE;
        } else if (payment <= HEARTY_MEAL_PRICE) {
            this.money -= HEARTY_MEAL_PRICE;
            return payment + HEARTY_MEAL_PRICE;

        } else {
            return payment;
        }
    }

    // Part 3
    public boolean eatAffordably(PaymentCard card) {
        if (card.takeMoney(AFFORDABLE_MEAL_PRICE)) {
            this.affordableMeals++;
            return true;
        } else {
            return false;
        }
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.takeMoney(HEARTY_MEAL_PRICE)) {
            this.heartyMeals++;
            return true;
        } else {
            return false;
        }
    }

    // Part 4
    public void addMoneyToCard(PaymentCard card, double sum) {
        card.addMoney(sum);
        this.money += sum;
    }

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}