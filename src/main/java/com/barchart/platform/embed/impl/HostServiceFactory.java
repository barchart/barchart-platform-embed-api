package com.barchart.platform.embed.impl;

import com.barchart.platform.embed.api.HostLifecycleService;
import com.barchart.platform.embed.exception.EmbedderException;
import com.barchart.platform.embed.exception.EmbedderExceptionCause;

public final class HostServiceFactory {

	private final static String KLAZ_NAME = "com.barchart.platform.embed.impl.HostLifecycleProvider";

	private static HostLifecycleService instance;

	/**
	 * load from TCCL context
	 */
	public final synchronized static HostLifecycleService getInstance()
			throws EmbedderException {

		if (instance != null) {
			return instance;
		}

		try {

			final ClassLoader loader = Thread.currentThread()
					.getContextClassLoader();

			/** note: class is fully initialized */
			final Class<?> klaz = Class.forName(KLAZ_NAME, true, loader);

			instance = (HostLifecycleService) klaz.newInstance();

			return instance;

		} catch (final Throwable e) {

			throw new EmbedderException(e,
					EmbedderExceptionCause.PLATFORM_NOT_PRESENT);

		}

	}

}
