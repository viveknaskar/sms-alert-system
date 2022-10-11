package com.viveknaskar.smsalertsystem.service.impl;

import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import com.viveknaskar.smsalertsystem.domain.AlertMessage;
import com.viveknaskar.smsalertsystem.domain.User;
import com.viveknaskar.smsalertsystem.service.AlertService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AlertServiceImpl implements AlertService {

    @Value("${twilio.phone.number}")
    private String phoneNumber;

    /**
     * This method sends SMS using the static creator() method
     * Message.creator() has multiple implementations
     * For our scenario, it takes 3 parameters:
     * phoneNumber of the receiver as the first param
     * phoneNumber of the sender as the second param (Twilio number)
     * message (or alertMessage) as the third param
     */
    @Override
    public void sendSMS(User user, AlertMessage alertMessage) {
        Message.creator(new PhoneNumber(user.getPhoneNumber()),
                new PhoneNumber(phoneNumber),
                alertMessage.getMessage()).create();
    }
}