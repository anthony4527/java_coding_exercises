package com.techreturners.exercise001;

public class User {
    private String userName;
    private String operatingSystem;
    private String type;

    public User(String userName, String operatingSystem, String type) {
        this.userName = userName;
        this.operatingSystem = operatingSystem;
        this.type = type;
    }

    public String getUsername() {
        return userName;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public String getType() {
        return type;
    }
}