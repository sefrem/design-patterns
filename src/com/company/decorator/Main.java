package com.company.decorator;

public class Main {
    public static void main(String[] args) {
        storeCreditCard(new EncryptedCloudStream(new CompressedCloudStream(new CloudStream())));
    }

    public static void storeCreditCard(Stream stream) {
        stream.write("4444-5555-6666-8888");
    }
}
