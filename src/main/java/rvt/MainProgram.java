package rvt;

public class MainProgram {
    public static void main(String[] args) {
        // Part 1
        PaymentCard petesCard = new PaymentCard(10);

        System.out.println("money " + petesCard.balance());
        boolean wasSuccessful = petesCard.takeMoney(8);
        System.out.println("successfully withdrew: " + wasSuccessful);
        System.out.println("money " + petesCard.balance());

        wasSuccessful = petesCard.takeMoney(4);
        System.out.println("successfully withdrew: " + wasSuccessful);
        System.out.println("money " + petesCard.balance());

        // Part 2, 3 and 4
        System.out.println("-----------------------------------------------------------------------------------");
        
        PaymentTerminal unicafeExactum = new PaymentTerminal();

        // For Part 2
        // double change = unicafeExactum.eatAffordably(10);
        // change = unicafeExactum.eatAffordably(5);
        // System.out.println("remaining change " + change);

        // change = unicafeExactum.eatHeartily(4.3);
        // System.out.println("remaining change " + change);

        System.out.println(unicafeExactum);

        // For Part 3
        // double change = unicafeExactum.eatAffordably(10);
        // System.out.println("remaining change " + change);

        // PaymentCard annesCard = new PaymentCard(7);

        // boolean WasSuccessful = unicafeExactum.eatHeartily(annesCard);
        // System.out.println("there was enough money: " + WasSuccessful);
        // WasSuccessful = unicafeExactum.eatHeartily(annesCard);
        // System.out.println("there was enough money: " + WasSuccessful);
        // WasSuccessful = unicafeExactum.eatAffordably(annesCard);
        // System.out.println("there was enough money: " + WasSuccessful);


        // For Part 4
        PaymentCard annesCard = new PaymentCard(2);

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        boolean WasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + WasSuccessful);

        unicafeExactum.addMoneyToCard(annesCard, 100);

        WasSuccessful = unicafeExactum.eatHeartily(annesCard);
        System.out.println("there was enough money: " + WasSuccessful);

        System.out.println("amount of money on the card is " + annesCard.balance() + " euros");

        System.out.println(unicafeExactum);
    }
}