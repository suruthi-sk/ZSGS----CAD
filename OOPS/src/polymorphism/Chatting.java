package polymorphism;

public class Chatting {
    public static void main(String[] args) {
        ChatApplication whatsApp = new WhatsApp("WhatsApp", 40000, true, "dark", 1.2, "Meta", true, true, 1000);
        ChatApplication messenger = new Messenger("Messenger", 30000, false, "light", 2.3, "Meta", true, true, "Purple");
        ChatApplication arattai = new Arattai("Arattai", 10000, true, "dark", 3.1, "Zoho", true);

        System.out.println("WhatsApp....");
        whatsApp.display();
        whatsApp.sendMessage("Hi there, I am using whatsApp!");
        whatsApp.receiveMessage();
        whatsApp.makeCalls();
        whatsApp.showNotification();
        System.out.println();

        System.out.println("Messenger........");
        messenger.display();
        messenger.sendMessage("A quick welcome message from messenger");
        messenger.receiveMessage();
        messenger.showNotification();
        System.out.println();

        System.out.println("Arattai..........");
        arattai.display();
        arattai.sendMessage("Hey there, I am using arattai");
        arattai.receiveMessage();
        arattai.makeCalls();
        arattai.showNotification();
        System.out.println();
    }
}
