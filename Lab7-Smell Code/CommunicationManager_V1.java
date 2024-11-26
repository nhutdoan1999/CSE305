import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Message {
    private final String content;
    private final String sender;
    private final String recipient;

    public Message(String content, String sender, String recipient) {
        this.content = content;
        this.sender = sender;
        this.recipient = recipient;
    }

    public String getContent() {
        return content;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    @Override
    public String toString() {
        return String.format("From: %s, To: %s, Content: %s", sender, recipient, content);
    }
}

class MessagingService {
    private final Map<String, List<Message>> inbox;

    public MessagingService() {
        this.inbox = new HashMap<>();
    }

    public void sendMessage(String content, String sender, String recipient) {
        Message message = new Message(content, sender, recipient);
        inbox.computeIfAbsent(recipient, k -> new ArrayList<>()).add(message);
    }

    public List<Message> getMessagesForRecipient(String recipient) {
        return inbox.getOrDefault(recipient, new ArrayList<>());
    }

    public void printAllMessages() {
        inbox.forEach((recipient, messages) -> {
            System.out.println("Messages for: " + recipient);
            messages.forEach(System.out::println);
        });
    }
}

class MessagePrinter {
    public static void printMessageDetails(Message message) {
        System.out.println("Message Details:");
        System.out.println("Content: " + message.getContent());
        System.out.println("Sender (uppercase): " + message.getSender().toUpperCase());
        System.out.println("Recipient (lowercase): " + message.getRecipient().toLowerCase());
        System.out.println("Content Length: " + message.getContent().length());
    }
}

public class CommunicationManager_V1 {
    public static void main(String[] args) {
        MessagingService messagingService = new MessagingService();

        messagingService.sendMessage("Hello, tenant!", "Property Manager", "Tenant A");
        messagingService.sendMessage("Important notice: Rent due next week.", "Property Owner", "Tenant A");
        messagingService.sendMessage("Maintenance request received.", "Tenant A", "Property Manager");

        List<Message> tenantAMessages = messagingService.getMessagesForRecipient("Tenant A");
        System.out.println("\nMessages for Tenant A:");
        tenantAMessages.forEach(System.out::println);

        Message exampleMessage = new Message("Test Message", "Manager", "Tenant B");
        MessagePrinter.printMessageDetails(exampleMessage);

        System.out.println("\nAll Messages:");
        messagingService.printAllMessages();
    }
}
