package com.viveknaskar.smsalertsystem.service;

import com.viveknaskar.smsalertsystem.domain.AlertMessage;
import com.viveknaskar.smsalertsystem.domain.User;
import org.springframework.stereotype.Service;

@Service
public interface AlertService {
    void sendSMS(User user, AlertMessage message);
}
