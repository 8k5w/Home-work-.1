public class Main {
    // the first card that attempts to go over its limit is the second card with the limit of 3500.
    public static void main(String[] args)  {
         CreditCard[ ] wallet = new CreditCard[3];
         wallet[0] = new CreditCard("John Bowman", "California Savings",
                 "5391 0375 9387 5309", 5000);
         wallet[1] = new CreditCard("John Bowman", "California Federal",
                 "3485 0399 3395 1954", 3500);
         wallet[2] = new CreditCard("John Bowman", "California Finance",
                 "5391 0375 9387 5309", 2500, 300);

         for (double val = 600; val <= 2200; val+=100) {
             wallet[0].charge(3*val);
            wallet[1].charge(2*val);
             wallet[2].charge(val);
             }

         for (CreditCard card : wallet) {
             card.printSummary();

             }

    }
}