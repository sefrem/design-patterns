package com.codewithmosh.strategy;

public class AesEncryption implements EncryptionAlgorithm {
    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting using AES");
    }
}
