package co.istad.chhaya.gatewaybff;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@Slf4j
public class AuthController {

    @GetMapping("/secured")
    public AuthenticatedResponse checkAuthentication(
            @AuthenticationPrincipal OAuth2User principal
    ) {
        boolean isAuthenticated;
        String username;
        if (principal == null) {
            log.error("Unauthorized access");
            isAuthenticated = false;
            username = "Unauthorized user";
        } else {
            isAuthenticated = true;
            username = principal.getAttribute("preferred_username");
        }
        return AuthenticatedResponse.builder()
                .isAuthenticated(isAuthenticated)
                .username(username)
                .build();
    }

}
