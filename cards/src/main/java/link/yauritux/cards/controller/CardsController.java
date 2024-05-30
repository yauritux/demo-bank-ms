package link.yauritux.cards.controller;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Pattern;
import link.yauritux.cards.constants.CardsConstants;
import link.yauritux.cards.dto.CardsDto;
import link.yauritux.cards.dto.ResponseDto;
import link.yauritux.cards.service.ICardsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/v1", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class CardsController {

    private final ICardsService cardsService;

    @PostMapping("/{mobileNumber}")
    public ResponseEntity<ResponseDto> createCard(
            @Valid @PathVariable
            @Pattern(regexp = "(^$|[0-9]{10,})", message = "Mobile number must be at least 10 digits")
            String mobileNumber) {
        cardsService.createCard(mobileNumber);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new ResponseDto(CardsConstants.STATUS_201, CardsConstants.MESSAGE_201));
    }

    @GetMapping("/{mobileNumber}")
    public ResponseEntity<CardsDto> fetchCardDetails(
            @Pattern(regexp = "(^$|[0-9]{10,})", message = "Mobile number must be at least 10 digits")
            @PathVariable String mobileNumber) {
        CardsDto cardsDto = cardsService.fetchCard(mobileNumber);
        return ResponseEntity.status(HttpStatus.OK).body(cardsDto);
    }

    @PutMapping
    public ResponseEntity<ResponseDto> updateCardDetails(
            @Valid @RequestBody CardsDto cardsDto) {
        boolean isUpdated = cardsService.updateCard(cardsDto);
        if (isUpdated) {
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(new ResponseDto(CardsConstants.STATUS_200, CardsConstants.MESSAGE_200));
        }
        return ResponseEntity
                .status(HttpStatus.EXPECTATION_FAILED)
                .body(new ResponseDto(CardsConstants.STATUS_417, CardsConstants.MESSAGE_417_UPDATE));
    }

    @DeleteMapping("/{mobileNumber}")
    public ResponseEntity<ResponseDto> deleteCardDetails(
            @PathVariable @Pattern(regexp = "(^$|[0-9]{10,})", message = "Mobile number must be at least 10 digits")
            String mobileNumber
    ) {
        boolean isDeleted = cardsService.deleteCard(mobileNumber);
        if (isDeleted) {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(new ResponseDto(CardsConstants.STATUS_200, CardsConstants.MESSAGE_200));
        }
        return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED)
                .body(new ResponseDto(CardsConstants.STATUS_417, CardsConstants.MESSAGE_417_DELETE));
    }
}
