package com.luv2code.springdemo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

<<<<<<< .merge_file_a02076
/**
 * The type User rest exception handler.
 */
=======
>>>>>>> .merge_file_a17132
@ControllerAdvice
public class UserRestExceptionHandler {

	// Add an exception handler for CustomerNotFoundException
<<<<<<< .merge_file_a02076

    /**
     * Handle exception response entity.
     *
     * @param exc the exc
     * @return the response entity
     */
    @ExceptionHandler
=======
	
	@ExceptionHandler
>>>>>>> .merge_file_a17132
	public ResponseEntity<UserErrorResponse> handleException(UserNotFoundException exc) {
		
		// create CustomerErrorResponse
		
		UserErrorResponse error = new UserErrorResponse(
											HttpStatus.NOT_FOUND.value(),
											exc.getMessage(),
											System.currentTimeMillis());
		
		// return ResponseEntity
		
		return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
	}
	
	
	// Add another exception handler ... to catch any exception (catch all)

<<<<<<< .merge_file_a02076
    /**
     * Handle exception response entity.
     *
     * @param exc the exc
     * @return the response entity
     */
    @ExceptionHandler
=======
	@ExceptionHandler
>>>>>>> .merge_file_a17132
	public ResponseEntity<UserErrorResponse> handleException(Exception exc) {
		
		// create CustomerErrorResponse
		
		UserErrorResponse error = new UserErrorResponse(
											HttpStatus.BAD_REQUEST.value(),
											exc.getMessage(),
											System.currentTimeMillis());
		
		// return ResponseEntity
		
		return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
	}
	
}





