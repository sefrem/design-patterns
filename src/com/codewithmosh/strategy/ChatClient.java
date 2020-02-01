package com.codewithmosh.strategy;

public class ChatClient {

    public void send(String message, EncryptionAlgorithm encryptionAlgorithm) {
        System.out.println(message);
        encryptionAlgorithm.encrypt(message);

        System.out.println("Sending the encrypted message...");
    }
}
