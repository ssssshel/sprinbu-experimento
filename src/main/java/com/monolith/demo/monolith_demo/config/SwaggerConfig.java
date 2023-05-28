// package com.monolith.demo.monolith_demo.config;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;

// import springfox.documentation.builders.ApiInfoBuilder;
// import springfox.documentation.builders.PathSelectors;
// import springfox.documentation.builders.RequestHandlerSelectors;
// import springfox.documentation.service.ApiInfo;
// import springfox.documentation.service.Contact;
// import springfox.documentation.spi.DocumentationType;
// import springfox.documentation.spring.web.plugins.Docket;
// import springfox.documentation.swagger2.annotations.EnableSwagger2;

// @Configuration
// @EnableSwagger2
// public class SwaggerConfig {
// @Bean
// public Docket api() {
// return new Docket(DocumentationType.SWAGGER_2)
// .apiInfo(getApiInfo())
// .select()
// .apis(RequestHandlerSelectors.basePackage("com.monolith.demo.monolith_demo"))
// .paths(PathSelectors.ant("/v1/**"))
// .build();
// }

// private ApiInfo getApiInfo() {
// return new ApiInfoBuilder()
// .title("Monolith Demo")
// .description("Monolith Demo")
// .version("1.0.0")
// .contact(new Contact("Angel Arteaga", "", ""))
// .build();
// }
// }
