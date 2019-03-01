package com.citiustech.springBootHibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringBootHibernateIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHibernateIntegrationApplication.class, args);
	}

}
