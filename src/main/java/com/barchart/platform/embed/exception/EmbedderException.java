package com.barchart.platform.embed.exception;

/**
 */
@SuppressWarnings("serial")
public class EmbedderException extends Exception {

	private final EmbedderExceptionCause cause;

	public EmbedderException(final EmbedderExceptionCause cause) {

		this.cause = cause;

	}

	public EmbedderException(final Throwable e,
			final EmbedderExceptionCause cause) {

		super(e);

		this.cause = cause;

	}

	public EmbedderExceptionCause getPlatformCause() {

		return cause;

	}

}
