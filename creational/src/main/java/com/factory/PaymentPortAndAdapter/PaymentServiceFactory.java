package com.factory.PaymentPortAndAdapter;

public class PaymentServiceFactory {
    private PaymentServicePort getPaymentService(String provider) {
        if (provider == null) {
            return null;
        }
        if (provider.equalsIgnoreCase("PAYPAL")) {
            return new PayPalPaymentServiceAdapter();
        } else if (provider.equalsIgnoreCase("STRIPE")) {
            return new StripePaymentServiceAdapter();
        }
        return null;
    }

    public static void main(String[] args) {
        PaymentServiceFactory paymentServiceFactory = new PaymentServiceFactory();

        // Get an instance of PayPalPaymentService and call its processPayment method
        PaymentServicePort paymentService1 = paymentServiceFactory.getPaymentService("PAYPAL");
        paymentService1.processPayment(100.00);

        // Get an instance of StripePaymentService and call its processPayment method
        PaymentServicePort paymentService2 = paymentServiceFactory.getPaymentService("STRIPE");
        paymentService2.processPayment(200.00);
    }
}