public class TaxNY implements TaxBehaviour {
    public double calculateTax(double amount){
        amount = amount + (amount*0.08);
        return amount;
    }
}