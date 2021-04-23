package observer;

public interface Shipment {
    public void receiveMessage(Observer observer);
    public void notReceiveMessage(Observer observer);

    public void notifyObservers();
    public Object getUpdate(Observer observer);
}
