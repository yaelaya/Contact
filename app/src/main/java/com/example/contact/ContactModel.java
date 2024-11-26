package com.example.contact;

public class ContactModel {
    private final String displayName;
    private final String number;

    public ContactModel(String displayName, String number) {
        this.displayName = displayName;
        this.number = number;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getNumber() {
        return number;
    }
}
