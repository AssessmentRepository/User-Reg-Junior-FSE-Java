package com.userRegistrationJWT.model;

public enum Role {
    Admin, User;
    
    public String authority() {
        return "ROLE_" + this.name();
    }
}
