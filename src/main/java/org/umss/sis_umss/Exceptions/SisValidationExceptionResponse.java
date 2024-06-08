package org.umss.SIS_UMSS.Exceptions;

import java.util.Date;
import java.util.Map;

public class SisValidationExceptionResponse extends SisExceptionResponse{
    private Map<String, String> fieldErrors;

    SisValidationExceptionResponse(Date timeStamp, String message, String path, Map<String, String> fieldErrors) {
        super(timeStamp, message, path);
        this.fieldErrors = fieldErrors;
    }

    public Map<String, String> getFieldErrors() {
        return fieldErrors;
    }
}
