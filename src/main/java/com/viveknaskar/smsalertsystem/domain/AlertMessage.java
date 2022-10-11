package com.viveknaskar.smsalertsystem.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AlertMessage {

    @JsonProperty("alert-message")
    private String message;

    public AlertMessage() {
    }

    public AlertMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
