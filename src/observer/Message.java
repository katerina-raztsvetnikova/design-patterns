package observer;

import java.util.ArrayList;
import java.util.List;

public class Message implements Shipment {

    private List<Observer> observers;
    private String message;
    private boolean changed;

    public Message(){
        this.observers=new ArrayList<>();
    }

    @Override
    public void receiveMessage(Observer observer) {

        if(!observers.contains(observer)){
                observers.add(observer);
            }else {
            System.out.println("No observer.");
        }
    }

    @Override
    public void notReceiveMessage(Observer observer) {
            observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        List<Observer> observers;
            if (!changed)
                return;
            observers = new ArrayList<>(this.observers);
            this.changed=false;

        for (Observer object : observers) {
            object.update();
        }

    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }

    public void printMessage(String message){
        System.out.println("Courier company sends message: "+ message);
        this.message=message;
        this.changed=true;
        notifyObservers();
    }
}
