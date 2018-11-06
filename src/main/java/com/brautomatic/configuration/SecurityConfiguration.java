package com.brautomatic.configuration;

import com.brautomatic.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserServiceImpl userService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf()
                .disable();
        http
                .authorizeRequests()
                .antMatchers("/registration/signup","/auth").permitAll()
                .anyRequest().authenticated();
        http
                .formLogin()
                    .loginPage("/auth")
                    .usernameParameter("login")
                    .defaultSuccessUrl("/disk/all")
                    .permitAll()
                    .and()
                .logout().logoutUrl("/logout").logoutSuccessUrl("/auth?logout").permitAll();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .userDetailsService(userService);
    }

}
