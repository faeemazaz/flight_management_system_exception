package com.flightbook.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class FlightNotFoundExceptionHandler {
	
	@ExceptionHandler(FlightNotFoundException.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	@ResponseBody
	public String handleFlightNotFoundException(FlightNotFoundException flightNotFoundException)
	{
		return flightNotFoundException.getMessage();
	}
}
