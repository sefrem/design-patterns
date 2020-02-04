package com.company.facade;

public class Main {
    public static void main(String[] args) {
        var notificationService = new NotificationService();
        notificationService.send("Hello world", "address");
    }
}
