package com.userRegistrationJWT.security.auth.jwt.extractor;

/**
 * Implementations of this interface should always return raw base-64 encoded
 * representation of JWT Token.
 * 
 * @author krishnarjun.pampana
 */
public interface TokenExtractor {
    public String extract(String payload);
}
