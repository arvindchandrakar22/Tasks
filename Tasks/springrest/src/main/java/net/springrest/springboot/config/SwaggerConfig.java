package net.springrest.springboot.config;

import com.google.common.collect.Lists;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("net.springrest.springboot.controller")) // Replace with your base package
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiDetails());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("A basic Spring REST API to perform CRUD operation.")
                .description("This spring boot project has been created to perform CRUD operation on an Entity (Employee)")
                .version("1.0.0")
                .build();
    }
    private ApiInfo apiDetails(){
        return new ApiInfo(
                "A basic Spring REST API to perform CRUD operation.",
                "This spring boot project has been created to perform CRUD operation on an Entity (Employee)",
                "1.0",
                "Free to use",
                new springfox.documentation.service.Contact("Arvind Chandrakar","https://app.ezyhire.com/","arch9805@gmail.com"),
                "API License",
                "https://app.ezyhire.com/",
                Collections.emptyList());
    }
}
