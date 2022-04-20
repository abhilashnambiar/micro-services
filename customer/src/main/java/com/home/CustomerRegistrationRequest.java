package com.home;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email
) {
}
