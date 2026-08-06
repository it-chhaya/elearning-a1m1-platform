package co.istad.chhaya.elearning.features.student.dto;

import lombok.Builder;

@Builder
public record StudentProfileResponse(
        String userId,
        String email,
        String firstName,
        String lastName,
        String gender,
        String profilePicture,
        String biography,
        String university,
        String major,
        String phoneNumber,
        String githubLink,
        String facebookLink
) {
}
