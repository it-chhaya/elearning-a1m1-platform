package co.istad.chhaya.gatewaybff;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.oauth2.client.oidc.web.server.logout.OidcClientInitiatedServerLogoutSuccessHandler;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.ReactiveClientRegistrationRepository;
import org.springframework.security.web.server.SecurityWebFilterChain;
import org.springframework.security.web.server.authentication.logout.ServerLogoutSuccessHandler;

@Configuration
@EnableWebFluxSecurity
@RequiredArgsConstructor
public class SecurityConfig {

    private final ReactiveClientRegistrationRepository clientRegistrationRepository;


    @Bean
    public SecurityWebFilterChain bffFilterChain(ServerHttpSecurity http) {

        http.authorizeExchange(
                endpoints -> endpoints
                        .pathMatchers("/profile").authenticated()
                        .pathMatchers("/dashboard/**").hasAnyRole("ADMIN", "INSTRUCTOR")
                        .anyExchange().permitAll()
        );

        http.httpBasic(ServerHttpSecurity.HttpBasicSpec::disable);
        http.formLogin(ServerHttpSecurity.FormLoginSpec::disable);
        http.csrf(ServerHttpSecurity.CsrfSpec::disable);

        // Required OAuth2 Client
        http.oauth2Login(Customizer.withDefaults());

        // Configure ODIC Logout
        http.logout(oauth2 -> oauth2
                .logoutSuccessHandler(oidcLogoutSuccessHandler())
        );

        return http.build();
    }


    private ServerLogoutSuccessHandler oidcLogoutSuccessHandler() {
        OidcClientInitiatedServerLogoutSuccessHandler oidcLogoutSuccessHandler =
                new OidcClientInitiatedServerLogoutSuccessHandler(this.clientRegistrationRepository);
        oidcLogoutSuccessHandler.setPostLogoutRedirectUri("{baseUrl}");

        return oidcLogoutSuccessHandler;
    }

}
