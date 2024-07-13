package com.prasad.bookmyshow.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Payment extends BaseModel {
    private String referenceNumber;
    private int amount;
    private PaymentProvider paymentProvider;
    private PaymentMode paymentMode;
    private PaymentStatus paymentStatus;
}
