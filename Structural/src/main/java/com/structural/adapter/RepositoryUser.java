package com.structural.adapter;

class RepositoryUser {

    private final String fullName;
    private final String contactEmail;

    public RepositoryUser(String fullName, String contactEmail) {
        this.fullName = fullName;
        this.contactEmail = contactEmail;
    }

    public String getFullName() {
        return fullName;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    // Save method to save RepositoryUser instance
    public void save() {
        System.out.println("Saving user: " + fullName + " with email: " + contactEmail);
    }
}