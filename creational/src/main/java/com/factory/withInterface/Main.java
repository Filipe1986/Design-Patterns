package com.factory.withInterface;

public class Main {
    public static void main(String[] args) {
        ClientCode client1 = new ClientCode(new PayPalPaymentServiceFactory());
        client1.processPayment(100.0);

        ClientCode client2 = new ClientCode(new StripePaymentServiceFactory());
        client2.processPayment(150.0);
    }
}
