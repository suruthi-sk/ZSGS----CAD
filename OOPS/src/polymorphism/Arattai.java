package polymorphism;

public class Arattai extends ChatApplication{
    private boolean isIndianOrigin = true;

    public Arattai(String appName, int activeUsers, boolean isEncrypted, String theme, double version, String parentOrganization, boolean isIndianOrigin) {
        super(appName, activeUsers, isEncrypted, theme, version, parentOrganization);
        this.isIndianOrigin = isIndianOrigin;
    }

    public boolean isIndianOrigin() {
        return isIndianOrigin;
    }

    public void setIndianOrigin(boolean indianOrigin) {
        isIndianOrigin = indianOrigin;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Message is sent successfully by Arattai. The message is "  + message);
    }

    @Override
    public void receiveMessage() {
        System.out.println("Message received successfully from Arattai");
    }

    @Override
    public void makeCalls() {
        System.out.println("Calling via Arattai......");
    }

    public void scheduleMeeting() {
        System.out.println("Meeting is scheduled successfully");
    }

    public void scheduleMeeting(boolean later) {
        System.out.println("Meeting is scheduled for later..");
    }

    public void display() {
        super.display();
        System.out.println("Origin: India");
    }
}
