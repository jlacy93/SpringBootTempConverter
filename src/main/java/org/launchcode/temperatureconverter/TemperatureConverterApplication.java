package org.launchcode.temperatureconverter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class TemperatureConverterApplication {

	public static void main(String[] args) {
		SpringApplication.run(TemperatureConverterApplication.class, args);
	}

}
