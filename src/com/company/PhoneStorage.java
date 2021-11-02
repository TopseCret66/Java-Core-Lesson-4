package com.company;

import java.util.*;

class PhoneStorage {
    private final Map<String, Set<String>> phoneNumbersByLastName = new HashMap<>();

    public void add(String lastName, String phoneNumber) {
        Set<String> phoneNumbers = phoneNumbersByLastName.getOrDefault(lastName, new HashSet<>());
        phoneNumbers.add(phoneNumber);
        phoneNumbersByLastName.put(lastName, phoneNumbers);
    }

    public Set<String> get(String lastName) {
        return phoneNumbersByLastName.get(lastName);
    }
}