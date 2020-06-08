//package com.example.demo.Config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//import java.beans.ConstructorProperties;
//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.cors().and().csrf().disable().
//                authorizeRequests()
//                .antMatchers("/token/*").permitAll()
////                .antMatchers("/api/dashboard/").permitAll()
//                .antMatchers("/v2/api-docs", "/configuration/ui", "/swagger-resources", "/configuration/security", "/swagger-ui.html", "/webjars/**").permitAll()
//                .antMatchers("/api/**").permitAll()
//                .antMatchers("/api/transaction/recent-transactions").permitAll()
//                .antMatchers("/*").permitAll()
//                .antMatchers("/assets/*").permitAll()
//                //.antMatchers("/api/product/image/****").permitAll()
//                ///api/product/image/chips/lays/1585405177003lays.jpg
////                .antMatchers("/api/*").hasAuthority("ADMIN")
//                // .antMatchers("/madinaapps/*").permitAll()
//                .anyRequest().authenticated();
//
//
//    }
//
//
//
//}