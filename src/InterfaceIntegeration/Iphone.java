package InterfaceIntegeration;
public class Iphone implements Call, SMS, Web, Picture
{
    @Override
    public void makeCall(String number)
    {
        System.out.println("Calling: 09123456789");
    }
    @Override
    public void takePic()
    {
        System.out.println("Picture: Click!");
    }
    @Override
    public void sendingSMS(String number, String message)
    {
        System.out.println("Messaging: 09123456789 - Hello!");
    }
    @Override
    public void browsingWeb(String url)
    {
        System.out.println("Browsing Youtube.com");
    }
}
