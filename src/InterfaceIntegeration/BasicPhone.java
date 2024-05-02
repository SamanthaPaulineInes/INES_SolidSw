package InterfaceIntegeration;
public class BasicPhone implements Call, SMS
{
    @Override
    public void makeCall(String number)
    {
        System.out.println("Calling: " + number);
    }
    @Override
    public void sendingSMS(String number, String message)
    {
        System.out.print("Messaging: " + number + message);
    }
}
