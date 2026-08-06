package co.istad.chhaya.elearning.config.auditing;

import co.istad.chhaya.elearning.security.AuthUtils;
import org.jspecify.annotations.NullMarked;
import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class JpaEntityAuditorAware implements AuditorAware<String> {

    @NullMarked
    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.ofNullable(AuthUtils.extractUserId());
    }

}
