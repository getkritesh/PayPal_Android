package com.kritesh.paypal.paymentservice.model;

/**
 * Created by kritesh on 7/7/2017.
 */

public class PaymentVerificationResponse {
    String msg;
    int status;

    public PaymentVerificationResponse(String msg, int status) {
        this.msg = msg;
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public int getStatus() {
        return status;
    }
}
