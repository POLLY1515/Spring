package br.com.poliana.exception;

import java.util.Date;

public record ExceptionResponse(Date timestamp, String message, String details) {

}
