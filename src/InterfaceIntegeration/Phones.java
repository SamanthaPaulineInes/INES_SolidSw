package InterfaceIntegeration;
public class Phones
{
    public static void main(String[] args)
    {
        BasicPhone basicPhone = new BasicPhone();
        System.out.println("\nBasicPhone:");
        basicPhone.makeCall("09123456789");
        basicPhone.sendingSMS("09123456789", " - Hello!");

        Samsung samsung = new Samsung();
        System.out.println("\n\nSamsung:");
        samsung.makeCall("09123456789");
        samsung.sendingSMS("09123456789", " - Hello from France!");
        samsung.browsingWeb("www.youtube.com");
        samsung.takePic();

        Iphone iPhone = new Iphone();
        System.out.println("\nSamsung:");
        iPhone.makeCall("09123456789");
        iPhone.sendingSMS("09123456789", " - Hello from Japan!");
        iPhone.browsingWeb("www.snapchat.com");
        iPhone.takePic();
    }
}
