public class Main {
    public static void main(String[] args){
        CreditCard card=  new CreditCard("John Bowman", "California Savings",
                "5391 0375 9387 5309", 5000,600);
        card.charge(4500);
        System.out.println(card.getBalance());
        card.update_limit(6000);
        card.charge(4500);
        System.out.println(card.getBalance());

    }
}