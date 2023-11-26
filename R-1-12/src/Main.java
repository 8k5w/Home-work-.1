public class Main {
    public static void main(String[] args) {

    CreditCard card=  new CreditCard("John Bowman", "California Savings",
            "5391 0375 9387 5309", 5000,600);
    card.makePayment(1000);
        System.out.println(card.getBalance());
        card.makePayment(400);
        System.out.println(card.getBalance());
    }
}