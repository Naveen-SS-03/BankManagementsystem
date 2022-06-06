package com.capg.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestController
@ControllerAdvice
public class GloabalExceptionHandler extends ResponseEntityExceptionHandler {
	
	//@ExceptionHandler(RecordNotFoundException.class)
	//public ResponseEntity<ErrorDetails> handleRecorDNotFoundException(RecordNotFoundException ex, WebRequest wr) {
		//ErrorDetails er = new ErrorDetails(new Date(), ex.getMessage(), wr.getDescription(false));
		//return new ResponseEntity<ErrorDetails>(er, HttpStatus.NOT_FOUND);
	//}
}

