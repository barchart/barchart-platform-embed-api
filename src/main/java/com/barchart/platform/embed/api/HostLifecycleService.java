package com.barchart.platform.embed.api;

import com.barchart.platform.embed.exception.EmbedderException;

/**
 * 
 */
public interface HostLifecycleService {

	/**
	 * do we have host libraries available for activation?
	 * 
	 * non-blocking call
	 */
	boolean isHostAvailable();

	/**
	 * is host fully activated?
	 * 
	 * non-blocking call
	 */
	boolean isHostRunning();

	//

	/**
	 * activate host or fail
	 * 
	 * blocking call
	 */
	void hostActivate() throws EmbedderException;

	/**
	 * deactivate host or fail
	 * 
	 * blocking call
	 */
	void hostDeactivate() throws EmbedderException;

	/**
	 * obtain platform manager interface
	 * 
	 * non-blocking call
	 * 
	 * TODO can return non-functional dummy implementation?
	 * 
	 * TODO can return null?
	 */
	HostManagerService getHostManager() throws EmbedderException;

}
