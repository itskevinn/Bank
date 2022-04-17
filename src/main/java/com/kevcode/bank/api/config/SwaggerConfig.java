package com.kevcode.bank.api.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket apiDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.kevcode.bank.api.controllers"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(getApiInfo())
                ;
    }

    private ApiInfo getApiInfo() {
        return new ApiInfo(
                "Tickets API",
                "This API provides some actions to the customers to " +
                        "create a ticket so the employees can fix it.",
                "1.0",
                "http://notengoterminos.com",
                new Contact("KevCode", "https://github.com/itskevinn", "kvnpntn@gmail.com"),
                "LICENSE",
                "I DON'T HAVE ANY LICENSE",
                Collections.emptyList());
    }
}