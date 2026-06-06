package br.com.aris.aris_api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
public class SecurityConfig {

    @Bean
<<<<<<< HEAD
    public SecurityFilterChain securityFilterChain(
            HttpSecurity http) throws Exception {
=======
    public SecurityFilterChain securityFilterChain(HttpSecurity http)
            throws Exception {
>>>>>>> 3ece82d4d4b40682a5c4fa896c4e36022de98b9e

        return http
                .csrf(csrf -> csrf.disable())
<<<<<<< HEAD
                .authorizeHttpRequests(auth ->
                        auth.anyRequest().permitAll()
                )
                .build();
=======
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().permitAll()
                );

        return http.build();
>>>>>>> 3ece82d4d4b40682a5c4fa896c4e36022de98b9e
    }
}