package publisher;

import service.UCServiceImpl;

import javax.xml.ws.Endpoint;

public class UCPublisher {

    public static void main(String[] args) {
        System.out.println("start");
        Endpoint.publish("http://localhost:1234/Service", new UCServiceImpl());
    }
}
