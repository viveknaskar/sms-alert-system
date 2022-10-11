package com.viveknaskar.smsalertsystem.controller;

import com.viveknaskar.smsalertsystem.domain.AlertMessage;
import com.viveknaskar.smsalertsystem.domain.User;
import com.viveknaskar.smsalertsystem.service.AlertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class AlertController {

    @Autowired
    AlertService alertService;

    @PostMapping("/sms")
    public ResponseEntity<String> sendAlertMessage(@RequestBody AlertMessage alertMessage) {

        User user = new User("Bruce", "Wayne", "+12025550001");
        alertService.sendSMS(user, alertMessage);
        return new ResponseEntity<>("Alert Message Sent Successfully!", HttpStatus.OK);

    }
}
