package Examples.GoodExample;

import Examples.BadExample.SmsSender;

public class NotificationSender {


    private Sender sender;

    public NotificationSender(Sender sender) {
        this.sender = sender;
    }

    public NotificationSender() {
    }

    public void DoSomeMessage(Sender sender,String message){
        sender.SendMessage(message);
    }

}
