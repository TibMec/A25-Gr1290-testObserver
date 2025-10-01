public class MessageSubscriber2 implements Observer {
    @Override
    public void update(Message message) {
        System.out.println("O2 :: Message received: " + message.getMessageContent());
    }
}
