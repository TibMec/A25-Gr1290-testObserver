public class MessageSubscriber1 implements Observer {
    @Override
    public void update(Message message) {
        System.out.println("Message received: " + message.getMessageContent());
    }
}
