package com.company.facade;

public class NotificationService {
    public void send(String message, String target) {
        var server = new NotificationServer();
        var connect = server.connect("ip");
        var authToken = server.authenticate("ID", "key");
        server.send(authToken, new Message(message), target);
        connect.disconnect();
    }
}
