package org.umss.SIS_UMSS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import javax.sql.DataSource;

@SpringBootApplication
public class SisUmssApplication {

	public static void main(String[] args) {
		SpringApplication.run(SisUmssApplication.class, args);
	}

}
