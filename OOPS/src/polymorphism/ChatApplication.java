package polymorphism;

public class ChatApplication {
    private String appName;
    private int activeUsers;
    private boolean isEncrypted;
    private String theme;
    private double version;
    private String parentOrganization;

    // constructor

    public ChatApplication(String appName, int activeUsers, boolean isEncrypted, String theme, double version, String parentOrganization) {
        this.appName = appName;
        this.activeUsers = activeUsers;
        this.isEncrypted = isEncrypted;
        this.theme = theme;
        this.version = version;
        this.parentOrganization = parentOrganization;
    }

    // getters and setters

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public int getActiveUsers() {
        return activeUsers;
    }

    public void setActiveUsers(int activeUsers) {
        this.activeUsers = activeUsers;
    }

    public boolean isEncrypted() {
        return isEncrypted;
    }

    public void setEncrypted(boolean encrypted) {
        isEncrypted = encrypted;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public String getParentOrganization() {
        return parentOrganization;
    }

    public void setParentOrganization(String parentOrganization) {
        this.parentOrganization = parentOrganization;
    }

    // normal methods
    public void sendMessage(String message) {
        System.out.println("Message is sent successfully by chat Application. The message is "  + message);
    }

    public void receiveMessage() {
        System.out.println("Message received successfully...");
    }

    public void makeCalls() {
        System.out.println("Calling via chat Application......");
    }

    public void showNotification() {
        System.out.println("Notification received....");
    }

    public void display() {
        System.out.println("App name: " + getAppName());
        System.out.println("Active users: " + getActiveUsers());
        System.out.println("Theme: " + getTheme());
        System.out.println("Version: " + getVersion());
        System.out.println("Parent organization: " + getActiveUsers());
    }
}
