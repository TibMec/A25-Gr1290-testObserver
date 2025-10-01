public class MessageSubscriber3 implements Observer {
    @Override
    public void update(Message message) {
        System.out.println("O3 :: Message received: " + message.getMessageContent());
    }
}
