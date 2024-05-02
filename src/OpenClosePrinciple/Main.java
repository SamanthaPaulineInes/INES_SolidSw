package OpenClosePrinciple;

public class Main
{
    Customer student = new Customer("Alice", new StudentDiscount());
    Customer seniorCitizen = new Customer("Bob", new SeniorCitizenDi());
    Customer regular = new Customer("Charlie", new RegularDiscount());

    double amount = 100.0;

    // Calculating and applying discounts for each customer
    double studentDiscountedAmount = studentCustomer.applyDiscount(amount);
    double seniorDiscountedAmount = seniorCustomer.applyDiscount(amount);
    double regularDiscountedAmount = regularCustomer.applyDiscount(amount);

    // Printing out the discounted amounts
        System.out.println("Amount after discount for student: $" + studentDiscountedAmount);
        System.out.println("Amount after discount for senior citizen: $" + seniorDiscountedAmount);
        System.out.println("Amount after discount for regular customer: $" + regularDiscountedAmount);
}