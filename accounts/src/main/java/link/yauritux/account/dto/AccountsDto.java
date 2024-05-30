package link.yauritux.account.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Accounts information"
)
public class AccountsDto {

    @NotEmpty(message = "AccountNumber cannot be null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "AccountNumber must be 10 digits")
    @Schema(
            description = "Account number of the Customer",
            example = "9755533219"
    )
    private Long accountNumber;

    @NotEmpty(message = "AccountType cannot be null or empty")
    @Schema(
            description = "Customer's account type", example = "Savings"
    )
    private String accountType;

    @NotEmpty(message = "BranchAddress cannot be null or empty")
    @Schema(
            description = "Bank branch address",
            example = "Jakarta"
    )
    private String branchAddress;
}
