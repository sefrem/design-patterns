package com.codewithmosh.strategy;

public class Main {
    public static void main(String[] args) {
        var chatClient = new ChatClient();
        chatClient.send("Here is my message", new DesEncryption());
        chatClient.send("Here is my message", new AesEncryption());
    }
}
