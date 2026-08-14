package co.istad.chhaya.gatewaybff;

import lombok.Builder;

@Builder
public record AuthenticatedResponse(
        Boolean isAuthenticated,
        String username
) {
}
