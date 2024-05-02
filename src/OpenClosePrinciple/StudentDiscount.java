package OpenClosePrinciple;
public class StudentDiscount implements Discount
{

    @Override
    public double totalDiscount(double amount)
    {
        return amount * 0.5;
    }
}
