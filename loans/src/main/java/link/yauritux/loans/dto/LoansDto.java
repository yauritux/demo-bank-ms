package link.yauritux.loans.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Schema(
        name = "Loans",
        description = "Schema to hold Loan information"
)
@Data
public class LoansDto {

    @NotEmpty(message = "Mobile number cannot be null or empty")
    @Pattern(regexp = "(^$|[0-9]{10,15})", message = "Mobile number must be between 10 to 15 digits")
    @Schema(
            description = "Mobile number of the Customer", example = "6282225251437"
    )
    private String mobileNumber;

    @NotEmpty(message = "Loan number cannot be null or empty")
    @Pattern(regexp = "(^$|[0-9]{12})", message = "Loan number must be 12 digits")
    @Schema(
            description = "Loan number of the customer", example = "548732457654"
    )
    private String loanNumber;

    @NotEmpty(message = "Loan type cannot be null or empty")
    @Schema(
            description = "Type of Loan", example = "Home Loan"
    )
    private String loanType;

    @Positive(message = "Total loan amount should be greater than zero")
    @Schema(
            description = "Total loan amount", example = "100000"
    )
    private int totalLoan;

    @PositiveOrZero(message = "Total amount paid should equal or greater than zero")
    @Schema(
            description = "Total paid amount", example = "1000"
    )
    private int amountPaid;

    @PositiveOrZero(message = "Total outstanding amount should be equal or greater than zero")
    @Schema(
            description = "Total outstanding amount against a loan", example = "90000"
    )
    private int outstandingAmount;
}
