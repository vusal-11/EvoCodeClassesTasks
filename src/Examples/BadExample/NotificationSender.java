package Examples.BadExample;

public class NotificationSender {
    private EmailSender emailSender;
    private NotificationSender notificationSender;

    public void Send(EmailSender emailSender){
        emailSender.SendMessage();
    }

    public void Send(SmsSender smsSender){
        smsSender.SendMessage();
    }


}
