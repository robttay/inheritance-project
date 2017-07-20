import java.time.LocalDateTime;

/**
 * Created by roberttaylor on 7/19/17.
 */
public class TextNotification extends Notification {
    private String recipient;
    private String smsProvider;


    public TextNotification(String subject, String body, String recipient, String smsProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smsProvider = smsProvider;
        super.status = "NEW";
        textPrinter();
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmsProvider() {
        return smsProvider;
    }
    @Override
    public void transport() {
        System.out.printf("recipient: %s\n smsProvider: %s", getRecipient(), getSmsProvider());
        System.out.println("createdAt: " + getCreatedAt() + "\n subject: " + getSubject() + "\n body: " + getBody());

    }
}
