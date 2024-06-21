package com.example.GPECapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests((authoR) -> authoR
                        .requestMatchers("/home", "/").permitAll()
                        .requestMatchers("/alarms", "/preview").hasAnyRole("USER", "ADMIN")
                        .requestMatchers("/register/**", "/users/**").hasRole("ADMIN")
                        .anyRequest().authenticated()
                )
                .formLogin((form)->form.loginPage("/login")
                        .defaultSuccessUrl("/alarms")
                        .permitAll()
                ).logout((logO)->logO
                        .permitAll()
                        .logoutUrl("/logout")
                        .logoutSuccessUrl("/login?logout")
                );
        return http.build();
    }

    @Bean
    public PasswordEncoder passwordEncoder() {

        return new BCryptPasswordEncoder();
    }

}
