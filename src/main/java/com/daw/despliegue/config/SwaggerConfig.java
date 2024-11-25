package com.daw.despliegue.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    /**
     * Configuración de la documentación personalizada
     */
    @Bean
    public OpenAPI customOpenApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("Despliegue API")
                        .description("Una API de prueba para despliegue de aplicaciones web")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Gabriel")
                                .email("gabrielrl2004@gmail.com"))
                );
    }
}
