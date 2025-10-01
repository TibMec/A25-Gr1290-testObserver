//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.



public class Main {
    public static void main(String[] args) {
        var s1 = new MessageSubscriber1();
        var s2 = new MessageSubscriber2();
        var s3 = new MessageSubscriber3();

        var p = new MessagePublisher();

        p.addObserver(s1);
        p.addObserver(s2);
        p.notifyObservers(new Message("Premier message"));

        p.removeObserver(s1);
        p.addObserver(s3);
        p.notifyObservers(new Message("Deuxieme message"));

    }
}