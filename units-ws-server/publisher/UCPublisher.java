package publisher;

import service.UCServiceImpl;

import javax.xml.ws.Endpoint;

public class UCPublisher {

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8083/UC", new UCServiceImpl());
    }
}
