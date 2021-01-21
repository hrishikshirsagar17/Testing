package com.spring.rest;

import java.util.Collections;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class RestaurantManagementApplication {

  public static void main(String[] args) {
    SpringApplication.run(RestaurantManagementApplication.class, args);
  }

  @Bean
  public Docket swaggerConfiguration() {
    return new Docket(DocumentationType.SWAGGER_2).select().paths(PathSelectors.ant("/zonions/**"))
        .apis(RequestHandlerSelectors.basePackage("com.spring.rest")).build().apiInfo(apiInfo());
  }

  public ApiInfo apiInfo() {
    return new ApiInfo("RESTAURANT MANAGEMENT API", "Deals with the management of restaurants",
        "1.0", "Open Source API",
        new Contact("Zonions", "http://localhost:8080/zonions/**", "zonions@food.com"),
        "Copyrights belongs to zonions", "http://localhost:8080/zonions/**",
        Collections.emptyList());
  }
}
