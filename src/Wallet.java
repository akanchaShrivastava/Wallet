public class Wallet {
   // private double initialMoneyBalance=0;
    private double netBalance=0;
    private Person owner;


    public void addMoney(Money amount) {
        netBalance = netBalance+amount.getValue();
        System.out.println(netBalance);




    }

    public boolean takeOutMoney(Money amount) {

        if(netBalance < amount.getValue())
            return false;

        netBalance = netBalance - amount.getValue();
        System.out.println("netBalance :"+netBalance);

        return true;
    }

    public double checkBalance() {

        return netBalance;

    }
}
