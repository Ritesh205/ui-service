package com.technovate.uiservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication
@EnableDiscoveryClient
public class UiServiceApplication {

	public static void main(final String[] args) {
		SpringApplication.run(UiServiceApplication.class, args);
	}

	@EnableWebSecurity
	static class WebSecurityConfig extends WebSecurityConfigurerAdapter {

		@Override
		public void configure(final HttpSecurity httpSecurity) throws Exception {
			httpSecurity.csrf().ignoringAntMatchers("/eureka/**")
					.disable().authorizeRequests().antMatchers("/").permitAll();
			super.configure(httpSecurity);
		}
	}
}
