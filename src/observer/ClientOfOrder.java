package observer;

public class ClientOfOrder implements Observer{
    private String clientName;
    private Shipment shipment;

    public ClientOfOrder(String clientName) {
        this.clientName=clientName;
    }

    @Override
    public void update() {
        String messages = (String) shipment.getUpdate(this);
        if(messages == null){
            System.out.println(clientName + ": No messages.");
        }else
            System.out.println(clientName + ": Received message: " + messages);
    }

    @Override
    public void setShipments(Shipment shipments) {
        this.shipment = shipments;

    }
}
