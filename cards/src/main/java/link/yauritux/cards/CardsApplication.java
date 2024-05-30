package link.yauritux.cards;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import link.yauritux.cards.dto.CardsContactInfoDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = {CardsContactInfoDto.class})
@OpenAPIDefinition(
        info = @Info(
                title = "Cards microservice REST API Documentation",
                description = "Cards microservice REST API Documentation",
                version = "v1",
                contact = @Contact(
                        name = "Yauri Attamimi",
                        email = "yauritux@gmail.com",
                        url = "https://yauritux.link"
                ),
                license = @License(
                        name = "MIT",
                        url = "https://yauritux.link"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "Cards microservice REST API documentation",
                url = "https://yauritux.link"
        )
)
public class CardsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CardsApplication.class, args);
    }

}
