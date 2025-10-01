/**
 * Observable : c'est l'objet qu'on observe
 * Message Publisher
 *
 */

public interface Observable {
    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers(Message message);
}
