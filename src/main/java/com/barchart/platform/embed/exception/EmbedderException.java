package com.barchart.platform.embed.exception;

/**
 */
@SuppressWarnings("serial")
public class EmbedderException extends Exception {

	private final EmbedderExceptionCause cause;

	public EmbedderException(final EmbedderExceptionCause cause) {
		this.cause = cause;
	}

	public EmbedderExceptionCause getPlatfromCause() {
		return cause;
	}

}
