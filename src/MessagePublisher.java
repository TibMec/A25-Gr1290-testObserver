import java.util.ArrayList;
import java.util.List;

public class MessagePublisher implements Observable{
    private final List<Observer> observers = new ArrayList<>();

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers(Message message) {
        for (Observer o : observers) {
            o.update(message);
        }
    }
}
