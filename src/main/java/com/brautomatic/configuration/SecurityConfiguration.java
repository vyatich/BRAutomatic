package com.brautomatic.configuration;

import com.brautomatic.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserServiceImpl userService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf()
                .disable()
                .authorizeRequests()
                .antMatchers("/registration/","/auth").permitAll()
                .anyRequest().authenticated();
        http
                .formLogin()
                    .loginPage("/auth")
                    .usernameParameter("userName")
                    .passwordParameter("password")
                    .defaultSuccessUrl("/disk/all")
                    .permitAll()
                    .and()
                .logout().logoutUrl("/logout").logoutSuccessUrl("/auth?logout").permitAll();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
            .userDetailsService(userService)
            .passwordEncoder(NoOpPasswordEncoder.getInstance()); //todo change encoder
    }
}
