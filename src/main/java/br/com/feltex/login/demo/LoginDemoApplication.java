package br.com.feltex.login.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@SpringBootApplication
@EnableWebSecurity
public class LoginDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginDemoApplication.class, args);
	}

    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {

        return httpSecurity
            .authorizeHttpRequests(auth -> {
                auth.requestMatchers("/").permitAll();
                auth.requestMatchers("/favicon.ico").permitAll();
                auth.anyRequest().authenticated();
            }).oauth2Login(Customizer.withDefaults())
            .formLogin(Customizer.withDefaults())
            .build();

    }

}
