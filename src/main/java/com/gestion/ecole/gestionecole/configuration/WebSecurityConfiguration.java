package com.gestion.ecole.gestionecole.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class WebSecurityConfiguration {

    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
