import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) {


        Wallet myWallet = new Wallet();
        CashBack cashBack=new CashBack();
        cashBack.getAmount(new Money(5000),"Google");


        myWallet.addMoney(new Money(1000));
        myWallet.addMoney(new Money(45.50));


        System.out.println("Balance check1: "+myWallet.checkBalance());

        myWallet.transactionMoneyTakenOut(new Money(500));
        myWallet.addMoney(new Money(100));
        System.out.println("Balance check2: "+myWallet.checkBalance());




    }

}
