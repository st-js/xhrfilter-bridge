package org.stjs.bridge.xhrfilter;

import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.functions.Callback0;
import org.stjs.javascript.functions.Callback1;
import org.stjs.javascript.functions.Callback2;
import org.stjs.javascript.jquery.AjaxParams;
import org.stjs.javascript.jquery.JQueryXHR;

@SyntheticType
public interface XHRFilter  {
	/**
	 *
	 * Executed before the request is sent, you may add headers or change the options any way you want
	 *
	 * @param settings The ajax settings, add your options here
	 */
	public void before(AjaxParams settings);

	/**
	 * Executed when the request was successful, you can implement any logic here, even asynchronous.<br /><br />
	 *
	 * You can call <code>reject(String reason)</code> if you decide the request should not pass.
	 *
	 * @param jqXHR The internal XHR Request
	 * @param data The data received from the request
	 * @param settings The original request parameters
	 * @param reject Reject This request
	 * @param next Go to the next filter
	 */
	public void done(JQueryXHR jqXHR, Object data, AjaxParams settings, Callback1<String> reject, Callback0 next);

	/**
	 * Executed when the request failed, you can implement any logic here, even asynchronous.<br /><br />
	 *
	 * You can call <code>resolve(Object data, jqXHR jqXHR)</code> if you decide the request should not pass.
	 *
	 * @param jqXHR The internal XHR Request
	 * @param thrownError The error received from the serve
	 * @param settings The original request parameters
	 * @param resolve Resolve This request
	 * @param next Go to the next filter
	 */
	public void fail(JQueryXHR jqXHR, String thrownError, AjaxParams settings, Callback2<Object, JQueryXHR> resolve, Callback0 next);
}
