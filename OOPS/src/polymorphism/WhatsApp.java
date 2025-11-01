package polymorphism;

public class WhatsApp extends  ChatApplication{
    private boolean statusFeature;
    private boolean isCommunityAvailable;
    private int maxNoOfMembersInGroup;

    public WhatsApp(String appName, int activeUsers, boolean isEncrypted, String theme, double version, String parentOrganization, boolean statusFeature, boolean isCommunityAvailable, int maxNoOfMembersInGroup) {
        super(appName, activeUsers, isEncrypted, theme, version, parentOrganization);
        this.statusFeature = statusFeature;
        this.isCommunityAvailable = isCommunityAvailable;
        this.maxNoOfMembersInGroup = maxNoOfMembersInGroup;
    }

    public boolean isStatusFeature() {
        return statusFeature;
    }

    public void setStatusFeature(boolean statusFeature) {
        this.statusFeature = statusFeature;
    }

    public boolean isCommunityAvailable() {
        return isCommunityAvailable;
    }

    public void setCommunityAvailable(boolean communityAvailable) {
        isCommunityAvailable = communityAvailable;
    }

    public int getMaxNoOfMembersInGroup() {
        return maxNoOfMembersInGroup;
    }

    public void setMaxNoOfMembersInGroup(int maxNoOfMembersInGroup) {
        this.maxNoOfMembersInGroup = maxNoOfMembersInGroup;
    }

    // Overridden messages

    @Override
    public void sendMessage(String message) {
        System.out.println("Message is sent successfully by whatsapp. The message is "  + message);
    }

    @Override
    public void receiveMessage() {
        System.out.println("Message received successfully from whatsapp");
    }

    @Override
    public void makeCalls() {
        System.out.println("Calling via whatsapp......");
    }

    public void display() {
        super.display();
        System.out.println("Status feature: " + (isStatusFeature() ? "Enabled" : "Disabled"));
        System.out.println("Maximum group members count: " + getMaxNoOfMembersInGroup());
    }
}
