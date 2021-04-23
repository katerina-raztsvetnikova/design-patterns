package observer;

public class Main {
    public static void main(String[] args) {

        Message message = new Message();

        Observer client1 =  new ClientOfOrder("Ivana ");
        Observer client2 =  new ClientOfOrder("Simeon ");
        Observer client3 =  new ClientOfOrder("Nikola ");
        Observer client4 =  new ClientOfOrder("Silvia ");


        message.receiveMessage(client1);
        message.receiveMessage(client2);
        message.receiveMessage(client3);
        message.receiveMessage(client4);


        client1.setShipments(message);
        client2.setShipments(message);
        client3.setShipments(message);
        client4.setShipments(message);


        client1.update();
        client2.update();
        client3.update();
        client4.update();

        message.printMessage(" You have new shipment.");
    }
}
