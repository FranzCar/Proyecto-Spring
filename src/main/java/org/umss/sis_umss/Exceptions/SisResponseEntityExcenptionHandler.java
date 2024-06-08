package org.umss.SIS_UMSS.Exceptions;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
@RestController
public class SisResponseEntityExcenptionHandler extends ResponseEntityExceptionHandler {

    private final View error;

    public SisResponseEntityExcenptionHandler(View error) {
        this.error = error;
    }

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<SisExceptionResponse> handleAllException(Exception ex, WebRequest request) throws Exception{
        SisExceptionResponse sisExceptionResponse = new SisExceptionResponse(new Date(), "Internal Server Error", request.getDescription(false));

        return new ResponseEntity(sisExceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(NotFoundException.class)
    public final ResponseEntity<SisExceptionResponse> handleNotFoundException(Exception ex, WebRequest request) throws Exception{
        SisExceptionResponse sisExceptionResponse = new SisExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false));

        return new ResponseEntity(sisExceptionResponse, HttpStatus.NOT_FOUND);
    }

    @Override
    protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex, HttpHeaders headers, HttpStatusCode status, WebRequest request) {
        Map<String, String> validationErrors = new HashMap<>();
        ex.getAllErrors().forEach(error -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            validationErrors.put(fieldName, errorMessage);
        });
        SisValidationExceptionResponse sisExceptionResponse = new SisValidationExceptionResponse(new Date(), ex.getMessage(), request.getDescription(false), validationErrors);
        return new ResponseEntity<>(sisExceptionResponse, HttpStatus.BAD_REQUEST);
    }
}
