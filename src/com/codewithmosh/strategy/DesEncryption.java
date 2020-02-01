package com.codewithmosh.strategy;

public class DesEncryption implements EncryptionAlgorithm {
    @Override
    public void encrypt(String message) {
        System.out.println("Encrypting using DES");
    }
}
