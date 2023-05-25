package com.example.webservice2.service;

import com.example.webservice2.exceptions.NotEnoughMoneyException;
import com.example.webservice2.model.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public PaymentDetails processPayment(){
        throw new NotEnoughMoneyException();
    }
}
