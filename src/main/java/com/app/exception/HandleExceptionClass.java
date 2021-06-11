package com.app.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.app.config.ErrorMessage;

@RestControllerAdvice
public class HandleExceptionClass {
//	@ResponseStatus(HttpStatus.UNAUTHORIZED)
//	@ExceptionHandler(AccessDeniedException.class)
//	public ErrorMessage handleUnauthorized(Exception exception, WebRequest request) {
//		return new ErrorMessage(new Date(System.currentTimeMillis()), 401, "Unauthorized");
//	}
}
