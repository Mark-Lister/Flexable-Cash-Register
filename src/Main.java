public class Main {

    public static void main(String[] args) {

        CashRegister registerNoPattern = new CashRegister();
        registerNoPattern.setTaxBehaviour(new TaxTH());
        registerNoPattern.recordPurchase(60);
        registerNoPattern.recordPurchase(40);
        //registerNoPattern.calculateTaxThailand();
        registerNoPattern.enterPayment(200);

        double change = registerNoPattern.giveChange();
        System.out.println(change);
    }
}