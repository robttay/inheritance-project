/**
 * Created by roberttaylor on 7/19/17.
 */

import java.time.LocalDateTime;


public class Notification {

    private LocalDateTime createdAt;
    private String subject;
    private String body;
    protected String status;

    public Notification(String subject, String body) {
        this.createdAt = LocalDateTime.now();
        this.subject = subject;
        this.body = body;
        this.status = "unread";

    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setBody(String body) {
        this.body = body;
    }


    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public  void transport() {
        throw new NoTransportException();
    }

    public String showStatus() {
        System.out.println("Status: " + status);
        return status;
    }
    protected void textPrinter() {
        System.out.println("Some text");
    }
}
