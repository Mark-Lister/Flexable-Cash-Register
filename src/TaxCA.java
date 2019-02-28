public class TaxCA implements TaxBehaviour {
    public double calculateTax(double amount){
        if (amount > 100) {
            amount = amount + (amount * 0.075);
        }
        return amount;
    }
}