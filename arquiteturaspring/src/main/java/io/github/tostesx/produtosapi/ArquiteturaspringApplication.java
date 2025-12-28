package io.github.tostesx.produtosapi;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;



@SpringBootApplication
public class ArquiteturaspringApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ArquiteturaspringApplication.class, args);
		SpringApplicationBuilder builder = 
				new SpringApplicationBuilder(ArquiteturaspringApplication.class);
		
		
		builder.profiles("prodution");
		builder.bannerMode(Banner.Mode.OFF);
		builder.run(args);
		
		/* 		Low level Spring Architecture
			var produtosRepository = applicationContext.getBean("Your repository");
			builder.properties("spring.datasource.url=jdbc://your database");
		 */
		
		//Contexts of application
		ConfigurableApplicationContext applicationContext = builder.context();
		
		ConfigurableEnvironment environment = applicationContext.getEnvironment();
		String applicationName = environment.getProperty("spring.application.name");
		System.out.println("Name of Application: " + applicationName);
		
	}

}
