package Examples.GoodExample;

import Hierarchy.SalariedEmployee;

public class Main {
    public static void main(String[] args) {


        NotificationSender notificationSender=new NotificationSender();
        SmsSender smsSender=new SmsSender();
        EmailSender emailSender=new EmailSender();
        notificationSender.DoSomeMessage(smsSender,"Sms Sender");
        notificationSender.DoSomeMessage(emailSender,"Email Sender");


    }
}
