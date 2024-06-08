package org.umss.SIS_UMSS.Exceptions;

import java.util.Date;

public class SisExceptionResponse {
    private Date timeStamp;
    private String message;

    public SisExceptionResponse(Date timeStamp, String message, String description) {
        this.timeStamp = timeStamp;
        this.message = message;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public String getMessage() {
        return message;
    }
}
