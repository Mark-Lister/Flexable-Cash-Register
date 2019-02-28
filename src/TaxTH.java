public class TaxTH implements TaxBehaviour {
    public double calculateTax(double amount){
        amount = amount + (amount*0.07);
        return amount;
    }
}
