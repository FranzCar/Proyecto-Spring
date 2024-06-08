package org.umss.SIS_UMSS.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException {
    public NotFoundException(String university, String uuid) {
        super(String.format("NotFound: %s not found with uuid=%s", university, uuid));
    }
}
