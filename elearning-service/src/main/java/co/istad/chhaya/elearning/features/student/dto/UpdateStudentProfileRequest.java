package co.istad.chhaya.elearning.features.student.dto;

import co.istad.chhaya.elearning.features.auth.dto.GenderOptions;

public record UpdateStudentProfileRequest(
        String firstName,
        String lastName,
        GenderOptions gender,
        String biography,
        String profilePicture,
        String university,
        String major,
        String phoneNumber,
        String githubLink,
        String facebookLink
) {
}
