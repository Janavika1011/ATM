
interface MessagingService {
    void sendMessage(String message);
}


class SMSMessagingService implements MessagingService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending SMS: " + message);
       
    }
}


class EmailMessagingService implements MessagingService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending Email: " + message);
       
    }
}

class WhatsAppMessagingService implements MessagingService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending WhatsApp message: " + message);
    }
}

public class MessageService {
    public static void main(String[] args) {
        SMSMessagingService smsService = new SMSMessagingService();
        EmailMessagingService emailService = new EmailMessagingService();
        WhatsAppMessagingService whatsappService = new WhatsAppMessagingService();
        
        smsService.sendMessage("Hello, this is an SMS!");
        emailService.sendMessage("Hi, this is an email!");
        whatsappService.sendMessage("Hey, this is a WhatsApp message!");
    }
}
