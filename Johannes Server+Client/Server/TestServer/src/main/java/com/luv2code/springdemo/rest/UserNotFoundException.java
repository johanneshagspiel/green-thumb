package com.luv2code.springdemo.rest;

<<<<<<< .merge_file_a11760
/**
 * The type User not found exception.
 */
public class UserNotFoundException extends RuntimeException {

    /**
     * Instantiates a new User not found exception.
     */
    public UserNotFoundException() {
	}

    /**
     * Instantiates a new User not found exception.
     *
     * @param message the message
     */
    public UserNotFoundException(String message) {
		super(message);
	}

    /**
     * Instantiates a new User not found exception.
     *
     * @param cause the cause
     */
    public UserNotFoundException(Throwable cause) {
		super(cause);
	}

    /**
     * Instantiates a new User not found exception.
     *
     * @param message the message
     * @param cause   the cause
     */
    public UserNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

    /**
     * Instantiates a new User not found exception.
     *
     * @param message            the message
     * @param cause              the cause
     * @param enableSuppression  the enable suppression
     * @param writableStackTrace the writable stack trace
     */
    public UserNotFoundException(String message, Throwable cause, boolean enableSuppression,
=======
public class UserNotFoundException extends RuntimeException {

	public UserNotFoundException() {
	}

	public UserNotFoundException(String message) {
		super(message);
	}

	public UserNotFoundException(Throwable cause) {
		super(cause);
	}

	public UserNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public UserNotFoundException(String message, Throwable cause, boolean enableSuppression,
>>>>>>> .merge_file_a10056
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
