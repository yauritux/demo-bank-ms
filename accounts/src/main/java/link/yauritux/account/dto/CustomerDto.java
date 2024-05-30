package link.yauritux.account.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold Customer and Account information"
)
public class CustomerDto {

    @NotEmpty(message = "Name cannot be null or empty")
    @Size(min = 5, max = 30, message = "The length of the customer name should be between 5 and 30")
    @Schema(
            description = "Name of the Customer",
            example = "Yauri Attamimi"
    )
    private String name;

    @NotEmpty(message = "Email address cannot be null or empty")
    @Email(message = "Email address should be a valid email")
    @Schema(
            description = "Customer's email address",
            example = "yauri@example.com"
    )
    private String email;

    @Pattern(regexp = "(^$|[0-9]{10,})", message = "Mobile number must be at least 10 digits")
    @Schema(
            description = "Customer's mobile number",
            example = "6283374388888"
    )
    private String mobileNumber;

    @Schema(
            description = "Accounts details of the Customer"
    )
    private AccountsDto accountsDto;
}
