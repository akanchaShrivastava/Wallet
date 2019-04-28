public class CashBack extends Wallet implements InterfaceDiscount {
double CashBack;
double balance;

    public void setType(String type) {
        this.type = type;
    }

    String type;

    @Override
    public String getType() {


        return type;
    }

    @Override
    public double getAmount(Money money, String type) {
//balance=wallet.transactionMoneyTakenOut(Money amount);
       balance=money.getValue();

       if(type == "GooglePay"&& balance>500)
       {
           CashBack=balance*.02;
           balance=balance+CashBack;
           System.out.println(balance);
       }else if (type=="Amazon"&& balance>1000){
            CashBack=balance*.02;
            balance=balance+CashBack;
           System.out.println(balance);
        }



        return balance;

    }
}
