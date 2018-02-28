package com.bolsadeideas.springboot.app;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.nio.file.Paths;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO Auto-generated method stub
		super.addResourceHandlers(registry);

		String resourcePath = Paths.get("uploads").toAbsolutePath().toUri().toString();

		registry.addResourceHandler("/uploads/**")
		//.addResourceLocations(resourcePath);
		.addResourceLocations("file:/home/zafiron/Imágenes/linkysell/");
		
	}

	
}
