import java.time.LocalDateTime;

/**
 * Created by roberttaylor on 7/19/17.
 */
public class Main {

    public static void main(String[] args) {
    EmailNotification emailNotification = new EmailNotification("Important", "Payroll must be submitted by Wednesday", "Joe Java", "BellSouth");
    emailNotification.transport();
    emailNotification.showStatus();
    TextNotification textNotification = new TextNotification("Congratulations", "Your raise has been improved.", "Wanda Shanda", "Verizon");
    textNotification.showStatus();
        try {
            Object emailNotificationClone = emailNotification.clone();
            System.out.println("Clone result is: " + emailNotification.equals(emailNotificationClone));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}

