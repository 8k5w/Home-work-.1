public class CreditCard {
    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;

    public CreditCard(String cust, String bk, String acnt, int lim, double initialBal) {
        customer = cust;
        bank = bk;
        account = acnt;
        limit = lim;
        balance = initialBal;
    }
    public CreditCard(String cust, String bk, String acnt, int lim) {
        this(cust, bk, acnt, lim, 0.0);
    }

    public String getCustomer( ) { return customer; }
    public String getBank( ) { return bank; }
    public String getAccount( ) { return account; }
    public int getLimit( ) { return limit; }
    public double getBalance( ) { return balance; }

    public boolean charge(double price) {
        if (price + balance > limit){
            return false;}
        else{
        balance += price;
        return true;}
    }
    public void makePayment(double amount) {

        if(amount<=balance){
            balance-=amount;

        }

    }
    public  void printSummary() {
        System.out.println("Customer = " + customer);
        System.out.println("Bank = " + bank);
        System.out.println("Account = " + account);
        System.out.println("Balance = " + balance); // implicit cast
        System.out.println("Limit = " + limit); // implicit cast
    }

}

