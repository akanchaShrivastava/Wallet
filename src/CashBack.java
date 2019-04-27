public class CashBack extends Wallet implements InterfaceDiscount {
int CashBack;
int balance;
String type;

    @Override
    public String getType() {


        return type;
    }

    @Override
    public int getAmount() {


        return 0;
    }
}
