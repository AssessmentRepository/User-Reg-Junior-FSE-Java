package com.userRegistrationJWT.model;

/**
 * Enumerated {@link User} roles.
 * 
 * @author krishnarjun.pampana
 *
 * 
 */
public enum Role {
    Admin, User;
    
    public String authority() {
        return "ROLE_" + this.name();
    }
}
