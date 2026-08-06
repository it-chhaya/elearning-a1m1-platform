package co.istad.chhaya.elearning.features.auth.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record RegisterRequest(
        @NotBlank(message = "Username is required")
        @Size(min = 3, max = 255)
        String username,

        @NotBlank(message = "Password is required")
        @Size(min = 8, max = 255)
        String password,

        @NotBlank(message = "Confirmed password is required")
        @Size(min = 8, max = 255)
        String confirmedPassword,

        @NotBlank(message = "Email is required")
        @Email
        @Size(max = 255)
        String email,

        @NotBlank(message = "First name is required")
        @Size(max = 255)
        String firstName,

        @NotBlank(message = "Last name is required")
        @Size(max = 255)
        String lastName,

        @NotNull(message = "Gender is required")
        GenderOptions gender,

        String biography
) {
}
