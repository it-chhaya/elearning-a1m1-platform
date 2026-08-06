package co.istad.chhaya.gatewaybff;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
@EnableWebFluxSecurity
public class SecurityConfig {

    @Bean
    public SecurityWebFilterChain bffFilterChain(ServerHttpSecurity http) {

        http.authorizeExchange(
                endpoints -> endpoints.anyExchange().authenticated()
        );

        http.httpBasic(ServerHttpSecurity.HttpBasicSpec::disable);
        http.formLogin(ServerHttpSecurity.FormLoginSpec::disable);
        http.csrf(ServerHttpSecurity.CsrfSpec::disable);

        // Required OAuth2 Client
        http.oauth2Login(Customizer.withDefaults());

        return http.build();
    }

}
