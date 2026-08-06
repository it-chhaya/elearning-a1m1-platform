package co.istad.chhaya.elearning.features.auth.dto;

import lombok.Builder;

@Builder
public record RegisterResponse(
        String id,
        String username,
        String email,
        String firstName,
        String lastName,
        String gender,
        String biography
) {
}
