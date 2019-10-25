package com.dlsl.queue.exception;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.MailException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * 
 * <p>
 * REST API wide exception handler
 * </p>
 * 
 * 
 * @author Alexis Cuison
 *
 * @version
 * 
 */
@Order(Ordered.HIGHEST_PRECEDENCE)
@ControllerAdvice
public class ApiExceptionHandler extends ResponseEntityExceptionHandler {

	/**
	 * 
	 * Logging component
	 * 
	 */
	protected final Log LOG = LogFactory.getLog(getClass());

	@ExceptionHandler(MailException.class)
	protected ResponseEntity handleRuntimeException(MailException mex) {
		LOG.error("Error sending email: " + mex.getMessage(), mex);
		return new ResponseEntity(mex.getMessage(), HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(RuntimeException.class)
	protected ResponseEntity handleRuntimeException(RuntimeException rex) {
		LOG.error("Error while processing command: " + rex.getMessage(), rex);
		return new ResponseEntity(rex.getMessage(), HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(NullPointerException.class)
	protected ResponseEntity handleNullPointerExcpetion(
			NullPointerException npex) {
		LOG.error("Error while processing command: " + npex.getMessage(), npex);
		return new ResponseEntity(npex.getMessage(), HttpStatus.BAD_REQUEST);

	}
	
	@ExceptionHandler(Exception.class)
	protected ResponseEntity handleNullPointerExcpetion(
			Exception npex) {
		LOG.error("Error while processing command: " + npex.getMessage(), npex);
		return new ResponseEntity(npex.getMessage(), HttpStatus.BAD_REQUEST);

	}

}
