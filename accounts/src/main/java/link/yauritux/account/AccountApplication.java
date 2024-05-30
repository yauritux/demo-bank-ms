package link.yauritux.account;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import link.yauritux.account.dto.AccountsContactInfoDto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = AccountsContactInfoDto.class)
@OpenAPIDefinition(
		info = @Info(
				title = "Accounts microservice REST API Documentation",
				description = "SimpleBank Accounts microservice REST API Documentation",
				version = "v1",
				contact = @Contact(
						name = "Yauri Attamimi",
						email = "yaurigneel@gmail.com",
						url = "https://yauritux.link"
				),
				license = @License(
						name = "MIT",
						url = "https://opensource.org/license/mit"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "SimpleBank Accounts microservice REST API Documentation",
				url = "https://blog.yauritux.link"
		)
)
public class AccountApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountApplication.class, args);
	}

}
