package com.userRegistrationJWT.dto;


public enum Role {
    Admin, User;
    
    public String authority() {
        return "ROLE_" + this.name();
    }
}
