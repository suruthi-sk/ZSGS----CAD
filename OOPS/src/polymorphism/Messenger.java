package polymorphism;

public class Messenger extends ChatApplication{
    private boolean integratedWithInsta;
    private boolean canSupportReaction;
    private String chatColorTheme;

    public Messenger(String appName, int activeUsers, boolean isEncrypted, String theme, double version, String parentOrganization, boolean integratedWithInsta, boolean canSupportReaction, String chatColorTheme) {
        super(appName, activeUsers, isEncrypted, theme, version, parentOrganization);
        this.integratedWithInsta = integratedWithInsta;
        this.canSupportReaction = canSupportReaction;
        this.chatColorTheme = chatColorTheme;
    }

    public boolean isIntegratedWithInsta() {
        return integratedWithInsta;
    }

    public void setIntegratedWithInsta(boolean integratedWithInsta) {
        this.integratedWithInsta = integratedWithInsta;
    }

    public boolean isCanSupportReaction() {
        return canSupportReaction;
    }

    public void setCanSupportReaction(boolean canSupportReaction) {
        this.canSupportReaction = canSupportReaction;
    }

    public String getChatColorTheme() {
        return chatColorTheme;
    }

    public void setChatColorTheme(String chatColorTheme) {
        this.chatColorTheme = chatColorTheme;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println("Message is sent via Messenger -- > " + message);
    }

    @Override
    public void makeCalls() {
        System.out.println("Please upgrade to make Calls...");
    }

    public void makeCalls(boolean upgraded) {
        System.out.println("Calling via messenger........");
    }

    public void giveFollowRequest() {
        System.out.println("Follow request is sent successfully...");
    }

    public void display() {
        super.display();
        System.out.println("Integrated with instagram: " + (isIntegratedWithInsta() ? "Yes" : "No"));
        System.out.println("Reaction support: " + (isCanSupportReaction() ? "Enabled" : "Disabled"));
        System.out.println("Chat colour Theme: " + getChatColorTheme());
    }
}
