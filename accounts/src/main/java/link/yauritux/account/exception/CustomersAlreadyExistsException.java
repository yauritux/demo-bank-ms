package link.yauritux.account.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class CustomersAlreadyExistsException extends RuntimeException {

    public CustomersAlreadyExistsException(String message) {
        super(message);
    }
}
