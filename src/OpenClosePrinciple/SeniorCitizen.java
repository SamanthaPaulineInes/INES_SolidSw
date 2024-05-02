package OpenClosePrinciple;

public class SeniorCitizen implements Discount
{
    @Override
    public double totalDiscount(double amount)
    {
        return amount * 0.10;
    }
}
