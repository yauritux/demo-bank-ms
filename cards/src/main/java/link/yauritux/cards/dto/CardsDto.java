package link.yauritux.cards.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

@Data
@Schema(
        name = "Cards",
        description = "Schema to hold Card information"
)
public class CardsDto {

    @NotEmpty(message = "Mobile Number cannot be null or empty")
    @Pattern(regexp = "(^$|[0-9]{10,})", message = "Mobile number must be at least 10 digits")
    @Schema(
            description = "Mobile number of Customer", example = "91774385766655"
    )
    private String mobileNumber;

    @NotEmpty(message = "Card Number cannot be null or empty")
    @Pattern(regexp = "(^$|[0-9]{12})", message = "Card Number must be 12 digits")
    @Schema(
            description = "Card number of the Customer", example = "100646930341"
    )
    private String cardNumber;

    @NotEmpty(message = "CardType cannot be null or empty")
    @Schema(
            description = "Type of the card", example = "Credit Card"
    )
    private String cardType;

    @Positive(message = "Total card limit should be greater than zero")
    @Schema(
            description = "Total limit available against a card", example = "100000"
    )
    private int totalLimit;

    @PositiveOrZero(message = "Total amount used should be equal or greater than zero")
    @Schema(
            description = "Total amount used by the Customer", example = "1000"
    )
    private int amountUsed;

    @PositiveOrZero(message = "Total available amount should be equal or greater than zero")
    @Schema(
            description = "Total available amount against a card", example = "90000"
    )
    private int availableAmount;
}
